package com.grh.filiere;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.grh.beans.Filiere;
import com.grh.util.HibernateUtil;

/**
 * Servlet implementation class FiliereS
 */
public class FiliereS extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private SessionFactory sessionFactory;
	private List<Filiere> filieres;
	
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	

	
	
    public FiliereS() {
        super();
        // TODO Auto-generated constructor stub
       
    }
    
    

	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		super.init();
		 sessionFactory = HibernateUtil.getSessionFactory();
	        Session session = sessionFactory.openSession();
	        session.beginTransaction();
	        filieres = session.createQuery("FROM Filiere", Filiere.class).getResultList();
	        session.getTransaction().commit();
	        getServletContext().setAttribute("session", session);
	}



	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setAttribute("filieres", filieres);
		request.getServletContext().getRequestDispatcher("/WEB-INF/dashboardFiliere/dashbord_Filiere.jsp").forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
