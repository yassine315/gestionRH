/***********************************************************************
 * Module:  Mission.java
 * Author:  SMI
 * Purpose: Defines the Class Mission
 ***********************************************************************/
package com.grh.beans;
import java.util.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="mission")

public class Mission {
	@Id
	@GeneratedValue
	private int idMission;
	@Column(name="ID_MISSION")
	
	private String lieuxMission;
	@Column(name="LIEUX_MISSION")
	
	private Date dateDepartMiss;
	@Column(name="DATE_DEPART_MISS")
	
	private Date dateRetourMiss;
	@Column(name="DATE_RETOUR_MISS")
	
	private Date dateMission;
	@Column(name="DATE_MISSION")
	
	private String objet;
	@Column(name="OBJET")
	
	private String moyenTransport;
	@Column(name="MOYEN_TRANSPORT")
	
	public int getIdMission() {
		return idMission;
	}
	public void setIdMission(int idMission) {
		this.idMission = idMission;
	}
	public String getLieuxMission() {
		return lieuxMission;
	}
	public void setLieuxMission(String lieuxMission) {
		this.lieuxMission = lieuxMission;
	}
	public Date getDateDepartMiss() {
		return dateDepartMiss;
	}
	public void setDateDepartMiss(Date dateDepartMiss) {
		this.dateDepartMiss = dateDepartMiss;
	}
	public Date getDateRetourMiss() {
		return dateRetourMiss;
	}
	public void setDateRetourMiss(Date dateRetourMiss) {
		this.dateRetourMiss = dateRetourMiss;
	}
	public Date getDateMission() {
		return dateMission;
	}
	public void setDateMission(Date dateMission) {
		this.dateMission = dateMission;
	}
	public String getObjet() {
		return objet;
	}
	public void setObjet(String objet) {
		this.objet = objet;
	}
	public String getMoyenTransport() {
		return moyenTransport;
	}
	public void setMoyenTransport(String moyenTransport) {
		this.moyenTransport = moyenTransport;
	}
	

}