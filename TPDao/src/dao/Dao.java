package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;




import metier.Client;

public class Dao implements IClientDao {

	@Override
	public void ajouterClient(Client c) {
		// TODO Auto-generated method stub
		
		try {
			// 1.charger le pilote
			 Class.forName("com.mysql.jdbc.Driver");
			 // 2.creer connection
			 Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bddclients", "root","");
			 // 3.creer requetes
			 //PreparedStatement ps = conn.prepareStatement("Insert into Client(nom, prenom) VALUES ('" + c.getNom() + "', '" + c.getPrenom() + "')");
			 //plus simplementy :
			 PreparedStatement ps = conn.prepareStatement("Insert into Client(nom, prenom) VALUES( ?, ?");
			 ps.setString(1, c.getNom());
			 ps.setString(2, c.getPrenom());
			 // 4.executer requete
			 ps.executeUpdate();
			 // 5.afficher resultats
			 
			 //6 fermer connection
			 conn.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			
		}
	}

	@Override
	public void modifierClient(int id, String nom, String prenom) {
		// TODO Auto-generated method stub
		try {
			String s = "update client SET nom = ?, prenom = ? WHERE id = ?";
			// 1.charger le pilote
			 Class.forName("com.mysql.jdbc.Driver");
			 // 2.creer connection
			 Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bddclients", "root","");
			 // 3.creer requetes
			 PreparedStatement ps = conn.prepareStatement(s);
			 ps.setString(1,  nom);
			 ps.setString(2, prenom);
			 ps.setInt(3, id);
			 // 4.executer requete
			 ps.executeUpdate();
			 // 5.afficher resultats
			 
			 //6 fermer connection
			 conn.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			
		}
	}


	@Override
	public void supprimerClient(int id) {
		// TODO Auto-generated method stub
		try {
			// 1.charger le pilote
			 Class.forName("com.mysql.jdbc.Driver");
			 // 2.creer connection
			 Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bddclients", "root","");
			 // 3.creer requetes
			 PreparedStatement ps = conn.prepareStatement("delete from Client where id = ?");
			 ps.setInt(1, id);
			 // 4.executer requete
			 ps.executeUpdate();
			 // 5.afficher resultats
			 
			 //6 fermer connection
			 conn.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public Collection<Client> listerClient() {
		// TODO Auto-generated method stub
		Collection<Client> cl = new ArrayList<Client>();
		try {
			// 1.charger le pilote
			 Class.forName("com.mysql.jdbc.Driver");
			 // 2.creer connection
			 Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bddclients", "root","");
			 // 3.creer requetes
			 PreparedStatement ps = conn.prepareStatement("select * from Client order by id asc");
			 // 4.executer requete
			 ResultSet rs = ps.executeQuery();
			 // 5.afficher resultats
			 while (rs.next())
			 {
				 Client c = new Client();
				 c.setId(rs.getInt("id"));
				 c.setNom(rs.getString("nom"));
				 c.setPrenom(rs.getString("prenom"));
				 cl.add(c);
			 }
			 //6 fermer connection
			 conn.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	
		return cl;
}

	@Override
	public Collection<Client> chercherParMC(String mc) {
		// TODO Auto-generated method stub
		Collection<Client> cl = new ArrayList<Client>();
		try {
			// 1.charger le pilote
			 Class.forName("com.mysql.jdbc.Driver");
			 // 2.creer connection
			 Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bddclients", "root","");
			 // 3.creer requetes
			 PreparedStatement ps = conn.prepareStatement("select * from Client where nom like ? order by id asc");
			 ps.setString(1, "%" + mc + "%");
			 // 4.executer requete
			 ResultSet rs = ps.executeQuery();
			 // 5.afficher resultats
			 while (rs.next())
			 {
				 Client c = new Client();
				 c.setId(rs.getInt("id"));
				 c.setNom(rs.getString("nom"));
				 c.setPrenom(rs.getString("prenom"));
				 cl.add(c);
			 }
			 //6 fermer connection
			 conn.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return cl;
	}

	@Override
	public Client trouverClient(int id) {
		// TODO Auto-generated method stub
		 Client c = new Client();
		try {
			// 1.charger le pilote
			 Class.forName("com.mysql.jdbc.Driver");
			 // 2.creer connection
			 Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bddclients", "root","");
			 // 3.creer requetes
			 //PreparedStatement ps = conn.prepareStatement("Insert into Client(nom, prenom) VALUES ('" + c.getNom() + "', '" + c.getPrenom() + "')");
			 //plus simplementy :
			 PreparedStatement ps = conn.prepareStatement("select * from Client where id = ?");
			 ps.setInt(1, id);
			 // 4.executer requete
			 ResultSet rs = ps.executeQuery();
			 // 5.afficher resultats
			 rs.next();
			 c.setId(rs.getInt("id"));
			 c.setNom(rs.getString("nom"));
			 c.setPrenom(rs.getString("prenom"));
			
			 //6 fermer connection
			 conn.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return c;
	}

	@Override
	public void ajouterYeux(String couleur) {
		// TODO Auto-generated method stub
		try {
			String s = "alter table client add couleurYeux varchar(10)";
			// 1.charger le pilote
			 Class.forName("com.mysql.jdbc.Driver");
			 // 2.creer connection
			 Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bddclients", "root","");
			 // 3.creer requetes
			 PreparedStatement ps = conn.prepareStatement(s);
		/*	 ps.setString(1,  nom);
			 ps.setString(2, prenom);
			 ps.setInt(3, id);
			 ps.setString(4, couleurYeux);*/
			 // 4.executer requete
			 ps.executeUpdate();
			 // 5.afficher resultats
			 
			 //6 fermer connection
			 conn.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
