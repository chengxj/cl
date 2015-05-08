package com.cl.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cl.dto.ClassDTO;
import com.cl.dto.RelicsDTO;
import com.cl.dto.ServiceApiDTO;
import com.cl.entity.Relic;
import com.cl.request.ServiceApiRequest;
import com.cl.service.CommonService;

@Controller
public class ApiController {
	
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
	 
	 @RequestMapping(value = "/api/relic", method = RequestMethod.POST)
	 @ResponseBody
	 public RelicsDTO getRelics() {
		 return commonService.getRelics();
	 }
	 
	 @RequestMapping(value = "/api/relic/{id}", method = RequestMethod.POST)
	 @ResponseBody
	 public Relic getRelic(@PathVariable String id) {
		 Relic relic = new Relic();
		 relic.setObjId(888);
		 relic.setObjNumber(11);
		 return relic;
	 }	 
	 
	 @RequestMapping(value = "/api/get_relics", method = RequestMethod.POST)
	 @ResponseBody
	 public RelicsDTO searchRelics() {		 
		 return null;
	 }
	 
}