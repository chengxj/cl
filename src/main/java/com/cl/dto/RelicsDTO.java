package com.cl.dto;

import java.util.List;

import com.cl.dto.common.BaseDTO;
import com.cl.entity.Relic;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RelicsDTO extends BaseDTO{
	
	public List<Relic> data;

}
