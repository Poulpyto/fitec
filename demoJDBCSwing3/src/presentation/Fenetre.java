package presentation;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import metier.Client;
import service.ClientService;
import service.IClientService;



class Fenetre extends JFrame {

	// liste des composants de ma fenêtre
	private JLabel jl = new JLabel("Nom :"); 
	private JTextField jtf1 = new JTextField(12);
	
	private JLabel jl1 = new JLabel("Prenom :"); 
	private JTextField jtf2 = new JTextField(12);
	
	private JLabel jl2 = new JLabel("Yeux :"); 
	private JTextField jtf3 = new JTextField(12);
	
	private JButton jb1 = new JButton("Ajouter");

	
	private IClientService service = new ClientService();
	private Client c = new Client();
	
	public Fenetre(String nom){
		super(nom);
		setSize(800,600); //taille de la fenêtre
		
		//disposition de la fenêtre principale 
		this.setLayout(new BorderLayout()); //précise que ce je vais ajouter va se faire ligne par ligne
		
		//ajout de la première ligne
		JPanel jp1 = new JPanel(); //nouvelle ligne
		jp1.setLayout(new FlowLayout());
		jp1.add(jl);jp1.add(jtf1); //ajout du text et du label

		//ajout de la deuxième ligne
		JPanel jp2 = new JPanel(); //nouvelle ligne
		jp2.setLayout(new FlowLayout());
		jp2.add(jl1);jp2.add(jtf2); //ajout du text et du label
		
		
		//ajout de la troisième ligne
		JPanel jp3 = new JPanel(); //nouvelle ligne
		jp3.setLayout(new FlowLayout());
		jp3.add(jl2);jp3.add(jtf3);  //ajout du text et du label

		//ajout de la quatrième ligne
		JPanel jp4 = new JPanel(); //nouvelle ligne
		jp4.setLayout(new FlowLayout());
		jp4.add(jb1); //ajout des bouttons 
		
		
		
		
		JPanel jp5 = new JPanel();
		jp5.setLayout(new BoxLayout(jp5,BoxLayout.Y_AXIS));
		jp5.add(jp1);
		jp5.add(jp2);
		jp5.add(jp3);
		jp5.add(jp4);
		
		this.add(jp5,BorderLayout.NORTH);
		
		
		
		
		//Rendre le bouton actif en lui donnant une action à réaliser
		jb1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// récupération des paramètres saisis par le client
				String nom = jtf1.getText();
				String prenom = jtf2.getText();
				String yeux = jtf3.getText();
				
				//appel de la couche service
				c.setNom(nom);
				c.setPrenom(prenom);
				c.setYeux(yeux);
				service.ajouterClient(c);
				
				
				//vider les champs après ajout en base
				jtf1.setText("");
				jtf2.setText("");
				jtf3.setText("");
			}
		});
			
					
	};
	
		
}




