/**
 * 
 */
package service;

import metier.Complex;
import metier.Reel;

/**
 * @author Stagiaire
 *
 */
public class ServiceComplex implements IComplexService {

	/* (non-Javadoc)
	 * @see service.IComplexService#addition(metier.Complex, metier.Complex)
	 */
	@Override
	public Complex addition(Complex im, Complex re) {
		Complex result = new Complex();
		result.setIm(im.getIm() + re.getRe());
		System.out.println("resultat de l'addition :" + result);
		return result;
	}

	/* (non-Javadoc)
	 * @see service.IComplexService#soustraction(metier.Complex, metier.Complex)
	 */
	@Override
	public Complex soustraction(Complex x, Complex y) {
			Complex result = new Complex();
			result.setIm(im.getIm() - re.getRe());
			return result;
	}

}
