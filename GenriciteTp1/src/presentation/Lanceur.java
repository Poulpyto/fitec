/**
 * 
 */
package presentation;

import metier.Objet1;
import metier.Objet2;
import metier.Objet3;

/**
 * @author Stagiaire
 *
 */
public class Lanceur {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Objet1<String, Double, Float> o1 = new Objet1<>("toto", 10.1 , 15f);
		//String x = o1.getX();
		//Double y = o1.getY();
		//Float z = o1.getZ();
		System.out.println("valeur x :" + o1.getX() + " valeur y : " + o1.getY() + " valeur z : " + o1.getZ());
	
		Objet2<Float, String, Float> o2 = new Objet2<>(12f, "titi", 10.2f);
		//Float x1 = o2.getX();
		//String y1 = o2.getY();
		//Float z1 = o2.getZ();
		System.out.println("valeur x :" + o2.getX() + " valeur y : " + o2.getY() + " valeur z : " + o2.getZ());
		
		Objet3<String, String, Integer> o3 = new Objet3<>("tutu", "tata", 15);
		//String x2 = o3.getX();
		//String y2 = o3.getY();
		//Integer z2 = o3.getZ(); commentaires evités grace a la genericité
		System.out.println("valeur x :" + o3.getX() + " valeur y : " + o3.getY() + " valeur z : " + o3.getZ());
	}

}
