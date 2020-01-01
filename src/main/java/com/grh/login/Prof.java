package com.grh.login;

import java.io.IOException;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.query.Query;

import com.grh.util.HibernateUtil;


/**
 * Servlet implementation class Prof
 */
public class Prof extends HttpServlet {
	private static final long serialVersionUID = 1L;
    /**
     * @see HttpServlet#HttpServlet()
     */
	
	
	
	SessionFactory sessionFactory ;
   
	public Prof() {
		
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		//la creation de l'objet criteria
		CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
		CriteriaQuery<com.grh.beans.Prof> criteriaQuery = criteriaBuilder.createQuery(com.grh.beans.Prof.class);
		
		Root<com.grh.beans.Prof> root = criteriaQuery.from(com.grh.beans.Prof.class);
		criteriaQuery.select(root);
		
		Query<com.grh.beans.Prof> query = session.createQuery(criteriaQuery);
		List<com.grh.beans.Prof> profs = query.list();
		session.getTransaction().commit();
		session.close();
		
		request.setAttribute("profs", profs);
		
		request.getServletContext().getRequestDispatcher("/WEB-INF/dashboardProf/dashbord_Prof.jsp").forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
