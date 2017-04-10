package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MaServlet
 */
@WebServlet("/MaServlet")
public class MaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public MaServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		/*
		 String[] lesloisirs = request.getParameterValues("loisirs");
		
		response.getWriter().append("Served at: ").append(request.getContextPath()).append("\n Customer Address : ")
				.append(request.getRemoteAddr()).append("\n Nom : ").append(request.getParameter("nom"))
				.append("\n Prénom : ").append(request.getParameter("prenom")).append("\n Mot de passe : ")
				.append(request.getParameter("mdp"));

		for (String l : lesloisirs) {
			response.getWriter().append("\n" + l);
		}
		*/
		request.setCharacterEncoding("UTF-8");
		// 1- récupérer les paramètres
		String nom = request.getParameter("nom");
		String prenom = request.getParameter("prenom");
		String mdp = request.getParameter("mdp");
		String[] loisirs = request.getParameterValues("loisirs");
		
		// 2- traitements avec la couche service
		
		// 3- préparation envoi
		request.setAttribute("lenom", nom);
		request.setAttribute("leprenom", prenom);
		request.setAttribute("lemdp", mdp);
		request.setAttribute("lesloisirs", loisirs);
		
		// 4- envoi
		request.getRequestDispatcher("/resultat.jsp").forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
