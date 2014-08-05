package com.cl.shiro;

import java.util.ArrayList;
import java.util.List;
import org.apache.shiro.authz.AuthorizationException;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.cas.CasRealm;
import org.apache.shiro.subject.PrincipalCollection;


public class ShiroRealm extends CasRealm {

	// custom permissions
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
		if (principals == null) {
			throw new AuthorizationException("PrincipalCollection method argument cannot be null.");  
		}
		String name = (String) getAvailablePrincipal(principals);  
        List<String> roles = new ArrayList<String>();
        // get roles form database
        User user = new User("cxj", "1");
        Role role = new Role("normal");
        user.setRole(role);
        if (user.getName().equals(name)) {
            if (user.getRole() != null) { 
                roles.add(user.getRole().getName());
            }
        } else {
            throw new AuthorizationException();
        }
        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
        info.addRoles(roles);
        return info;
	}

}
