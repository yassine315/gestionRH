/***********************************************************************
 * Module:  Action.java
 * Author:  SMI
 * Purpose: Defines the Class Action
 ***********************************************************************/
package com.grh.beans;
import java.util.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Action")


public class Action { 
   
	@Id
	  @GeneratedValue
	private int id_act;
	@Column(name="ID_ACTION")
	
	
	private Date date;
	@Column(name="DATE")
	
	private Date heure;
	@Column(name="HEURE")
	
	private String nomAct;
	@Column(name="NOM_ACT")
	
	private Utilisateur utilisateur;
	private Departement departement;
	private Attestation attestation;
	private QuitterTerrit quitterTerrit;
	private Conge conge;
	private Mission mission;
	private Prof prof;
	private Grade grade;
	public int getId_act() {
		return id_act;
	}
	public void setId_act(int id_act) {
		this.id_act = id_act;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Date getHeure() {
		return heure;
	}
	public void setHeure(Date heure) {
		this.heure = heure;
	}
	public String getNomAct() {
		return nomAct;
	}
	public void setNomAct(String nomAct) {
		this.nomAct = nomAct;
	}
	public Utilisateur getUtilisateur() {
		return utilisateur;
	}
	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}
	public Departement getDepartement() {
		return departement;
	}
	public void setDepartement(Departement departement) {
		this.departement = departement;
	}
	public Attestation getAttestation() {
		return attestation;
	}
	public void setAttestation(Attestation attestation) {
		this.attestation = attestation;
	}
	public QuitterTerrit getQuitterTerrit() {
		return quitterTerrit;
	}
	public void setQuitterTerrit(QuitterTerrit quitterTerrit) {
		this.quitterTerrit = quitterTerrit;
	}
	public Conge getConge() {
		return conge;
	}
	public void setConge(Conge conge) {
		this.conge = conge;
	}
	public Mission getMission() {
		return mission;
	}
	public void setMission(Mission mission) {
		this.mission = mission;
	}
	public Prof getProf() {
		return prof;
	}
	public void setProf(Prof prof) {
		this.prof = prof;
	}
	public Grade getGrade() {
		return grade;
	}
	public void setGrade(Grade grade) {
		this.grade = grade;
	}
	
	

}