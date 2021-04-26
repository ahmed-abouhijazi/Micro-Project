package Controller;

import java.io.IOException;
import java.util.List;
import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//import com.DAO.ClientDAO;
//import com.DAO.ClientDAOImlp;
import com.Model.ClientModel;

/**
 * Servlet implementation class MainServlet
 */
@WebServlet("/MainServlet")
@PersistenceUnit(unitName="GI4")
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
		EntityManagerFactory emf = (EntityManagerFactory)getServletContext().getAttribute("emf");
		EntityManager em = emf.createEntityManager();
		try {
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
		//ClientDAO dao = new ClientDAOImlp();
		//dao.addClient(c);
		String query ="INSERT INTO ClientModel (Id,Email,Nom,Prenom,Adresse,CodePostal,Ville,Tel,MotPasse) VALUES (NULL,'"+c.getEmail()+"','"+c.getNom()+"','"+c.getPrenom()+"','"+c.getAdresse()+"','"+c.getCodePostal()+"','"+c.getVille()+"','"+c.getTel()+"','"+c.getMotPasse()+"')";
		em.getTransaction().begin();
		em.createNativeQuery(query).executeUpdate();
		em.getTransaction().commit();
        
		List<ClientModel> clients = new ArrayList<>();
		clients.add(c);
		request.setAttribute("Client", clients);
		request.getRequestDispatcher("accueil.jsp").forward(request, response);
		}finally {
			if(em.getTransaction().isActive())
				em.getTransaction().rollback();
			em.close();
		}
		
	}

}
