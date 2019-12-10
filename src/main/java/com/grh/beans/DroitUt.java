/***********************************************************************
 * Module:  DroitUt.java
 * Author:  SMI
 * Purpose: Defines the Class DroitUt
 ***********************************************************************/
package com.grh.beans ;
import java.util.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="droit_ut")

public class DroitUt {
   @Id
   @GeneratedValue
   
	private int idDroit;
   @Column(name="ID_DROIT")
   
   private String nomDroit;
   @Column(name="NOM_DROIT")
   
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