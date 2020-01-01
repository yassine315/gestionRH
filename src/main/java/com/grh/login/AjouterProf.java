package com.grh.login;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

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

import com.grh.beans.Grade;
import com.grh.util.HibernateUtil;

/**
 * Servlet implementation class AjouterProf
 */
public class AjouterProf extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	SessionFactory sessionFactory;
	Map<Integer,com.grh.beans.Grade> grades;
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
		List<com.grh.beans.Grade> gradesList = query.list();
		grades = gradesList.stream().collect(Collectors.toMap(com.grh.beans.Grade::getIdGrade, e -> e));
		session.getTransaction().commit();
		session.close();
		
		request.setAttribute("grades", gradesList);
		request.getServletContext().getRequestDispatcher("/WEB-INF/dashboardProf/dashboardAjouterProf.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//la creation de l'objet criteria
		Session session = sessionFactory.openSession();
		session.beginTransaction();
				CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
				CriteriaQuery<com.grh.beans.Grade> criteriaQuery = criteriaBuilder.createQuery(com.grh.beans.Grade.class);
				
				Root<com.grh.beans.Grade> root = criteriaQuery.from(com.grh.beans.Grade.class);
				criteriaQuery.select(root);
				
				Query<com.grh.beans.Grade> query = session.createQuery(criteriaQuery);
				grades = query.list().stream().collect(Collectors.toMap(com.grh.beans.Grade::getIdGrade, e -> e));
				
		
		String som = request.getParameter("som");
		String nom = request.getParameter("nom");
		String prenom = request.getParameter("prenom");
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date naissance = new Date();
		try {
			naissance = sdf.parse(request.getParameter("naissance"));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String lieu = request.getParameter("lieu");
		String adress = request.getParameter("adress");
		String contact = request.getParameter("contact");
		String genre = request.getParameter("genre");
		String nationalite = request.getParameter("nationalite");
		String etatCivil = request.getParameter("etatCivil");
		int nbrEnfant = Integer.parseInt(request.getParameter("nbrEnfant"));
		String affectation = request.getParameter("affectation");
		String codeAff = request.getParameter("codeAff");
		String email = request.getParameter("email");
		int idGrade = Integer.parseInt(request.getParameter("grade"));
		com.grh.beans.Grade grade = grades.get(idGrade);
		String nomAr = request.getParameter("nomAr");
		String prenomAr = request.getParameter("prenomAr");
		SimpleDateFormat rec = new SimpleDateFormat("yyyy-MM-dd");
		Date recrutement = new Date();
		String cin = request.getParameter("cin");
		System.out.println(nomAr+prenomAr);
		try {
			recrutement = rec.parse(request.getParameter("recrutement"));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		com.grh.beans.Prof prof = new com.grh.beans.Prof( grade, "jy", nom, prenom, som, adress, genre, "addcasurg", contact, "fonction", codeAff, lieu,
				naissance, "cele", etatCivil, nationalite, affectation, "mp",
				true, email, nbrEnfant,recrutement,nomAr,prenomAr,cin);
		
		session.save(prof);
		session.getTransaction().commit();
		session.close();
		
		request.getServletContext().getRequestDispatcher("/Prof").forward(request, response);

	
		
	}

}
