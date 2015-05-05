package com.cl.service;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;
import com.cl.dto.ClassDTO;
import com.cl.dto.ClassStruction;
import com.cl.entity.ServiceConfig;

@Component
public class DTOHelper {
	
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
