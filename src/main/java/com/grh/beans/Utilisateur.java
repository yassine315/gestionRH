/***********************************************************************
 * Module:  Utilisateur.java
 * Author:  SMI
 * Purpose: Defines the Class Utilisateur
 ***********************************************************************/
package com.grh.beans;
import java.util.*;


public class Utilisateur {
  
	private int idUt;
	private String cinUt;
	private String nomUt;
	private String prenomUt;
	private String emailUt;
	private String mpUt;
	private String telUt;
	private Collection<Utilisateur> utilisateurB;
	private Collection<Utilisateur> utilisateurA;
	private Collection<DroitUt> droitUt;
	private Collection<Filiere> filiere;
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<Utilisateur> getUtilisateurB() {
      if (utilisateurB == null)
         utilisateurB = new java.util.HashSet<Utilisateur>();
      return utilisateurB;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorUtilisateurB() {
      if (utilisateurB == null)
         utilisateurB = new java.util.HashSet<Utilisateur>();
      return utilisateurB.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newUtilisateurB */
   public void setUtilisateurB(java.util.Collection<Utilisateur> newUtilisateurB) {
      removeAllUtilisateurB();
      for (java.util.Iterator iter = newUtilisateurB.iterator(); iter.hasNext();)
         addUtilisateurB((Utilisateur)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newUtilisateur */
   public void addUtilisateurB(Utilisateur newUtilisateur) {
      if (newUtilisateur == null)
         return;
      if (this.utilisateurB == null)
         this.utilisateurB = new java.util.HashSet<Utilisateur>();
      if (!this.utilisateurB.contains(newUtilisateur))
      {
         this.utilisateurB.add(newUtilisateur);
         newUtilisateur.addUtilisateurA(this);      
      }
   }
   
   /** @pdGenerated default remove
     * @param oldUtilisateur */
   public void removeUtilisateurB(Utilisateur oldUtilisateur) {
      if (oldUtilisateur == null)
         return;
      if (this.utilisateurB != null)
         if (this.utilisateurB.contains(oldUtilisateur))
         {
            this.utilisateurB.remove(oldUtilisateur);
            oldUtilisateur.removeUtilisateurA(this);
         }
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllUtilisateurB() {
      if (utilisateurB != null)
      {
         Utilisateur oldUtilisateur;
         for (java.util.Iterator iter = getIteratorUtilisateurB(); iter.hasNext();)
         {
            oldUtilisateur = (Utilisateur)iter.next();
            iter.remove();
            oldUtilisateur.removeUtilisateurA(this);
         }
      }
   }
   /** @pdGenerated default getter */
   public java.util.Collection<Utilisateur> getUtilisateurA() {
      if (utilisateurA == null)
         utilisateurA = new java.util.HashSet<Utilisateur>();
      return utilisateurA;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorUtilisateurA() {
      if (utilisateurA == null)
         utilisateurA = new java.util.HashSet<Utilisateur>();
      return utilisateurA.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newUtilisateurA */
   public void setUtilisateurA(java.util.Collection<Utilisateur> newUtilisateurA) {
      removeAllUtilisateurA();
      for (java.util.Iterator iter = newUtilisateurA.iterator(); iter.hasNext();)
         addUtilisateurA((Utilisateur)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newUtilisateur */
   public void addUtilisateurA(Utilisateur newUtilisateur) {
      if (newUtilisateur == null)
         return;
      if (this.utilisateurA == null)
         this.utilisateurA = new java.util.HashSet<Utilisateur>();
      if (!this.utilisateurA.contains(newUtilisateur))
      {
         this.utilisateurA.add(newUtilisateur);
         newUtilisateur.addUtilisateurB(this);      
      }
   }
   
   /** @pdGenerated default remove
     * @param oldUtilisateur */
   public void removeUtilisateurA(Utilisateur oldUtilisateur) {
      if (oldUtilisateur == null)
         return;
      if (this.utilisateurA != null)
         if (this.utilisateurA.contains(oldUtilisateur))
         {
            this.utilisateurA.remove(oldUtilisateur);
            oldUtilisateur.removeUtilisateurB(this);
         }
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllUtilisateurA() {
      if (utilisateurA != null)
      {
         Utilisateur oldUtilisateur;
         for (java.util.Iterator iter = getIteratorUtilisateurA(); iter.hasNext();)
         {
            oldUtilisateur = (Utilisateur)iter.next();
            iter.remove();
            oldUtilisateur.removeUtilisateurB(this);
         }
      }
   }
   /** @pdGenerated default getter */
   public java.util.Collection<DroitUt> getDroitUt() {
      if (droitUt == null)
         droitUt = new java.util.HashSet<DroitUt>();
      return droitUt;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorDroitUt() {
      if (droitUt == null)
         droitUt = new java.util.HashSet<DroitUt>();
      return droitUt.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newDroitUt */
   public void setDroitUt(java.util.Collection<DroitUt> newDroitUt) {
      removeAllDroitUt();
      for (java.util.Iterator iter = newDroitUt.iterator(); iter.hasNext();)
         addDroitUt((DroitUt)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newDroitUt */
   public void addDroitUt(DroitUt newDroitUt) {
      if (newDroitUt == null)
         return;
      if (this.droitUt == null)
         this.droitUt = new java.util.HashSet<DroitUt>();
      if (!this.droitUt.contains(newDroitUt))
      {
         this.droitUt.add(newDroitUt);
         newDroitUt.addUtilisateur(this);      
      }
   }
   
   /** @pdGenerated default remove
     * @param oldDroitUt */
   public void removeDroitUt(DroitUt oldDroitUt) {
      if (oldDroitUt == null)
         return;
      if (this.droitUt != null)
         if (this.droitUt.contains(oldDroitUt))
         {
            this.droitUt.remove(oldDroitUt);
            oldDroitUt.removeUtilisateur(this);
         }
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllDroitUt() {
      if (droitUt != null)
      {
         DroitUt oldDroitUt;
         for (java.util.Iterator iter = getIteratorDroitUt(); iter.hasNext();)
         {
            oldDroitUt = (DroitUt)iter.next();
            iter.remove();
            oldDroitUt.removeUtilisateur(this);
         }
      }
   }
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
         newFiliere.addUtilisateur(this);      
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
            oldFiliere.removeUtilisateur(this);
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
            oldFiliere.removeUtilisateur(this);
         }
      }
   }

}