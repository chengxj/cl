package rmi;

import java.util.List;

import dao.hb.YwSgdxx;
import dao.hb.YwXmxx;

public class ProjectArchives implements java.io.Serializable  {
	
	private static final long serialVersionUID = 1L;
	
	private YwXmxx xmxx;
	private List<YwSgdxx> sgdxx;
	
	public YwXmxx getXmxx() {
		return xmxx;
	}
	
	public void setXmxx(YwXmxx xmxx) {
		this.xmxx = xmxx;
	}
	
	public List<YwSgdxx> getSgdxx() {
		return sgdxx;
	}
	
	public void setSgdxx(List<YwSgdxx> sgdxx) {
		this.sgdxx = sgdxx;
	}	

}