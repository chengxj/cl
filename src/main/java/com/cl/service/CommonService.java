package com.cl.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cl.dao.CommonDao;
import com.cl.dao.SearchDao;
import com.cl.dto.RelicDTO;
import com.cl.dto.RelicsDTO;
import com.cl.entity.Relic;

@Service
public class CommonService {
	
	  protected Logger log = LoggerFactory.getLogger(this.getClass());
	  
	  @Autowired
	  private SearchDao searchDao;
	  
	  @Autowired
	  private CommonDao commonDao;
	  
	  @Autowired
	  private DTOHelper dtoHelper;
	  
	  public RelicsDTO getRelics(int page, int start, int limit, String filter) {
		  RelicsDTO dto = new RelicsDTO();
		  dto.success = true;
		  dto.message = "获取数据成功。";
		  dto.data = searchDao.searchRelics(page, start, limit, filter);
		  return dto;
	  }
	  
	  public RelicDTO getRelic(long id) {
		  RelicDTO dto = new RelicDTO();
		  dto.success = true;
		  dto.message = "获取数据成功。";
		  dto.data = searchDao.getRelic(id);
		  return dto;
	  }
	  
}
