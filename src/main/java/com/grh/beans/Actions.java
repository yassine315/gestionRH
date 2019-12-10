/***********************************************************************
 * Module:  Actions.java
 * Author:  SMI
 * Purpose: Defines the Class Actions
 ***********************************************************************/
package com.grh.beans;
import java.util.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Actions")

public class Actions {
   @Id
   @GeneratedValue
 private int idAction;  
   
 private Date dateAction;  
 private Date heureAction;  
 private String nomAction;

}