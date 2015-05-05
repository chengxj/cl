package com.cl.web;

import javax.servlet.http.HttpServletRequest;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.LockedAccountException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.crypto.hash.Md5Hash;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.cl.entity.common.User;

@Controller
public class WebController {

	@RequestMapping(value = "/example")
	public String activities(Model model) {
		return "index";
	}
	
	@RequestMapping(value = "/example/login", method = RequestMethod.GET)
	public String login(Model model, HttpServletRequest request) throws Exception {
		if(SecurityUtils.getSubject().isAuthenticated()){
			return "redirect:/example";
		}
		return "login";
	}
	
	@RequestMapping(value = "/example/login", method = RequestMethod.POST)
	public String login(User loginUser, Model model, HttpServletRequest request) {
		String loginName = loginUser.getUserid();
		String passWord = new Md5Hash(loginUser.getPassword()).toString();
		UsernamePasswordToken token = new UsernamePasswordToken(loginName, passWord);
		String rememberme = request.getParameter("rememberme");
		if (null!=rememberme && !"".equals(rememberme)) {
			token.setRememberMe(true);
		} else {
			token.setRememberMe(false);
		}
		try {
			Subject user = SecurityUtils.getSubject();
			user.login(token);
		} catch (UnknownAccountException uae) {
			model.addAttribute("message", "账号不存在!");
			return "login";
		} catch (IncorrectCredentialsException ice) {
			model.addAttribute("message", "密码错误!");
			return "login";
		} catch (LockedAccountException lae) {
			model.addAttribute("message", "账号被锁定!");
			return "login";
		} catch (Exception e) {
			model.addAttribute("message", "未知错误,请联系管理员.");
			return "login";
		}
		return "redirect:/example";
	}

	@RequestMapping(value = "/example/logout")
	public String logout(Model model) {
		Subject subject = SecurityUtils.getSubject();
		if (subject.isAuthenticated()) {
			subject.logout(); // session 会销毁，在SessionListener监听session销毁，清理权限缓存
		}
		return "redirect:/example";
	}

	@RequestMapping(value = "/example/error")
	public String error(Model model) {
		return "error-404";
	}

	@RequestMapping(value = "/example/registration/{activities_id}")
	public String registration(@PathVariable String activities_id, Model model) {
		model.addAttribute("activities_id", activities_id);
		return "registration";
	}

}