package com.grh.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.grh.beans.Professeur;

/**
 * @author Yassine
 *
 */
public class DaoProfesseur implements IDao<Professeur> {
	
	/**
	 * la couche base de la connection 
	 */
	private DBInteraction dbi;
	
	

	/**
	 * instancier la DBInteraction
	 */
	public DaoProfesseur() {
		super();
		this.dbi = new DBInteraction();
	}

	
	

	/**
	 *a completer les attribut de prefesseur ne sont pas complet
	 */
	@Override
	public List<Professeur> select(int nbrows) throws SQLException {
		// TODO Auto-generated method stub
		dbi.getConnection();
		ResultSet rs =  dbi.select("select * from prof");
		List<Professeur> listProfesseur = new ArrayList<Professeur>();
		while(rs.next()) {
			Professeur prof = new Professeur(rs.getInt(1),rs.getString(2),rs.getString(3));
		}
		return null;
		
	}

	@Override
	public boolean ajouter(Professeur t) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean modifier(Professeur t) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean suprimer(Professeur t) {
		// TODO Auto-generated method stub
		return false;
	}

}
