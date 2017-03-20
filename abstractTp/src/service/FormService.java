package service;


import metier.Form;

public abstract class FormService {
	public abstract float perimetre(Form f);
	public abstract float surface(Form f);
	
	public double coefficientEtalement(Form f){
		double lePerimetre = perimetre(f);
		return 16 * surface(f) / (lePerimetre * lePerimetre);
		
	}


}
