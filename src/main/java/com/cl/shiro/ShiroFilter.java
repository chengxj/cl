package com.cl.shiro;

import java.io.IOException;
import java.security.Principal;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;

public class ShiroFilter implements Filter {

	@Override
	public void destroy() {

	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		HttpServletRequest httpRequest = (HttpServletRequest) request;
		HttpServletResponse httpResponse = (HttpServletResponse) response;
		Principal principal = httpRequest.getUserPrincipal();
//		Principal principal = (Principal)SecurityUtils.getSubject().getPrincipal();
		if (principal != null) {
			Subject subjects = SecurityUtils.getSubject();
			User user = new User();
			user.setName("cxj");
            user.setPassword("1");
            user.setRole(new Role("normal"));            
            if (user.getName().equals(principal.getName())) {
                UsernamePasswordToken token = new UsernamePasswordToken(user.getName(), user.getPassword());  
                subjects = SecurityUtils.getSubject();  
                subjects.login(token);  
                subjects.getSession();  
            } else {
                if (subjects != null) {  
                    subjects.logout();  
                }  
            }  
        }
        chain.doFilter(httpRequest, httpResponse);
	}

	@Override
	public void init(FilterConfig config) throws ServletException {
		
	}

}
