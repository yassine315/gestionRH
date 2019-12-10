/***********************************************************************
 * Module:  Filiere.java
 * Author:  SMI
 * Purpose: Defines the Class Filiere
 ***********************************************************************/
package com.grh.beans;
import java.util.*;


public class Filiere {
   
	private int idFiliere;
	private String formation;
	private String nomFiliere;
	private Collection<Utilisateur> utilisateur;
	private Collection<Module> module;
	private Collection<Section> section;
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<Utilisateur> getUtilisateur() {
      if (utilisateur == null)
         utilisateur = new java.util.HashSet<Utilisateur>();
      return utilisateur;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorUtilisateur() {
      if (utilisateur == null)
         utilisateur = new java.util.HashSet<Utilisateur>();
      return utilisateur.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newUtilisateur */
   public void setUtilisateur(java.util.Collection<Utilisateur> newUtilisateur) {
      removeAllUtilisateur();
      for (java.util.Iterator iter = newUtilisateur.iterator(); iter.hasNext();)
         addUtilisateur((Utilisateur)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newUtilisateur */
   public void addUtilisateur(Utilisateur newUtilisateur) {
      if (newUtilisateur == null)
         return;
      if (this.utilisateur == null)
         this.utilisateur = new java.util.HashSet<Utilisateur>();
      if (!this.utilisateur.contains(newUtilisateur))
      {
         this.utilisateur.add(newUtilisateur);
         newUtilisateur.addFiliere(this);      
      }
   }
   
   /** @pdGenerated default remove
     * @param oldUtilisateur */
   public void removeUtilisateur(Utilisateur oldUtilisateur) {
      if (oldUtilisateur == null)
         return;
      if (this.utilisateur != null)
         if (this.utilisateur.contains(oldUtilisateur))
         {
            this.utilisateur.remove(oldUtilisateur);
            oldUtilisateur.removeFiliere(this);
         }
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllUtilisateur() {
      if (utilisateur != null)
      {
         Utilisateur oldUtilisateur;
         for (java.util.Iterator iter = getIteratorUtilisateur(); iter.hasNext();)
         {
            oldUtilisateur = (Utilisateur)iter.next();
            iter.remove();
            oldUtilisateur.removeFiliere(this);
         }
      }
   }
   /** @pdGenerated default getter */
   public java.util.Collection<Module> getModule() {
      if (module == null)
         module = new java.util.HashSet<Module>();
      return module;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorModule() {
      if (module == null)
         module = new java.util.HashSet<Module>();
      return module.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newModule */
   public void setModule(java.util.Collection<Module> newModule) {
      removeAllModule();
      for (java.util.Iterator iter = newModule.iterator(); iter.hasNext();)
         addModule((Module)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newModule */
   public void addModule(Module newModule) {
      if (newModule == null)
         return;
      if (this.module == null)
         this.module = new java.util.HashSet<Module>();
      if (!this.module.contains(newModule))
      {
         this.module.add(newModule);
         newModule.addFiliere(this);      
      }
   }
   
   /** @pdGenerated default remove
     * @param oldModule */
   public void removeModule(Module oldModule) {
      if (oldModule == null)
         return;
      if (this.module != null)
         if (this.module.contains(oldModule))
         {
            this.module.remove(oldModule);
            oldModule.removeFiliere(this);
         }
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllModule() {
      if (module != null)
      {
         Module oldModule;
         for (java.util.Iterator iter = getIteratorModule(); iter.hasNext();)
         {
            oldModule = (Module)iter.next();
            iter.remove();
            oldModule.removeFiliere(this);
         }
      }
   }
   /** @pdGenerated default getter */
   public java.util.Collection<Section> getSection() {
      if (section == null)
         section = new java.util.HashSet<Section>();
      return section;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorSection() {
      if (section == null)
         section = new java.util.HashSet<Section>();
      return section.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newSection */
   public void setSection(java.util.Collection<Section> newSection) {
      removeAllSection();
      for (java.util.Iterator iter = newSection.iterator(); iter.hasNext();)
         addSection((Section)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newSection */
   public void addSection(Section newSection) {
      if (newSection == null)
         return;
      if (this.section == null)
         this.section = new java.util.HashSet<Section>();
      if (!this.section.contains(newSection))
         this.section.add(newSection);
   }
   
   /** @pdGenerated default remove
     * @param oldSection */
   public void removeSection(Section oldSection) {
      if (oldSection == null)
         return;
      if (this.section != null)
         if (this.section.contains(oldSection))
            this.section.remove(oldSection);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllSection() {
      if (section != null)
         section.clear();
   }

}