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

import com.grh.beans.DroitUt;
import com.grh.util.HibernateUtil;

/**
 * Servlet implementation class AjouterUser
 */
public class AjouterUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	SessionFactory sessionFactory;
	List<com.grh.beans.DroitUt> droits;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AjouterUser() {
        super();
        // TODO Auto-generated constructor stub
        
        
    }
    
    

	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		super.init();
		sessionFactory= HibernateUtil.getSessionFactory();
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
		CriteriaQuery<com.grh.beans.DroitUt> criteriaQuery = criteriaBuilder.createQuery(com.grh.beans.DroitUt.class);
		
		Root<com.grh.beans.DroitUt> root = criteriaQuery.from(com.grh.beans.DroitUt.class);
		criteriaQuery.multiselect(root);
		
		Query<com.grh.beans.DroitUt> query = session.createQuery(criteriaQuery);
		List<com.grh.beans.DroitUt> droits = query.list();
		session.getTransaction().commit();
		session.close();
		
		request.setAttribute("droits", droits);
		request.getServletContext().getRequestDispatcher("/WEB-INF/dashboardProf/dashboardAjouterUtil.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		String cinUt = request.getParameter("cinUt");
		String nomUt = request.getParameter("nomUt");
		String prenomUt = request.getParameter("prenomUt");
		String telUt = request.getParameter("telUt");
		String emailUt = request.getParameter("emailUt");
		String mpUt = request.getParameter("mpUt");
		
		Session session=sessionFactory.openSession();
		session.beginTransaction();
		com.grh.beans.Utilisateur user= new com.grh.beans.Utilisateur(cinUt, nomUt, prenomUt, emailUt, mpUt, telUt);
		session.save(user);
		session.getTransaction().commit();
		session.close();
	}

	public AjouterUser(SessionFactory sessionFactory, List<DroitUt> droits) {
		super();
		this.sessionFactory = sessionFactory;
	
		this.droits = droits;
	}

}
