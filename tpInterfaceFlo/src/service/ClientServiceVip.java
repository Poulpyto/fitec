/**
 * 
 */
package service;

/**
 * @author Stagiaire
 *
 */
public class ClientServiceVip  extends ClientService implements IClientServiceVip{

	@Override
	public void jeSuisVip() {
		System.out.println("Je suis VIP");

	}
	
}
