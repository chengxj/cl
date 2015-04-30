package com.cl.web.common;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.DefaultHandlerExceptionResolver;

@Controller
public class WebHandlerExceptionResolver extends DefaultHandlerExceptionResolver {
	
	  protected Logger log = LoggerFactory.getLogger(this.getClass());
	  
	  @Override
	  public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler, Exception e) {
		  
		  
		  return null;
	  }

}
