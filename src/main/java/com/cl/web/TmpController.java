package com.cl.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cl.dto.ClassDTO;
import com.cl.dto.ServiceApiDTO;
import com.cl.dto.common.BaseDTO;
import com.cl.request.ServiceApiRequest;
import com.cl.service.CommonService;

@Controller
public class TmpController {
	
	 @Autowired
	 private CommonService commonService;	
	 
	 @RequestMapping(value = "/api/get_api_struction", method = RequestMethod.POST)
	 @ResponseBody
	 public ClassDTO getApiStruction(@RequestBody ServiceApiRequest ServiceRequest) throws ClassNotFoundException {
		 return commonService.getApiById(ServiceRequest);
	 }
	 
	 @RequestMapping(value = "/api/get_apis", method = RequestMethod.POST)
	 @ResponseBody
	 public ServiceApiDTO getTableApis() {
		 return commonService.getApis();
	 }
	 
	 @RequestMapping(value = "/api/table", method = RequestMethod.POST)
	 @ResponseBody
	 public BaseDTO execApi(@RequestBody ServiceApiRequest ServiceRequest) {
		 
		 
		 return null;
	 }
	 
}