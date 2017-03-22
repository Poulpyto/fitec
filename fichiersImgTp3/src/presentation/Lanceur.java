package presentation;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Lanceur {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//transforme l'objet en bin pour communiquer avc stream
		
		
		File f = new File("Koala.jpg");
		FileInputStream fr = new FileInputStream(f);
		
		File f2 = new File ("le_pote_du_koala.jpg");
		FileOutputStream fw = new FileOutputStream(f2);
		
		int c;
		while ((c = fr.read()) != -1)
			fw.write(c);
		fr.close();
		fw.close();
	}
}
