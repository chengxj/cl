package com.cl;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import rmi.ProjectArchives;
import rmi.ProjectArchivesAPI;
import dao.hb.YwSgdxx;
import dao.hb.YwXmxx;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"file:src/main/webapp/WEB-INF/spring/root-context.xml"})
public class HessianTest extends AbstractJUnit4SpringContextTests {
	
	public <T> T getBean(Class<T> type) {
		return applicationContext.getBean(type);
	}

	public Object getBean(String beanName) {
		return applicationContext.getBean(beanName);
	}

	protected ApplicationContext getContext() {
		return applicationContext;
	}
	
	@Test
	public void clientService() {
		ProjectArchivesAPI api= (ProjectArchivesAPI)getBean("serviceClient");
		ProjectArchives obj = new ProjectArchives();
		YwXmxx xmObj = new YwXmxx();
		xmObj.setXmbh("123test");
		obj.setXmxx(xmObj);
		List<YwSgdxx> sgdxx_list = new ArrayList<YwSgdxx>();		
		obj.setSgdxx(sgdxx_list);
		boolean test = api.createProjectArchives(obj);
		System.out.println("test001:"+test);
	}

}
