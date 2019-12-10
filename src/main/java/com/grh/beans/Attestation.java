/***********************************************************************
 * Module:  Attestation.java
 * Author:  SMI
 * Purpose: Defines the Class Attestation
 ***********************************************************************/
package com.grh.beans;
import java.util.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;

@Entity
@Table(name="Atestation")

public class Attestation {
	
   @GeneratedValue
   private int idAttestation;
   @Column(name="ID_ATTESTAION")
   
   private Date dateTravail;
   @Column(name="DATE_TRAVAIL")
   
   private String nomAttest;
   @Column(name="NOM_ATTEST")
   
public int getIdAttestation() {
	return idAttestation;
}
public void setIdAttestation(int idAttestation) {
	this.idAttestation = idAttestation;
}
public Date getDateTravail() {
	return dateTravail;
}
public void setDateTravail(Date dateTravail) {
	this.dateTravail = dateTravail;
}
public String getNomAttest() {
	return nomAttest;
}
public void setNomAttest(String nomAttest) {
	this.nomAttest = nomAttest;
}

   
}