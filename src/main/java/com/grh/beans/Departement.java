/***********************************************************************
 * Module:  Departement.java
 * Author:  SMI
 * Purpose: Defines the Class Departement
 ***********************************************************************/
package com.grh.beans;
import java.util.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="departement")

public class Departement {
  @Id
  @GeneratedValue
   public int idDept;
  @Column(name="ID_DEPT")
  
  public int idProf;
  
   public String nomDept;
   @Column(name="NOM_DEPT")
   
public int getIdDept() {
	return idDept;
}

public void setIdDept(int idDept) {
	this.idDept = idDept;
}

public int getIdProf() {
	return idProf;
}

public void setIdProf(int idProf) {
	this.idProf = idProf;
}

public String getNomDept() {
	return nomDept;
}

public void setNomDept(String nomDept) {
	this.nomDept = nomDept;
}
   

   
}