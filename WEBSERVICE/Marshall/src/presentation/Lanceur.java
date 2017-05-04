package presentation;

import java.io.File;
import java.util.Date;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

import metier.Compte;

public class Lanceur {

	public static void main(String[] args) throws Exception {
		System.out.println("init du marshaller");
		JAXBContext context = JAXBContext.newInstance(Compte.class);
		Marshaller marshaller = context.createMarshaller();
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		System.out.println("Création d'un compte");
		
		Compte c = new Compte();
		c.setCode(1);
		c.setSolde(1000);
		c.setDateCreation(new Date());
		System.out.println("transformation de l'objet java vers xml");
		marshaller.marshal(c, new File("comptes.xml"));
		
	}

}
