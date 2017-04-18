package presentation;

import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;

import service.Iservice;
import service.ServiceImpl;

public class Lanceur {

	public static void main(String[] args) {
		//1.chargement du conteneur
		WeldContainer weld = new Weld().initialize();
		//2.récupération service
		Iservice service = weld.instance().select(ServiceImpl.class).get();
		//3. Appler de la methode a executer
		String resultat = service.appelDao();
		System.out.println(resultat);
		//4 destruction objet
		weld.instance().destroy(service);
	}

}
