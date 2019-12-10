/***********************************************************************
 * Module:  ElementModule.java
 * Author:  SMI
 * Purpose: Defines the Class ElementModule
 ***********************************************************************/
package com.grh.beans;
import java.util.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="element_module")

public class ElementModule {
   @Id
   @GeneratedValue
   
   private int idElem;
   @Column(name="ID_ELEM")
   
   private int nomElem; 
   @Column(name="NOM_ELEM")
   
   private List enseigner;
public int getIdElem() {
	return idElem;
}
public void setIdElem(int idElem) {
	this.idElem = idElem;
}
public int getNomElem() {
	return nomElem;
}
public void setNomElem(int nomElem) {
	this.nomElem = nomElem;
}
public List getEnseigner() {
	return enseigner;
}
public void setEnseigner(List enseigner) {
	this.enseigner = enseigner;
}
   
   

}