/***********************************************************************
 * Module:  Filiere.java
 * Author:  SMI
 * Purpose: Defines the Class Filiere
 ***********************************************************************/
package com.grh.beans;
import java.util.*;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="filiere")
public class Filiere {
	
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Column(name="ID_FILIERE")
   private int idFiliere;
   
   @Column(name="FORMATION")
   private String formation;

   @Column(name="NOM_FILIERE")
   private String nomFiliere;
   
   @Column(name="DATE")
   private Date date;

   @OneToOne(fetch = FetchType.LAZY)
   @JoinColumn(name = "ID_PROF")
   private Prof profResponsable;
  	
	//private List<Utilisateur> utilisateur;
	//private List<Module> module;
	//private List<Section> section;
	
	
	
	public Filiere() {
		super();
	}
	
	
	public Filiere(String formation, String nomFiliere, Date date, Prof profResponsable) {
		super();
		this.formation = formation;
		this.nomFiliere = nomFiliere;
		this.date = date;
		this.profResponsable = profResponsable;
	}


	public int getIdFiliere() {
		return idFiliere;
	}
	public void setIdFiliere(int idFiliere) {
		this.idFiliere = idFiliere;
	}
	
	public String getFormation() {
		return formation;
	}
	public void setFormation(String formation) {
		this.formation = formation;
	}
	public String getNomFiliere() {
		return nomFiliere;
	}
	public void setNomFiliere(String nomFiliere) {
		this.nomFiliere = nomFiliere;
	}


	public Prof getProfResponsable() {
		return profResponsable;
	}


	public void setProfResponsable(Prof profResponsable) {
		this.profResponsable = profResponsable;
	}


	public Date getDate() {
		return date;
	}


	public void setDate(Date date) {
		this.date = date;
	}

   
   
}