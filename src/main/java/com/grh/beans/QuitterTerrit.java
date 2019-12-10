/***********************************************************************
 * Module:  QuitterTerrit.java
 * Author:  SMI
 * Purpose: Defines the Class QuitterTerrit
 ***********************************************************************/
package com.grh.beans;
import java.util.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="quitter_territ")

public class QuitterTerrit {
   
	@Id
	@GeneratedValue
	
   private int idQuitter;
	@Column(name="ID_QUITTER")
	
   private Date dateQuitter;
	@Column(name="DATE_QUITTER")
	
   private String raison;
	@Column(name="RAISON")
	
   private Date dateAllerQuiter;
	@Column(name="DATE_ALLER_QUITER")
	
   private Date dateRetourQuiter;
	@Column(name="DATE_RETOUR_QUITER")
	
	public int getIdQuitter() {
		return idQuitter;
	}
	public void setIdQuitter(int idQuitter) {
		this.idQuitter = idQuitter;
	}
	public Date getDateQuitter() {
		return dateQuitter;
	}
	public void setDateQuitter(Date dateQuitter) {
		this.dateQuitter = dateQuitter;
	}
	public String getRaison() {
		return raison;
	}
	public void setRaison(String raison) {
		this.raison = raison;
	}
	public Date getDateAllerQuiter() {
		return dateAllerQuiter;
	}
	public void setDateAllerQuiter(Date dateAllerQuiter) {
		this.dateAllerQuiter = dateAllerQuiter;
	}
	public Date getDateRetourQuiter() {
		return dateRetourQuiter;
	}
	public void setDateRetourQuiter(Date dateRetourQuiter) {
		this.dateRetourQuiter = dateRetourQuiter;
	}
	

}