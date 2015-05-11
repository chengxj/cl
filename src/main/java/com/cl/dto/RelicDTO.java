package com.cl.dto;

import com.cl.dto.common.BaseDTO;
import com.cl.entity.Relic;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RelicDTO extends BaseDTO{
	
	public Relic data;

}
