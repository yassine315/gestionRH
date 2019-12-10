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
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="prof")
public class Prof {
   
	@Id @GeneratedValue
	@Column(name = "id_prof")
	private int idProf; 
	
	@Column(name = "cin_prof")
	private String cinProf;
	
	@Column(name = "nom_prof")
	private String nomProf;
	
	@Column(name = "prenom_prof")
	private String prenomProf;
	
	@Column(name = "som")
	private String som;
	
	@Column(name = "adresse")
	private String adresse;
	
	@Column(name = "sexe")
	private String sexe;
	
	@Column(name = "addcasurg")
	private String addCasUrg;  
	
	@Column(name = "telcasurg")
	private String telCasUrg;
	
	@Column(name = "fonction")
	private String fonction;
	
	@Column(name = "code_aff")
	private String codeAff;
	
	@Column(name = "lieux_naiss")
	private String lieuxNaiss;
	
	@Column(name = "date_naiss")
	private Date dateNaiss;
	
	@Column(name = "situation_act")
	private String situationAct;
	
	@Column(name = "etat_civil")
	private String etatCivil;
	
	@Column(name = "nationalite")
	private String nationalite;
	
	@Column(name = "affectation")
	private String affectation;
	
	@Column(name = "mp")
	private String mp;
	
	@Column(name = "etat_reprise")
	private boolean etatReprise;
	
	@Column(name = "email_prof")
	private String emailProf;
	
	@Column(name = "nb_enfants")
	private int nbEnfants;

	
	//private List<Conge> conge;
	//private List enseigner;
	//private List<Module> module;
	//private List<Attestation> attestation;
	//private List<QuitterTerrit> quitterTerrit;
	//private List<Mission> mission;
	//private List<Diplome> diplome;
   

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

public String getSexe() {
	return sexe;
}

public void setSexe(String sexe) {
	this.sexe = sexe;
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

@Override
public String toString() {
	return "Prof [idProf=" + idProf + ", cinProf=" + cinProf + ", nomProf=" + nomProf + ", prenomProf=" + prenomProf
			+ ", som=" + som + ", adresse=" + adresse + ", sexe=" + sexe + ", addCasUrg=" + addCasUrg + ", telCasUrg="
			+ telCasUrg + ", fonction=" + fonction + ", codeAff=" + codeAff + ", lieuxNaiss=" + lieuxNaiss
			+ ", dateNaiss=" + dateNaiss + ", situationAct=" + situationAct + ", etatCivil=" + etatCivil
			+ ", nationalite=" + nationalite + ", affectation=" + affectation + ", mp=" + mp + ", etatReprise="
			+ etatReprise + ", emailProf=" + emailProf + ", nbEnfants=" + nbEnfants + "]";
}






}