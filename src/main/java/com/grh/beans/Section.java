/***********************************************************************
 * Module:  Section.java
 * Author:  SMI
 * Purpose: Defines the Class Section
 ***********************************************************************/
package com.grh.beans;
import java.util.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;

@Entity
@Table(name="section")

public class Section {
	
	@GeneratedValue 
   public int idSection;
	@Column(name="ID_SECTION")
	
   public String nomSection;
	public int getIdSection() {
		return idSection;
	}
	public void setIdSection(int idSection) {
		this.idSection = idSection;
	}
	public String getNomSection() {
		return nomSection;
	}
	public void setNomSection(String nomSection) {
		this.nomSection = nomSection;
	}
	

}