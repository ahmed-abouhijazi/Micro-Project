package Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.DAO.ClientDAO;
import com.DAO.ClientDAOImlp;
import com.Model.ClientModel;

/**
 * Servlet implementation class MainServlet
 */
@WebServlet("/MainServlet")
public class MainServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MainServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		//request.getRequestDispatcher("accueil.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		ClientModel c = new ClientModel();
		c.setNom(request.getParameter("nom"));
		c.setPrenom(request.getParameter("prenom"));
		c.setAdresse(request.getParameter("adresse"));
		c.setTel(request.getParameter("tel"));
		c.setCodePostal(request.getParameter("zipcode"));
		c.setVille(request.getParameter("ville"));
		c.setEmail(request.getParameter("email"));
		c.setMotPasse(request.getParameter("mdp_insc"));
		
		
		System.out.println("name is "+c.getNom());
		ClientDAO dao = new ClientDAOImlp();
		dao.addClient(c);
		request.setAttribute("Client", c);
		request.getRequestDispatcher("accueil.jsp").forward(request, response);
		
		
	}

}
