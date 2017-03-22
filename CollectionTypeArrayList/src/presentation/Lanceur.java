package presentation;

import java.util.ArrayList;
import java.util.List;

public class Lanceur {
	public static void main(String[] args) {
	
		//declaration liste
		//List<String> al = new ArrayList<String>();
		List al = new ArrayList();
		//ajout liste
		al.add(12);
		al.add("Bonjour");
		al.add(12f);
		al.add(true);
		al.add('d');
		al.add('d');
		//parcours liste
		for (int i = 0; i < al.size(); i++)		
		{
			System.out.println("donnée a l'indice " + i + " = " + al.get(i));
		}
	}
}
