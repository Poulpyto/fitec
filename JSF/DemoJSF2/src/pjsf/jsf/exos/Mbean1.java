package pjsf.jsf.exos;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

@ManagedBean(name="mbean1", eager=true)
@ApplicationScoped
public class Mbean1 {
	
	private String message = "Hello ";
	private String m2= "plop ";
	private int cpt = 0;
	private String data = "";
	private String data2= "";
	private String civilite= "";

	
	public String getCivilite() {
		return civilite;
	}
	public void setCivilite(String civilite) {
		this.civilite = civilite;
	}
	public Mbean1() {
		super();
		System.out.println("constructeur instancié");
	}
	public String getMessage(){
		//cpt++;
		return (message +"compteur: "+ cpt++ + "data= " +data+ ", data2= "+data2);
	}
	public String getM2() {
		return m2;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		System.out.println("setting data : " + data);
		this.data = data;
	}
	public String getData2() {
		return data2;
	}
	public void setData2(String data2) {
		System.out.println("setting data2 : " + data2);
		this.data2 = data2;
		FacesContext ctx = FacesContext.getCurrentInstance();
		ctx.addMessage("laForm:inputData2", new FacesMessage("message inputData2 depuis le bean"));
		ctx.addMessage("laForm:inputData3", new FacesMessage("message inputData3 depuis le bean"));
		ctx.addMessage(null, new FacesMessage("message for all depuis le bean"));
		ctx.addMessage("laFormResult:inputDataResult", new FacesMessage("message inputdataresult depuis le bean"));
	}
	public String getLesDeux() {
		return data + data2;
	}
	public String goConditionnel(){
		if(data.length() < 10)
			return "jsf3result";
		else
			return "jsp3";
	}
	public String testErreur(){
		return "erreur";
	}

}
	
