package com.cl.shiro;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationException;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.cas.CasAuthenticationException;
import org.apache.shiro.cas.CasRealm;
import org.apache.shiro.cas.CasToken;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.subject.SimplePrincipalCollection;
import org.apache.shiro.util.CollectionUtils;
import org.apache.shiro.util.StringUtils;
import org.jasig.cas.client.authentication.AttributePrincipal;
import org.jasig.cas.client.validation.Assertion;
import org.jasig.cas.client.validation.TicketValidationException;
import org.jasig.cas.client.validation.TicketValidator;
import org.springframework.beans.factory.annotation.Autowired;

import com.cl.dao.SearchDao;
import com.cl.entity.common.Role;
import com.cl.entity.common.Team;
import com.cl.entity.common.User;

public class ShiroRealm extends CasRealm {
	
	  @Autowired
	  private SearchDao searchDao;

	// custom permissions
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
		if (principals == null) {
			throw new AuthorizationException("PrincipalCollection method argument cannot be null.");  
		}
		String name = (String) getAvailablePrincipal(principals);
		List<String> roles = new ArrayList<String>();
        User user = searchDao.getUser(name);
        if (user!=null && user.getUsername().equals(name)) {
            if (user.getRoles() != null && user.getRoles().size()>0) { 
            	for(Role role : user.getRoles()){
            		roles.add(role.getRole());
            	}
            }
        } else {
            throw new AuthorizationException();
        }        
        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
        info.addRoles(roles);
        return info;
	}
	
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        CasToken casToken = (CasToken) token;
        if (token == null) {
            return null;
        }        
        String ticket = (String)casToken.getCredentials();
        if (!StringUtils.hasText(ticket)) {
            return null;
        }
        TicketValidator ticketValidator = ensureTicketValidator();
        try {
            // contact CAS server to validate service ticket
            Assertion casAssertion = ticketValidator.validate(ticket, getCasService());
            // get principal, user id and attributes
            AttributePrincipal casPrincipal = casAssertion.getPrincipal();
            String userId = casPrincipal.getName();

            Map<String, Object> attributes = casPrincipal.getAttributes();
            // refresh authentication token (user id + remember me)
            casToken.setUserId(userId);   
            
            // 设置SESSION
            setSession(userId);
            
            String rememberMeAttributeName = getRememberMeAttributeName();
            String rememberMeStringValue = (String)attributes.get(rememberMeAttributeName);
            boolean isRemembered = rememberMeStringValue != null && Boolean.parseBoolean(rememberMeStringValue);
            if (isRemembered) {
                casToken.setRememberMe(true);
            }
            // create simple authentication info
            List<Object> principals = CollectionUtils.asList(userId, attributes);
            PrincipalCollection principalCollection = new SimplePrincipalCollection(principals, getName());
            return new SimpleAuthenticationInfo(principalCollection, ticket);
        } catch (TicketValidationException e) { 
            throw new CasAuthenticationException("Unable to validate ticket [" + ticket + "]", e);
        }
    }
    
    /**
     * set session
     * @param userId
     */
    private void setSession(String userId) {
        Session session = SecurityUtils.getSubject().getSession();
        User user = searchDao.getUser(userId);
        Team team = user.getTeam();        
        session.setAttribute("orgId", team.getId());// 部门ID
        session.setAttribute("orgName", team.getTeam());// 部门
        session.setAttribute("userId", user.getUserid());// 用户名
        session.setAttribute("userName", user.getUsername());// 用户名
    }    

}
