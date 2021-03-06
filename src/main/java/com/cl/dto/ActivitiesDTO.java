package com.cl.dto;

import java.util.List;
import com.cl.entity.Activities;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ActivitiesDTO {
	
	public List<Activities> activities;
	public long num;
	public int pageNum;

}
