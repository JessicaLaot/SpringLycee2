package com.example.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Section {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long idSection;
	private String libelle;
	
	@OneToMany (mappedBy="section")
	List<Matiere> matieres;
	
	@OneToMany
	List<Eleve> eleves;
	
	public Section() {
		// TODO Auto-generated constructor stub
	}

	public Section(String libelle, List<Matiere> matieres, List<Eleve> eleves) {
	
		this.libelle = libelle;
		this.matieres = matieres;
		this.eleves = eleves;
	}

	public long getIdSection() {
		return idSection;
	}

	public void setIdSection(long idSection) {
		this.idSection = idSection;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public List<Matiere> getMatieres() {
		return matieres;
	}

	public void setMatieres(List<Matiere> matieres) {
		this.matieres = matieres;
	}

	public List<Eleve> getEleves() {
		return eleves;
	}

	public void setEleves(List<Eleve> eleves) {
		this.eleves = eleves;
	}
	
	
	

}
