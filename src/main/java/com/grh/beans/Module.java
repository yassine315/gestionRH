/***********************************************************************
 * Module:  Module.java
 * Author:  SMI
 * Purpose: Defines the Class Module
 ***********************************************************************/
package com.grh.beans;
import java.util.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="module")

public class Module {
  @Id
  @GeneratedValue
  
   private int idModule;
  @Column(name="ID_MODULE")
  
   private String nomModule; 
  @Column(name="NOM_MODULE")
  
   private String semestreModule;
  @Column(name="SEMESTRE_MODULE")
  
   private List<Filiere> filiere;
   private List<ElementModule> elementModule;
public int getIdModule() {
	return idModule;
}
public void setIdModule(int idModule) {
	this.idModule = idModule;
}
public String getNomModule() {
	return nomModule;
}
public void setNomModule(String nomModule) {
	this.nomModule = nomModule;
}
public String getSemestreModule() {
	return semestreModule;
}
public void setSemestreModule(String semestreModule) {
	this.semestreModule = semestreModule;
}
public List<Filiere> getFiliere() {
	return filiere;
}
public void setFiliere(List<Filiere> filiere) {
	this.filiere = filiere;
}
public List<ElementModule> getElementModule() {
	return elementModule;
}
public void setElementModule(List<ElementModule> elementModule) {
	this.elementModule = elementModule;
}
   
   
  

}