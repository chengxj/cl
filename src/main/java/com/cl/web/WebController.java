package com.cl.web;

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
	  
	  @RequestMapping(value = "/example/error")
	  public String error(Model model) {
		  return "error";
	  }
	  
	  @RequestMapping(value = "/example/registration/{activities_id}")
	  public String registration(@PathVariable String activities_id, Model model) {
	    model.addAttribute("activities_id", activities_id);
	    return "registration";
	  }

}