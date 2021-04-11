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
 * Servlet implementation class IdServlet
 */
@WebServlet("/IdServlet")
public class IdServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public IdServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		//request.setAttribute("Client", new ClientModel());
		//request.getRequestDispatcher("accueil.jsp").forward(request, response);
		//request.setAttribute("Erreur", new Boolean());
		//request.getRequestDispatcher("identifier.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		String email=request.getParameter("email");
		String mdp=request.getParameter("mdp");
		ClientModel cd= new ClientDAOImlp().verify(email, mdp);
		if(cd!=null) {
			request.setAttribute("Client", cd);
			request.getRequestDispatcher("accueil.jsp").forward(request, response);
		}else {
			//response.getWriter().append("Veuiller ressayer svp !!!");
			System.out.println("error");
			request.setAttribute("Erreur", "Email ou Mot de Passe est incorrect Veuiller ressayer svp !!!");
			request.getRequestDispatcher("identifier.jsp").forward(request, response);
		}
        
        
		
	}

}
