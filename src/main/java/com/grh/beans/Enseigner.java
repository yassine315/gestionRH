/***********************************************************************
 * Module:  Enseigner.java
 * Author:  SMI
 * Purpose: Defines the Class Enseigner
 ***********************************************************************/
package com.grh.beans;
import java.util.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="enseigner")

public class Enseigner {
  @Id
  @GeneratedValue
 
  
  private int nbCours;
  @Column(name="NB_COURS")
  
   private int nbTds; 
  @Column(name="NB_TD")
  
   private int nbTps;
  @Column(name="NB_TPS")
  
   private int ev;
  @Column(name="EV")
  
   private ElementModule elementModuleA;
  
   private Prof profB;

public int getNbCours() {
	return nbCours;
}

public void setNbCours(int nbCours) {
	this.nbCours = nbCours;
}

public int getNbTds() {
	return nbTds;
}

public void setNbTds(int nbTds) {
	this.nbTds = nbTds;
}

public int getNbTps() {
	return nbTps;
}

public void setNbTps(int nbTps) {
	this.nbTps = nbTps;
}

public int getEv() {
	return ev;
}

public void setEv(int ev) {
	this.ev = ev;
}

public ElementModule getElementModuleA() {
	return elementModuleA;
}

public void setElementModuleA(ElementModule elementModuleA) {
	this.elementModuleA = elementModuleA;
}

public Prof getProfB() {
	return profB;
}

public void setProfB(Prof profB) {
	this.profB = profB;
}

}