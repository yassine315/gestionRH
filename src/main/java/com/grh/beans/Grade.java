/***********************************************************************
 * Module:  Grade.java
 * Author:  SMI
 * Purpose: Defines the Class Grade
 ***********************************************************************/
package com.grh.beans;
import java.util.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="grade")
public class Grade {
   @Id
   @GeneratedValue
   @Column(name="ID_GRADE")
   private int idGrade;
   
   @Column(name="grade")
   private String grade;
   
   @Column(name="ECHELON")
   private String echelon;
   
   
   @Column(name="CADRE_GRADE")
   private String cadreGrade;
   
   
   //private List segrader;


   
public String getEchelon() {
	return echelon;
}
public int getIdGrade() {
	return idGrade;
}
public void setIdGrade(int idGrade) {
	this.idGrade = idGrade;
}
public String getGrade() {
	return grade;
}
public void setGrade(String grade) {
	this.grade = grade;
}
public void setEchelon(String echelon) {
	this.echelon = echelon;
}

public String getCadreGrade() {
	return cadreGrade;
}
public void setCadreGrade(String cadreGrade) {
	this.cadreGrade = cadreGrade;
}

   

}