package com.example.entities;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Matiere {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long idMatiere;
	private String libelle;
	private float duree;
	private float coefficient;
	
	@ManyToOne (cascade= CascadeType.ALL)
	private Section section;
	
	@OneToOne
	private Epreuve epreuve;

	public Matiere(String libelle, float duree, float coefficient, Section section, Epreuve epreuve) {

		this.libelle = libelle;
		this.duree = duree;
		this.coefficient = coefficient;
		this.section = section;
		this.epreuve = epreuve;
	}
	
	
	public Matiere() {
		// TODO Auto-generated constructor stub
	}


	public long getIdMatiere() {
		return idMatiere;
	}


	public void setIdMatiere(long idMatiere) {
		this.idMatiere = idMatiere;
	}


	public String getLibelle() {
		return libelle;
	}


	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}


	public float getDuree() {
		return duree;
	}


	public void setDuree(float duree) {
		this.duree = duree;
	}


	public float getCoefficient() {
		return coefficient;
	}


	public void setCoefficient(float coefficient) {
		this.coefficient = coefficient;
	}


	public Section getSection() {
		return section;
	}


	public void setSection(Section section) {
		this.section = section;
	}


	public Epreuve getEpreuve() {
		return epreuve;
	}


	public void setEpreuve(Epreuve epreuve) {
		this.epreuve = epreuve;
	}
	
	

}
