/***********************************************************************
 * Module:  Module.java
 * Author:  SMI
 * Purpose: Defines the Class Module
 ***********************************************************************/
package com.grh.beans;
import java.util.*;


public class Module {
  
   private int idModule;   
   private String nomModule; 
   private String semestreModule;
   private Collection<Filiere> filiere;
   private Collection<ElementModule> elementModule;
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<Filiere> getFiliere() {
      if (filiere == null)
         filiere = new java.util.HashSet<Filiere>();
      return filiere;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorFiliere() {
      if (filiere == null)
         filiere = new java.util.HashSet<Filiere>();
      return filiere.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newFiliere */
   public void setFiliere(java.util.Collection<Filiere> newFiliere) {
      removeAllFiliere();
      for (java.util.Iterator iter = newFiliere.iterator(); iter.hasNext();)
         addFiliere((Filiere)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newFiliere */
   public void addFiliere(Filiere newFiliere) {
      if (newFiliere == null)
         return;
      if (this.filiere == null)
         this.filiere = new java.util.HashSet<Filiere>();
      if (!this.filiere.contains(newFiliere))
      {
         this.filiere.add(newFiliere);
         newFiliere.addModule(this);      
      }
   }
   
   /** @pdGenerated default remove
     * @param oldFiliere */
   public void removeFiliere(Filiere oldFiliere) {
      if (oldFiliere == null)
         return;
      if (this.filiere != null)
         if (this.filiere.contains(oldFiliere))
         {
            this.filiere.remove(oldFiliere);
            oldFiliere.removeModule(this);
         }
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllFiliere() {
      if (filiere != null)
      {
         Filiere oldFiliere;
         for (java.util.Iterator iter = getIteratorFiliere(); iter.hasNext();)
         {
            oldFiliere = (Filiere)iter.next();
            iter.remove();
            oldFiliere.removeModule(this);
         }
      }
   }
   /** @pdGenerated default getter */
   public java.util.Collection<ElementModule> getElementModule() {
      if (elementModule == null)
         elementModule = new java.util.HashSet<ElementModule>();
      return elementModule;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorElementModule() {
      if (elementModule == null)
         elementModule = new java.util.HashSet<ElementModule>();
      return elementModule.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newElementModule */
   public void setElementModule(java.util.Collection<ElementModule> newElementModule) {
      removeAllElementModule();
      for (java.util.Iterator iter = newElementModule.iterator(); iter.hasNext();)
         addElementModule((ElementModule)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newElementModule */
   public void addElementModule(ElementModule newElementModule) {
      if (newElementModule == null)
         return;
      if (this.elementModule == null)
         this.elementModule = new java.util.HashSet<ElementModule>();
      if (!this.elementModule.contains(newElementModule))
         this.elementModule.add(newElementModule);
   }
   
   /** @pdGenerated default remove
     * @param oldElementModule */
   public void removeElementModule(ElementModule oldElementModule) {
      if (oldElementModule == null)
         return;
      if (this.elementModule != null)
         if (this.elementModule.contains(oldElementModule))
            this.elementModule.remove(oldElementModule);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllElementModule() {
      if (elementModule != null)
         elementModule.clear();
   }

}