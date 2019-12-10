/***********************************************************************
 * Module:  Filiere.java
 * Author:  SMI
 * Purpose: Defines the Class Filiere
 ***********************************************************************/
package com.grh.beans;
import java.util.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="filiere")

public class Filiere {
   @Id
   @GeneratedValue
	private int idFiliere;
   @Column(name="ID_FILIERE")
   
    private int IdProf;
   
	private String formation;
   @Column(name="FORMATION")
   
	private String nomFiliere;
   @Column(name="NOM_FILIERE")
   
	private List<Utilisateur> utilisateur;
	private List<Module> module;
	private List<Section> section;
	public int getIdFiliere() {
		return idFiliere;
	}
	public void setIdFiliere(int idFiliere) {
		this.idFiliere = idFiliere;
	}
	public int getIdProf() {
		return IdProf;
	}
	public void setIdProf(int idProf) {
		IdProf = idProf;
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
	public List<Utilisateur> getUtilisateur() {
		return utilisateur;
	}
	public void setUtilisateur(List<Utilisateur> utilisateur) {
		this.utilisateur = utilisateur;
	}
	public List<Module> getModule() {
		return module;
	}
	public void setModule(List<Module> module) {
		this.module = module;
	}
	public List<Section> getSection() {
		return section;
	}
	public void setSection(List<Section> section) {
		this.section = section;
	}
   
   
}