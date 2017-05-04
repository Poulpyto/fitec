package presentation;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import metier.Compte;

public class Lanceur {

	public static void main(String[] args) throws Exception {
		System.out.println("init context");
		JAXBContext context = JAXBContext.newInstance(Compte.class);
		System.out.println("choix entre marshal ou unmarshal , ici unmarshal");
		Unmarshaller unmarshaller = context.createUnmarshaller();
		Compte c = (Compte) unmarshaller.unmarshal(new File("comptes.xml"));
		System.out.println(c);
		
	}

}
