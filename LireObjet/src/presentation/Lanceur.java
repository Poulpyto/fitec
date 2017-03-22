package presentation;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import metier.Compte;

public class Lanceur {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		//instanciation
		File f = new File("banque.txt");
		FileInputStream fis = new FileInputStream (f);
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		//lecture et assignation a 1 variable
	//	Compte c1 = (Compte) ois.readObject();
	//	Compte c2 = (Compte) ois.readObject();
		
		Compte c;
		try {
			while ((c = (Compte) ois.readObject()) != null)
			{
				System.out.println(c);
			}//affichage de la variable
		}catch (EOFException e){
		}
		ois.close();
		fis.close();
	}
	//	System.out.println(c1);
	//	System.out.println(c2);
		//fermeture des flux
		
	}
