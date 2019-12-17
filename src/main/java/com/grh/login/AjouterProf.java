package com.grh.login;

import java.io.IOException;
import java.util.Date;
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
 * Servlet implementation class AjouterProf
 */
public class AjouterProf extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	SessionFactory sessionFactory;
	List<com.grh.beans.Grade> grades;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AjouterProf() {
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
		request.getServletContext().getRequestDispatcher("/WEB-INF/dashboardProf/dashboardAjouterProf.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		String som = request.getParameter("som");
		String nom = request.getParameter("nom");
		String prenom = request.getParameter("prenom");
		String naissance = request.getParameter("naissance");
		String lieu = request.getParameter("lieu");
		String adress = request.getParameter("adress");
		String contact = request.getParameter("contact");
		String genre = request.getParameter("genre");
		String nationalite = request.getParameter("nationalite");
		String etatCivil = request.getParameter("etatCivil");
		String nbrEnfant = request.getParameter("nbrEnfant");
		String affectation = request.getParameter("affectation");
		String codeAff = request.getParameter("codeAff");
		String email = request.getParameter("email");
		String grade = request.getParameter("grade");
		
		/**Prof(String cinProf, String nomProf, String prenomProf, String som, String adresse, String sex,
				String addCasUrg, String telCasUrg, String fonction, String codeAff, String lieuxNaiss, Date dateNaiss,
				String situationAct, String etatCivil, String nationalite, String affectation, String mp,
				boolean etatReprise, String emailProf, int nbEnfants) 
		
		com.grh.beans.Prof prof = new com.grh.beans.Prof("",nom,prenom,som,adress,genre,"",contact,"",codeAff,lieu,naissance,"",etatCivil,nationalite,
		affectation,"","",email,nbrEnfant);*/
		
		
		
	}

}
