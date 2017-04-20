package pjsf.jsf.exos;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name="mbeanresult", eager=true)
//@RequestScoped
//@ViewScoped
@SessionScoped
//@ApplicationScoped
public class MbeanResult {
	
	private String dataResult = "";

	
	public MbeanResult() {
		System.out.println("mbeanresult constructeur");
	}


	public String getDataResult() {
		return dataResult;
	}


	public void setDataResult(String dataResult) {
		System.out.println("setting dataResult : " + dataResult);
		this.dataResult = dataResult;
	}
	
}
