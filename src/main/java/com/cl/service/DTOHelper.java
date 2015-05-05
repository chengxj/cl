package com.cl.service;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;
import com.cl.dto.ClassDTO;
import com.cl.dto.ClassStruction;
import com.cl.dto.RegistrationDTO;
import com.cl.entity.Registration;
import com.cl.entity.ServiceConfig;

@Component
public class DTOHelper {
	
	public RegistrationDTO buildRegistrationDTO(Registration registration) {
		RegistrationDTO dto = new RegistrationDTO();
		dto.id = registration.getId();
		dto.activities_id = registration.getActivities_id();
		dto.name = registration.getName();
		dto.sex = registration.getSex();
		dto.real_name = registration.getReal_name();
		dto.contact_way = registration.getContact_way();
		dto.emergency_contact = registration.getEmergency_contact();
		dto.emergency_contact_way = registration.getEmergency_contact_way();
		dto.num = registration.getNum();
		dto.equipment_experience_remarks = registration.getEquipment_experience_remarks();
		return dto;
	}
	
	/**
	 * 
	 * @param serviceConfig
	 * @return
	 * @throws ClassNotFoundException
	 */
	public ClassDTO buildClassDTO(ServiceConfig serviceConfig) throws ClassNotFoundException {
		ClassDTO dto = new ClassDTO();
		if (serviceConfig != null) {
			List<ClassStruction> classStructions = new ArrayList<ClassStruction>();
			String className = serviceConfig.getClassName();
			Class<?> apiClass = Class.forName(className);
			Field[] fields = apiClass.getDeclaredFields();
			for (Field field:fields) {
				ClassStruction classStruction = new ClassStruction();
				classStruction.fieldName = field.getName();
				if("serialVersionUID".equals(classStruction.fieldName))
					continue;
				classStruction.fieldType = String.valueOf(field.getGenericType());
				if((classStruction.fieldName).equals(serviceConfig.getPrimaryKey()))
					classStruction.isPrimary = true;
				else 
					classStruction.isPrimary = false;
				classStructions.add(classStruction);
			}
			dto.classStructions = classStructions;
		}
		return dto;
	}

}
