package presentation;

import java.io.File;
//import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Lanceur {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//source
		File f = new File("toto.txt");
		FileReader fr = new FileReader(f);
		//cryptage
		File f2 = new File("fichiercode.txt");
		FileWriter fw = new FileWriter(f2);

		int c;
		while ((c = fr.read()) != -1)
			fw.write(c+1);//(c renvoi le char ascii dont la valeur peut etre changer (+1 etc)cf rot13 pour cryptage)
		fr.close();
		fw.close();
		//source
		File f3 = new File("fichiercode.txt");
		FileReader fr2 = new FileReader(f3);
		//decryptage
		File f4 = new File("fichier decoder.txt");
		FileWriter fw2 = new FileWriter(f4);
		
		int a;
		while ((a = fr2.read()) != -1)
			fw2.write(a-1);
		
		fw2.close();
		fr2.close();
	}
}
