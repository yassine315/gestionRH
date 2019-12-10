/***********************************************************************
 * Module:  Segrader.java
 * Author:  SMI
 * Purpose: Defines the Class Segrader
 ***********************************************************************/
package com.grh.beans;
import java.util.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

@Entity

public class Segrader {
	@GeneratedValue 
  private Date dateNvgrade;   
   private Prof profA;

}