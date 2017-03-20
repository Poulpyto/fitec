package service;
import metier.Ellipse;

public class EllipseService {

	public EllipseService() {
		// TODO Auto-generated constructor stub
	}

	public float perimetre(Ellipse e) {
		float resultat = 0;
		float pcarre = e.getPetitAxe() * e.getPetitAxe();
		float gcarre = e.getGrandAxe() * e.getGrandAxe();
		float sinus, cosinus;
		
		for (int i = 0; i < 1000; i ++){
			sinus = (float) Math.sin(i*Math.PI/2000);
			cosinus = (float) Math.cos(i * Math.PI/2000);
			resultat += Math.sqrt(pcarre * sinus * sinus + gcarre * cosinus * cosinus);
		}
		resultat *= 4*Math.PI/2000;
		return resultat;
	}

	public float surface(Ellipse e) {
		return (float)(Math.PI * e.getPetitAxe() * e.getGrandAxe());
	}



}
