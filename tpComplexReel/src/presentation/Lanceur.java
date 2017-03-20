/**
 * 
 */
package presentation;

import metier.Reel;
import service.IComplexService;
import service.IReelService;
import service.ServiceComplex;
import service.ServiceReel;

/**
 * @author Stagiaire
 *
 */
public class Lanceur {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		IReelService reel = new ServiceReel();
		IComplexService complex = new ServiceComplex();
		Reel r = new Reel(10, 2);
		
		reel.addition();
		System.out.println(r);
		reel.soustraction(10, 2);
		System.out.println(reel);
		complex.addition(im, re);
		System.out.println(complex);
		complex.soustraction(im, re);

	}

}
