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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table (name="prof")
public class Prof {
   
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name="ID_PROF")
  private int idProf;
  
  @OneToOne
  @JoinColumn(name="ID_GRADE")
  private Grade grade;
  
  
  @Column(name="CIN_PROF")
	private String cinProf;
  
  @Column(name="NOM_PROF")
	private String nomProf;
   
  @Column(name="PRENOM_PROF")
	private String prenomProf;
   
  @Column(name="SOM") 
	private String som;  
  
  @Column(name="ADRESSE", nullable=true)
	private String adresse;
   
  @Column(name="SEXE")
	private String sex;
   
  @Column(name="ADDCASURG", nullable = true)
	private String addCasUrg;  
   
  @Column(name="DATE_RECRUTMENT")
  	private Date dateRecrutement;
  
  @Column(name="NOM_ARABE")
  private String nomAr;
  
  @Column(name="PRENOM_ARABE")
  private String prenomAr;
  
  @Column(name="TELCASURG")
	private String telCasUrg;
   
  @Column(name="FONCTION", nullable = true)
	private String fonction;
   
  @Column(name="CODE_AFF")
	private String codeAff;
   
  @Column(name="LIEUX_NAISS")
	private String lieuxNaiss;
   
  @Column(name="DATE_NAISS")
	private Date dateNaiss;
   
  @Column(name="SITUATION_ACT", nullable = true)
	private String situationAct;
   
  @Column(name="ETAT_CIVIL", nullable= true)
	private String etatCivil;
  
  @Column(name="NATIONALITE")
	private String nationalite;
 
  @Column(name="AFFECTATION" , nullable = true)
	private String affectation;
  
  @Column(name="MP", nullable = true)
	private String mp;
   
  @Column(name="ETAT_REPRISE" , nullable = true)
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
  
	
	public Prof( String nomProf, String prenomProf, String som, String adresse, String sex,
			String telCasUrg,  String codeAff, String lieuxNaiss, Date dateNaiss,
			 String etatCivil, String nationalite, String affectation,
		 String emailProf, int nbEnfants, Grade grade,Date dateRecrutemenT,String nomar,String prenomar,String cin)
	{
		super();
		this.nomProf = nomProf;
		this.prenomProf = prenomProf;
		this.som = som;
		this.adresse = adresse;
		this.sex = sex;
		this.telCasUrg = telCasUrg;
		this.codeAff = codeAff;
		this.lieuxNaiss = lieuxNaiss;
		this.dateNaiss = dateNaiss;
		this.etatCivil = etatCivil;
		this.nationalite = nationalite;
		this.affectation = affectation;
		this.nomAr=nomar;
		this.prenomAr=prenomar;
		this.emailProf = emailProf;
		this.nbEnfants = nbEnfants;
		this.grade = grade;
		this.dateRecrutement=dateRecrutemenT;
		this.cinProf=cin;
	}
	
	public int getIdProf() {
		return idProf;
	}

	public void setIdProf(int idProf) {
		this.idProf = idProf;
	}

	public Grade getGrade() {
		return grade;
	}

	public void setGrade(Grade grade) {
		this.grade = grade;
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

	public String getNomAr() {
		return nomAr;
	}

	public void setNomAr(String nomAr) {
		this.nomAr = nomAr;
	}

	public String getPrenomAr() {
		return prenomAr;
	}

	public void setPrenomAr(String prenomAr) {
		this.prenomAr = prenomAr;
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

	public Date getDateRecrutement() {
		return dateRecrutement;
	}

	public void setDateRecrutement(Date dateRecrutement) {
		this.dateRecrutement = dateRecrutement;
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

	public Prof() {
		super();
	}
	public Prof(Grade grade, String cinProf, String nomProf, String prenomProf, String som, String adresse, String sex,
			String addCasUrg, String telCasUrg, String fonction, String codeAff, String lieuxNaiss, Date dateNaiss,
			String situationAct, String etatCivil, String nationalite, String affectation, String mp,
			boolean etatReprise, String emailProf, int nbEnfants,Date dateRecrutement,String nomAr,String prenomAr,String Cin) {
		super();
		this.grade = grade;
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
		this.nomAr=nomAr;
		this.prenomAr=prenomAr;
		this.nationalite = nationalite;
		this.affectation = affectation;
		this.mp = mp;
		this.etatReprise = etatReprise;
		this.emailProf = emailProf;
		this.nbEnfants = nbEnfants;
		this.dateRecrutement=dateRecrutement;
		this.cinProf=Cin;
	}
	
	
	

}