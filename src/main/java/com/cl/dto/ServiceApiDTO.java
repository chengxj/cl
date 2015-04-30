package com.cl.dto;

import java.util.List;
import com.cl.entity.ServiceConfig;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ServiceApiDTO {
	
	public List<ServiceConfig> apis;

}
