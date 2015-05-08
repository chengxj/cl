package com.cl.jsonp;

import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.view.AbstractView;

public class MappingJsonpView extends AbstractView {

	@Override
	protected void renderMergedOutputModel(Map<String, Object> model,
			HttpServletRequest request, HttpServletResponse response) throws Exception {
		String callback = request.getParameter("callback");
		StringBuffer buf = new StringBuffer();
		buf.append(callback);
		buf.append("(");
		buf.append("{'relics':[{'objId':888,'author':null,'className':null,'classa':null,'classiii':null,'colorMode':null,'description':null,'docAuthor':null,'era':null,'eraBegin':0,'eraEnd':0,'generateEra':null,'grade':null,'introduction':null,'keywords':null,'lastUpdate':null,'material':null,'note':null,'notesnum':0,'notesstr':null,'objAuthor':null,'objName':null,'objNo':null,'objNumber':11,'objProdarea':null,'objsize':null,'origin':null,'showFrom':null,'showLocation':null,'showTo':null,'unearthed':null}]}");
		buf.append(");");
		response.setContentType("application/javascript;charset=UTF-8");
		response.getOutputStream().write(buf.toString().getBytes());
		response.getOutputStream().flush();
	}

}
