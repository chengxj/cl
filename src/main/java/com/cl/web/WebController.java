package com.cl.web;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WebController {

	@RequestMapping(value = "/example")
	public String activities(Model model) {
		return "demo";
	}

	@RequestMapping(value = "/example/logout")
	public String logout(Model model) {
		Subject subject = SecurityUtils.getSubject();
		if (subject.isAuthenticated()) {
			subject.logout(); // session 会销毁，在SessionListener监听session销毁，清理权限缓存
		}
//		return "redirect:http://172.16.2.196:8088/cas/login?service=http://172.16.2.196:8080/example/authentication";
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