package com.cl.dto;

import java.util.List;

import com.cl.dto.common.BaseDTO;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ClassDTO extends BaseDTO {
	
	public List<ClassStruction> classStructions;	
	
}
