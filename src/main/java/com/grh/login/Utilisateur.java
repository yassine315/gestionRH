package com.grh.login;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.grh.util.HibernateUtil;


/**
 * Servlet implementation class Utilisateur
 */
public class Utilisateur extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private SessionFactory sessionFactory;
	private List<com.grh.beans.Utilisateur> users;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Utilisateur() {
        super();
        // TODO Auto-generated constructor stub
        
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		users = session.createQuery("FROM Utilisateur", com.grh.beans.Utilisateur.class).getResultList();
		session.getTransaction().commit();
		session.close();
		
		
		request.setAttribute("users",users);
		
		request.getServletContext().getRequestDispatcher("/WEB-INF/dashboard_util/dashboardUtil.jsp").forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
