package com.example.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Eleve {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long idEleve;
	private String nom;
	private String prenom;
	private Date dateNaissance;
	
	@ManyToOne(cascade=CascadeType.ALL)
	private Section section;
	
	@ManyToMany(mappedBy="eleves")
	List<Epreuve> epreuves;

	public Eleve(String nom, String prenom, Date dateNaissance, Section section, List<Epreuve> epreuves) {
		
		this.nom = nom;
		this.prenom = prenom;
		this.dateNaissance = dateNaissance;
		this.section = section;
		this.epreuves = epreuves;
	}
	
	public long getIdEleve() {
		return idEleve;
	}

	public void setIdEleve(long idEleve) {
		this.idEleve = idEleve;
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

	public Date getDateNaissance() {
		return dateNaissance;
	}

	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	public Section getSection() {
		return section;
	}

	public void setSection(Section section) {
		this.section = section;
	}

	public List<Epreuve> getEpreuves() {
		return epreuves;
	}

	public void setEpreuves(List<Epreuve> epreuves) {
		this.epreuves = epreuves;
	}

	public Eleve() {
		
	}
	
	
	
}
