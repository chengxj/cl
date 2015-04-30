package com.cl.dto;

import java.util.List;

import com.cl.dto.common.BaseDTO;
import com.cl.entity.Activities;
import com.cl.entity.Registration;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RegistrationDetailDTO extends BaseDTO {
	
	public Activities activities;
	public List<Registration> registrations;

}
