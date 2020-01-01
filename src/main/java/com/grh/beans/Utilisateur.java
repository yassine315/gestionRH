/***********************************************************************
 * Module:  Utilisateur.java
 * Author:  SMI
 * Purpose: Defines the Class Utilisateur
 ***********************************************************************/
package com.grh.beans;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="utilisateur")
public class Utilisateur {
  
	public Utilisateur(String cinUt, String nomUt, String prenomUt, String emailUt, String mpUt, String telUt) {
		super();
		this.cinUt = cinUt;
		this.nomUt = nomUt;
		this.prenomUt = prenomUt;
		this.emailUt = emailUt;
		this.mpUt = mpUt;
		this.telUt = telUt;
	}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID_UT")
	private int idUt;
	@Column(name="CIN_UT")
	private String cinUt;

	@Column(name="NOM_UT")
	private String nomUt;
	
	@Column(name="PRENOM_UT")
	private String prenomUt;
	
	@Column(name="EMAIL_UT")
	private String emailUt;
	
	@Column(name="MP_UT")
	private String mpUt;
	
	@Column(name="TEL_UT")
	private String telUt;

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


	public Utilisateur() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Utilisateur(int idUt, String cinUt, String nomUt, String prenomUt, String emailUt, String mpUt, String telUt) {
		super();
		this.idUt = idUt;
		this.cinUt = cinUt;
		this.nomUt = nomUt;
		this.prenomUt = prenomUt;
		this.emailUt = emailUt;
		this.mpUt = mpUt;
		this.telUt = telUt;
	
	}
 
	
   
   

}