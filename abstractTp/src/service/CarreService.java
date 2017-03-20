package service;
import metier.Carre;
import metier.Form;

public class CarreService extends FormService{

	/*public CarreService() {
		// TODO Auto-generated constructor stub
	}*/
	
	@Override
	public float perimetre(Form c){
		return ((Carre) c).getCote() * 4;
	}
	@Override
	public float surface(Form c) {
		return ((Carre) c).getCote() * ((Carre) c).getCote();
	}

}
