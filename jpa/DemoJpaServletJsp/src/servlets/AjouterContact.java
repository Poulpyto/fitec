package servlets;

import java.io.IOException;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.FetchType;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import metier.Adresse;
import metier.Contact;
import metier.Film;
import service.IserviceImpl;

/**
 * Servlet implementation class AjouterContact
 */
@WebServlet("/AjouterContact")
public class AjouterContact extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private IserviceImpl is = new IserviceImpl();
    /**
     * Default constructor. 
     */
    public AjouterContact() {
    	super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.getWriter().append("Served at: ").append(request.getContextPath());
		String nom = request.getParameter("nom");
		String prenom = request.getParameter("prenom");
		String email = request.getParameter("email");
		String numRue = request.getParameter("numRue");
		String ville = request.getParameter("ville");
		String codePostal = request.getParameter("codePostal");
		
		Contact c = new Contact();
		c.setNom(nom);
		c.setPrenom(prenom);
		c.setEmail(email);
		Adresse a = new Adresse();
		a.setNumRue(numRue);
		a.setVille(ville);
		a.setCodePostal(codePostal);
		c.setAdresse(a);
		is.ajouterContactAdresse(c, a);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
