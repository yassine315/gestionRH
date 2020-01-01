/***********************************************************************
 * Module:  Prof.java
 * Author:  SMI
 * Purpose: Defines the Class Prof
 ***********************************************************************/
package com.grh.beans;
import java.util.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table (name="prof")
public class Prof {
   
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name="ID_PROF")
  private int idProf;
  
  
  @Column(name="CIN_PROF")
	private String cinProf;
  
@Column(name="NOM_PROF")
	private String nomProf;
   
  @Column(name="PRENOM_PROF")
	private String prenomProf;
   
  @Column(name="SOM") 
	private String som;  
  
  @Column(name="ADRESSE")
	private String adresse;
   
  @Column(name="SEXE")
	private String sex;
   
  @Column(name="ADDCASURG")
	private String addCasUrg;  
   
  @Column(name="TELCASURG")
	private String telCasUrg;
   
  @Column(name="FONCTION")
	private String fonction;
   
  @Column(name="CODE_AFF")
	private String codeAff;
   
  @Column(name="LIEUX_NAISS")
	private String lieuxNaiss;
   
  @Column(name="DATE_NAISS")
	private Date dateNaiss;
   
  @Column(name="SITUATION_ACT")
	private String situationAct;
   
  @Column(name="ETAT_CIVIL")
	private String etatCivil;
  
  @Column(name="NATIONALITE")
	private String nationalite;
 
  @Column(name="AFFECTATION")
	private String affectation;
  
  @Column(name="MP")
	private String mp;
   
  @Column(name="ETAT_REPRISE")
	private boolean etatReprise;
   
  @Column(name="EMAIL_PROF")
	private String emailProf;
   
  @Column(name="NB_ENFANTS")
	private int nbEnfants;
   
   /*
	private List<Conge> conge;
	private List enseigner;
	private List<Module> module;
	private List<Attestation> attestation;
	private List<QuitterTerrit> quitterTerrit;
	private List<Mission> mission;
	private List<Diplome> diplome;
	*/
	
	public int getIdProf() {
		return idProf;
	}
	public void setIdProf(int idProf) {
		this.idProf = idProf;
	}
	public String getCinProf() {
		return cinProf;
	}
	public void setCinProf(String cinProf) {
		this.cinProf = cinProf;
	}
	public String getNomProf() {
		return nomProf;
	}
	public void setNomProf(String nomProf) {
		this.nomProf = nomProf;
	}
	public String getPrenomProf() {
		return prenomProf;
	}
	public void setPrenomProf(String prenomProf) {
		this.prenomProf = prenomProf;
	}
	public String getSom() {
		return som;
	}
	public void setSom(String som) {
		this.som = som;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getAddCasUrg() {
		return addCasUrg;
	}
	public void setAddCasUrg(String addCasUrg) {
		this.addCasUrg = addCasUrg;
	}
	public String getTelCasUrg() {
		return telCasUrg;
	}
	public void setTelCasUrg(String telCasUrg) {
		this.telCasUrg = telCasUrg;
	}
	public String getFonction() {
		return fonction;
	}
	public void setFonction(String fonction) {
		this.fonction = fonction;
	}
	public String getCodeAff() {
		return codeAff;
	}
	public void setCodeAff(String codeAff) {
		this.codeAff = codeAff;
	}
	public String getLieuxNaiss() {
		return lieuxNaiss;
	}
	public void setLieuxNaiss(String lieuxNaiss) {
		this.lieuxNaiss = lieuxNaiss;
	}
	public Date getDateNaiss() {
		return dateNaiss;
	}
	public void setDateNaiss(Date dateNaiss) {
		this.dateNaiss = dateNaiss;
	}
	public String getSituationAct() {
		return situationAct;
	}
	public void setSituationAct(String situationAct) {
		this.situationAct = situationAct;
	}
	public String getEtatCivil() {
		return etatCivil;
	}
	public void setEtatCivil(String etatCivil) {
		this.etatCivil = etatCivil;
	}
	public String getNationalite() {
		return nationalite;
	}
	public void setNationalite(String nationalite) {
		this.nationalite = nationalite;
	}
	public String getAffectation() {
		return affectation;
	}
	public void setAffectation(String affectation) {
		this.affectation = affectation;
	}
	public String getMp() {
		return mp;
	}
	public void setMp(String mp) {
		this.mp = mp;
	}
	public boolean isEtatReprise() {
		return etatReprise;
	}
	public void setEtatReprise(boolean etatReprise) {
		this.etatReprise = etatReprise;
	}
	public String getEmailProf() {
		return emailProf;
	}
	public void setEmailProf(String emailProf) {
		this.emailProf = emailProf;
	}
	public int getNbEnfants() {
		return nbEnfants;
	}
	public void setNbEnfants(int nbEnfants) {
		this.nbEnfants = nbEnfants;
	}
	public Prof(String cinProf, String nomProf, String prenomProf, String som, String adresse, String sex,
			String addCasUrg, String telCasUrg, String fonction, String codeAff, String lieuxNaiss, Date dateNaiss,
			String situationAct, String etatCivil, String nationalite, String affectation, String mp,
			boolean etatReprise, String emailProf, int nbEnfants) {
		super();
		this.cinProf = cinProf;
		this.nomProf = nomProf;
		this.prenomProf = prenomProf;
		this.som = som;
		this.adresse = adresse;
		this.sex = sex;
		this.addCasUrg = addCasUrg;
		this.telCasUrg = telCasUrg;
		this.fonction = fonction;
		this.codeAff = codeAff;
		this.lieuxNaiss = lieuxNaiss;
		this.dateNaiss = dateNaiss;
		this.situationAct = situationAct;
		this.etatCivil = etatCivil;
		this.nationalite = nationalite;
		this.affectation = affectation;
		this.mp = mp;
		this.etatReprise = etatReprise;
		this.emailProf = emailProf;
		this.nbEnfants = nbEnfants;
	}
	public Prof() {
		super();
	}
	
	

}