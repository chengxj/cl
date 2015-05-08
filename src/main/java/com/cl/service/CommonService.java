package com.cl.service;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cl.dao.CommonDao;
import com.cl.dao.SearchDao;
import com.cl.dto.ClassDTO;
import com.cl.dto.RelicsDTO;
import com.cl.dto.ServiceApiDTO;
import com.cl.entity.Relic;
import com.cl.entity.ServiceConfig;
import com.cl.request.ServiceApiRequest;

@Service
public class CommonService {
	
	  protected Logger log = LoggerFactory.getLogger(this.getClass());
	  
	  @Autowired
	  private SearchDao searchDao;
	  
	  @Autowired
	  private CommonDao commonDao;
	  
	  @Autowired
	  private DTOHelper dtoHelper;
	  
	  /**
	   * 
	   * @param request
	   * @return
	   */
	  public ServiceApiDTO getApis() {
		  ServiceApiDTO dto = new ServiceApiDTO();		  
		  dto.apis = searchDao.getApis();
		  return dto;
	  }
	  
	  public ClassDTO getApiById(ServiceApiRequest request) throws ClassNotFoundException {
		  ServiceConfig serviceConfig = searchDao.getApiById(request.serviceId);
		  return dtoHelper.buildClassDTO(serviceConfig);
	  }
	  
	  public RelicsDTO getRelics() {
		  RelicsDTO dto = new RelicsDTO();
		  List<Relic> relics = new ArrayList<Relic>();
		  Relic relic = new Relic();
		  relic.setObjId(888);
		  relic.setObjNumber(11);
		  relics.add(relic);
		  dto.relics = relics;
		  return dto;
	  }
	  
}
