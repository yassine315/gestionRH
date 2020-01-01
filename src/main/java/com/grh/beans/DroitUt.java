/***********************************************************************
 * Module:  DroitUt.java
 * Author:  SMI
 * Purpose: Defines the Class DroitUt
 ***********************************************************************/
package com.grh.beans ;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="droit_ut")

public class DroitUt {
   public DroitUt(int idDroit, String nomDroit) {
		super();
		this.idDroit = idDroit;
		this.nomDroit = nomDroit;
	}
public DroitUt() {
		super();
		// TODO Auto-generated constructor stub
	}
@Id
   @GeneratedValue
   @Column(name="ID_DROIT")
	private int idDroit;

@Column(name="NOM_DROIT")
   private String nomDroit;
  
   
public int getIdDroit() {
	return idDroit;
}
public void setIdDroit(int idDroit) {
	this.idDroit = idDroit;
}
public String getNomDroit() {
	return nomDroit;
}
public void setNomDroit(String nomDroit) {
	this.nomDroit = nomDroit;
}
   
   
   
   
  

}