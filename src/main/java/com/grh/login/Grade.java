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
import org.hibernate.query.Query;

import com.grh.util.HibernateUtil;

/**
 * Servlet implementation class Grade
 */
public class Grade extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	SessionFactory sessionFactory;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Grade() {
        super();
        // TODO Auto-generated constructor stub
        sessionFactory = HibernateUtil.getSessionFactory();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		//la creation de l'objet criteria
		CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
		CriteriaQuery<com.grh.beans.Grade> criteriaQuery = criteriaBuilder.createQuery(com.grh.beans.Grade.class);
		
		Root<com.grh.beans.Grade> root = criteriaQuery.from(com.grh.beans.Grade.class);
		criteriaQuery.select(root);
		
		Query<com.grh.beans.Grade> query = session.createQuery(criteriaQuery);
		List<com.grh.beans.Grade> grades = query.list();
		session.getTransaction().commit();
		session.close();
		
		request.setAttribute("grades", grades);
		
		request.getServletContext().getRequestDispatcher("/WEB-INF/dashboardProf/dashboard_prof_grade.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
