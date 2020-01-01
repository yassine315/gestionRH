package com.grh.filiere;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.grh.beans.Filiere;
import com.grh.beans.Prof;
import com.grh.util.HibernateUtil;

/**
 * Servlet implementation class AjouterFiliere
 */
public class AjouterFiliere extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private SessionFactory sessionFactory;
	private List<Prof> profs;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AjouterFiliere() {
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
        profs = session.createQuery("FROM Prof", Prof.class).getResultList();
        session.getTransaction().commit();
        getServletContext().setAttribute("session", session);
	}



	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setAttribute("profs", profs);
		request.getServletContext().getRequestDispatcher("/WEB-INF/dashboardFiliere/dashboard_AjouterFiliere.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String nomFiliere = request.getParameter("nomFiliere");
		String formation = request.getParameter("formation");
		int idProf = Integer.parseInt(request.getParameter("idProf"));
		String creatDate = request.getParameter("creatDate");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date dateFormation = new Date();
		try {
			dateFormation = sdf.parse(creatDate);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		Prof prof =session.find(Prof.class, idProf);
		Filiere filiere = new Filiere(formation, nomFiliere, dateFormation,  prof);
		session.save(filiere);
		session.getTransaction().commit();
		session.close();
		request.getServletContext().getRequestDispatcher("/FiliereS").forward(request, response);

	}

}
