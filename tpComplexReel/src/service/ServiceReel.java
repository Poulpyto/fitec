/**
 * 
 */
package service;

import metier.Reel;

/**
 * @author Stagiaire
 *
 */
public class ServiceReel implements IReelService {

	/* (non-Javadoc)
	 * @see service.IReelService#addition(metier.Reel, metier.Reel)
	 */
	@Override
	public Reel addition(Reel x, Reel y) {
		Reel result = new Reel();
		result.setX(x.getX() + y.getX());
		System.out.println("resultat de l'addition :" + result);
		return result;
	}

	/* (non-Javadoc)
	 * @see service.IReelService#soustraction(metier.Reel, metier.Reel)
	 */
	@Override
	public Reel soustraction(Reel x, Reel y) {
		Reel result = new Reel();
		result.setX(x.getX() - y.getX());
		return result;
	}


}
