/***********************************************************************
 * Module:  Conge.java
 * Author:  SMI
 * Purpose: Defines the Class Conge
 ***********************************************************************/
package com.grh.beans;
import java.util.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="conge")

public class Conge {
	
 @Id
 @GeneratedValue
	private int idConge; 
 @Column(name="ID_CONGE")
 
	private Date dateAllerConge;  
 @Column(name="DATE_ALLER_CONGE")
 
	private Date dateRetourConge;
 @Column(name="DATE_RETOUR_CONGE")
 
	private Date dateConge;
 @Column(name="CONGE")
 
public int getIdConge() {
	return idConge;
}
public void setIdConge(int idConge) {
	this.idConge = idConge;
}
public Date getDateAllerConge() {
	return dateAllerConge;
}
public void setDateAllerConge(Date dateAllerConge) {
	this.dateAllerConge = dateAllerConge;
}
public Date getDateRetourConge() {
	return dateRetourConge;
}
public void setDateRetourConge(Date dateRetourConge) {
	this.dateRetourConge = dateRetourConge;
}
public Date getDateConge() {
	return dateConge;
}
public void setDateConge(Date dateConge) {
	this.dateConge = dateConge;
}




}