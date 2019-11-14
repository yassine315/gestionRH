package com.grh.beans;



/**
 * class a completer
 * @author Yassine
 *
 */

public class Professeur {
	
	private int som;
	private String nom;
	private String prenom;
	
	

	/**
	 * @param som  identifiant de professeur
	 * @param nom 	nom de professeur
	 * @param prenom prenom de professeur
	 */
	public Professeur(int som, String nom, String prenom) {
		super();
		this.som = som;
		this.nom = nom;
		this.prenom = prenom;
	}
	
	
	/**
	 * @return l'edentifiant de professeur
	 */
	public int getSom() {
		return som;
	}
	
	
	
	public void setSom(int som) {
		this.som = som;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	

	
}
