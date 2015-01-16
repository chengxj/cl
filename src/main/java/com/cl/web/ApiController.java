package com.cl.web;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cl.dto.ActivitiesDTO;
import com.cl.dto.RegistrationDTO;
import com.cl.dto.RegistrationDetailDTO;
import com.cl.request.ActivitiesRequest;
import com.cl.request.RegistrationDetailRequest;
import com.cl.request.RegistrationRequest;
import com.cl.service.CommonService;

@Controller
public class ApiController {
	
	 @Autowired
	 private CommonService commonService;	
	 
	 @RequestMapping(value = "/api/search_activities", method = RequestMethod.POST)
	 @ResponseBody
	 public ActivitiesDTO searchActivities(@RequestBody ActivitiesRequest request) {
		  return commonService.searchActivities(request);
	 }
	 
	 @RequestMapping(value = "/api/get_registration_detail", method = RequestMethod.POST)
	 @ResponseBody
	 public RegistrationDetailDTO getRegistrationDetail(@RequestBody RegistrationDetailRequest request){
		 return commonService.getRegistrationDetail(request);
	 }
	 
	 @RequestMapping(value = "/api/add_registration", method = RequestMethod.POST)
	 @ResponseBody
	 public RegistrationDTO addRegistration(@RequestBody RegistrationRequest request){
		 return commonService.addRegistration(request);
	 }
	 
	 @RequestMapping(value = "/api/edit_registration", method = RequestMethod.POST)
	 @ResponseBody
	 public RegistrationDTO editRegistration(@RequestBody RegistrationRequest request){
		 return commonService.editRegistration(request);
	 }
	 
	 @RequestMapping(value = "/api/delete_registration", method = RequestMethod.POST)
	 @ResponseBody
	 public void deleteRegistration(@RequestBody RegistrationRequest request) {
		 commonService.deleteRegistration(request);
	 }	 
	 
}