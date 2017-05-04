package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ws.BanqueService;
import ws.BanqueServiceProxy;

/**
 * Servlet implementation class ConversionED
 */
@WebServlet("/ConversionED")
public class ConversionED extends HttpServlet {
	private static final long serialVersionUID = 1L;
       BanqueService bs = new BanqueServiceProxy();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ConversionED() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Double montant = Double.parseDouble(request.getParameter("montant"));
		
		double result = bs.conversionED(montant);
		request.setAttribute("toto", result);
		
		request.getRequestDispatcher("index.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
