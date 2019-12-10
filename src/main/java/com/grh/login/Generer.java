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

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import com.grh.util.HibernateUtil;

/**
 * Servlet implementation class Generer
 */
public class Generer extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private final String ATTESTATION = "/grh_attestation/";
	
	private SessionFactory sessionFactory;
	private int som;
	private String type;
	private String name;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Generer() {
        super();
        // TODO Auto-generated constructor stub
        sessionFactory = HibernateUtil.getSessionFactory();
        
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		type = request.getParameter("type");
		
		name = request.getParameter("name");
		
		String somProf = request.getParameter("som");
		som = Integer.parseInt(somProf);
		
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		//la creation de l'objet criteria
				CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
				CriteriaQuery<com.grh.beans.Prof> criteriaQuery = criteriaBuilder.createQuery(com.grh.beans.Prof.class);
				
				Root<com.grh.beans.Prof> root = criteriaQuery.from(com.grh.beans.Prof.class);
				criteriaQuery.select(root).where(criteriaBuilder.equal(root.get("som").as(String.class), som ));
				
				Query<com.grh.beans.Prof> query = session.createQuery(criteriaQuery);
				com.grh.beans.Prof prof = null;
				try {
					prof = query.getSingleResult();
				}catch(HibernateException e){
					e.printStackTrace();
		            session.getTransaction().rollback();
				}
		session.getTransaction().commit();
		session.close();
		
		request.setAttribute("prof", prof);
		switch(type) {
			case "attestation":
				request.getServletContext().getRequestDispatcher(ATTESTATION+name).forward(request, response);
				break;
			case "recu":
				break;
				
		}
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
