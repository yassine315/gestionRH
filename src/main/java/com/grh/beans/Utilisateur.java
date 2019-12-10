/***********************************************************************
 * Module:  Utilisateur.java
 * Author:  SMI
 * Purpose: Defines the Class Utilisateur
 ***********************************************************************/
package com.grh.beans;
import java.util.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="utilisateur")

public class Utilisateur {
  
	@Id
	@GeneratedValue
	
	private int idUt;
	@Column(name="ID_UT")
	
	private String cinUt;
	@Column(name="CIN_UT")
	
	private String nomUt;
	@Column(name="NOM_UT")
	
	private String prenomUt;
	@Column(name="PRENOM_UT")
	
	private String emailUt;
	@Column(name="EMAIL_UT")
	
	private String mpUt;
	@Column(name="MP_UT")
	
	private String telUt;
	@Column(name="TEL_UT")
	
	private List<Utilisateur> utilisateurB;
	private List<Utilisateur> utilisateurA;
	private List<DroitUt> droitUt;
	private List<Filiere> filiere;
	public int getIdUt() {
		return idUt;
	}
	public void setIdUt(int idUt) {
		this.idUt = idUt;
	}
	public String getCinUt() {
		return cinUt;
	}
	public void setCinUt(String cinUt) {
		this.cinUt = cinUt;
	}
	public String getNomUt() {
		return nomUt;
	}
	public void setNomUt(String nomUt) {
		this.nomUt = nomUt;
	}
	public String getPrenomUt() {
		return prenomUt;
	}
	public void setPrenomUt(String prenomUt) {
		this.prenomUt = prenomUt;
	}
	public String getEmailUt() {
		return emailUt;
	}
	public void setEmailUt(String emailUt) {
		this.emailUt = emailUt;
	}
	public String getMpUt() {
		return mpUt;
	}
	public void setMpUt(String mpUt) {
		this.mpUt = mpUt;
	}
	public String getTelUt() {
		return telUt;
	}
	public void setTelUt(String telUt) {
		this.telUt = telUt;
	}
	public List<Utilisateur> getUtilisateurB() {
		return utilisateurB;
	}
	public void setUtilisateurB(List<Utilisateur> utilisateurB) {
		this.utilisateurB = utilisateurB;
	}
	public List<Utilisateur> getUtilisateurA() {
		return utilisateurA;
	}
	public void setUtilisateurA(List<Utilisateur> utilisateurA) {
		this.utilisateurA = utilisateurA;
	}
	public List<DroitUt> getDroitUt() {
		return droitUt;
	}
	public void setDroitUt(List<DroitUt> droitUt) {
		this.droitUt = droitUt;
	}
	public List<Filiere> getFiliere() {
		return filiere;
	}
	public void setFiliere(List<Filiere> filiere) {
		this.filiere = filiere;
	}
   
	
   
   

}