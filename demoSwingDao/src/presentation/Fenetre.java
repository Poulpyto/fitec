package presentation;

import java.awt.BorderLayout;
import java.awt.Color;
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
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import metier.Client;
import service.ClientService;
import service.IClientService;

public class Fenetre extends JFrame {

	// liste des composants de ma fenêtre
	private JLabel jl1 = new JLabel("Nom :"); 
	private JTextField jtf1 = new JTextField(12);
	private JLabel jl2 = new JLabel("Prenom :");
	private JTextField jtf2 = new JTextField(12);
	private JLabel jl3 = new JLabel("Yeux :"); 
	private JTextField jtf3 = new JTextField(12);
	private JButton jb1 = new JButton("ajouter");
	private JButton jb2 = new JButton("supprimer");
	private JTextField jtf4 = new JTextField(12);
	private JLabel jl4 = new JLabel("id :");
	
	private IClientService service = new ClientService();
	private Client c = new Client();

	
	public Fenetre(String nom){
		super(nom);
		setSize(800,600); //taille de la fenêtre
		
		
		//creer un onglet declare un jtabbedpane et un jpanel avant de les associer
		
		JTabbedPane onglets = new JTabbedPane(SwingConstants.TOP);
		JPanel onglet1 = new JPanel();
		
		onglet1.setLayout(new FlowLayout());
		onglet1.setBackground(Color.orange);
		
		
		
		//disposition de la fenêtre principale 
		this.setLayout(new BorderLayout()); //précise que ce je vais ajouter va se faire ligne par ligne
		
		//ajout de la première ligne
		JPanel jp1 = new JPanel(); //nouvelle ligne
		jp1.setLayout(new FlowLayout());
		jp1.add(jl1);jp1.add(jtf1); //ajout des bouttons du text et du label
		
		
		//ajout de la deuxième ligne
		JPanel jp2 = new JPanel();
		jp2.setLayout(new FlowLayout());
		jp2.add(jl2); jp2.add(jtf2);
		
		//this.add(jp1);
		 //3eme ligne
		JPanel jp3 = new JPanel();
		jp3.setLayout(new FlowLayout());
		jp3.add(jl3); jp3.add(jtf3);
		
		//bouton ajouter
		JPanel jp4 = new JPanel();
		jp4.setLayout(new FlowLayout());
		jp4.add(jb1);
		
		JPanel jp5 = new JPanel();
		jp5.setLayout(new BoxLayout(jp5, BoxLayout.Y_AXIS));
		jp5.add(jp1);
		jp5.add(jp2);
		jp5.add(jp3);
		jp5.add(jp4);
		onglet1.add(jp5, BorderLayout.NORTH);
		
		JPanel onglet2 = new JPanel();
		onglet2.setBackground(Color.BLACK);
		onglet2.setLayout(new BorderLayout());
		JPanel jp6 = new JPanel();
		jp6.setLayout(new FlowLayout());
		jp6.add(jl4);
		jp6.add(jtf4);
		JPanel jp7 = new JPanel();
		jp7.setLayout(new FlowLayout());
		jp7.add(jb2);
		
		JPanel jp8 = new JPanel();
		jp8.setLayout(new BoxLayout(jp8, BoxLayout.Y_AXIS));
		jp8.add(jp6);
		jp8.add(jp7);
		onglet2.add(jp8, BorderLayout.NORTH);
		
		/*JPanel onglet3 = new JPanel();
		onglet3.setBackground(Color.RED);
		onglet3.setLayout(new BorderLayout());
		JPanel jp9 = new JPanel();
		jp9.setLayout(new BoxLayout(jp9, BoxLayout.Y_AXIS));
		jp9.add(jp1);
		jp9.add(jp2);
		jp9.add(jp3);
		jp9.add(jb3, constraints);*/
		jb2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// recup parametres saisis par utilisateur
			int id = Integer.parseInt(jtf4.getText());
			//appel de la couche service
			c.setId(id);
			
			service.supprimerClient(id);
			//vider les données
			jtf4.setText("");
			}
		});
		
		//rendre le bouton ajouter actif en lui donnant une action
		jb1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// recup parametres saisis par utilisateur
			String nom = jtf1.getText();
			String prenom = jtf2.getText();
			String yeux = jtf3.getText();
			//appel de la couche service
			c.setNom(nom);
			c.setPrenom(prenom);
			c.setCouleurYeux(yeux);
			service.ajouterClient(c);
			//vider les données
			jtf1.setText("");
			jtf2.setText("");
			jtf3.setText("");
			}
		});
		
		
		// associer jpanel au jtabbedpane
		onglets.addTab("Ajouter", onglet1);
		onglets.addTab("Supprimer", onglet2);
	//	onglets.addTab("maj", onglet3);
		//asocier le jtabbed a la fenetre
		this.add(onglets);
		
	}

}