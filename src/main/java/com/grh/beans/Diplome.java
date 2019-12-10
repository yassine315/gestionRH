/***********************************************************************
 * Module:  Diplome.java
 * Author:  SMI
 * Purpose: Defines the Class Diplome
 ***********************************************************************/
package com.grh.beans;
import java.util.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="diplome")

public class Diplome {
 @Id
 @GeneratedValue
 
   private int idDiplome;
 @Column(name="ID_DIPLOME")
 
   private int idProf;
 
private String nomDiplome; 
@Column(name="NOM_DIPLOME")

private Date dateD_obtention;  
@Column(name="DATE_D_OBTENTION")

private String specialite;
@Column(name="SPECIALITE")

public int getIdDiplome() {
	return idDiplome;
}
public void setIdDiplome(int idDiplome) {
	this.idDiplome = idDiplome;
}
public int getIdProf() {
	return idProf;
}
public void setIdProf(int idProf) {
	this.idProf = idProf;
}
public String getNomDiplome() {
	return nomDiplome;
}
public void setNomDiplome(String nomDiplome) {
	this.nomDiplome = nomDiplome;
}
public Date getDateD_obtention() {
	return dateD_obtention;
}
public void setDateD_obtention(Date dateD_obtention) {
	this.dateD_obtention = dateD_obtention;
}
public String getSpecialite() {
	return specialite;
}
public void setSpecialite(String specialite) {
	this.specialite = specialite;
}




}