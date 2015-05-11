package com.cl.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cl.dto.RelicDTO;
import com.cl.dto.RelicsDTO;
import com.cl.entity.Relic;
import com.cl.service.CommonService;

@Controller
public class ApiController {
	
	 @Autowired
	 private CommonService commonService;
	 
	 @RequestMapping(value = "/api/relic", method = RequestMethod.GET)
	 @ResponseBody
	 public RelicsDTO getRelics(@RequestParam(value = "page", required = false) int page,
			 @RequestParam(value = "start", required = false) int start,
			 @RequestParam(value = "limit", required = false) int limit,
			 @RequestParam(value = "filter", required = false) String filter) {
		 return commonService.getRelics(page, start, limit, filter);
	 }
	 
	 @RequestMapping(value = "/relic", method = RequestMethod.GET)
	 @ResponseBody
	 public RelicDTO getRelic(@RequestParam(value = "id", required = true) long id) {
		 return commonService.getRelic(id);
	 }	 
	 
	 /**
	  * 创建一条新的文物信息
	  * @param relic
	  * @return
	  */
	 @RequestMapping(value = "/api/relic", method = RequestMethod.POST)
	 @ResponseBody
	 public RelicDTO createRelic(@RequestBody Relic relic) {
		 RelicDTO dto = new RelicDTO();
		 Relic re = new Relic();
		 dto.data = re;
		 return dto;
	 }	
	 
	 /**
	  * 更新文物信息
	  * @param id
	  * @return
	  */
	 @RequestMapping(value = "/api/relic/{id}", method = RequestMethod.PUT)
	 @ResponseBody
	 public RelicDTO updateRelic(@PathVariable String id) {
		 RelicDTO dto = new RelicDTO();
		 
		 return dto;
	 }
	 
	 /**
	  * 删除文物信息
	  * @param id
	  * @return
	  */
	 @RequestMapping(value = "/api/relic/{id}", method = RequestMethod.DELETE)
	 @ResponseBody
	 public RelicDTO deleteRelic(@PathVariable String id) {
		 RelicDTO dto = new RelicDTO();
		 
		 return dto;
	 }
	 
}