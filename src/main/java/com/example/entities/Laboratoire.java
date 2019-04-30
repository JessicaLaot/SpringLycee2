package com.example.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Laboratoire {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long idLaboratoire;
	private String nom;
	private int nombreOrdinateurs;
	
	@OneToMany (mappedBy="labo")
	List<Epreuve> épreuves;

	public Laboratoire() {
		
	}
	
	

	public Laboratoire(String nom, int nombreOrdinateurs, List<Epreuve> épreuves) {
		this.nom = nom;
		this.nombreOrdinateurs = nombreOrdinateurs;
		this.épreuves = épreuves;
	}



	public long getIdLaboratoire() {
		return idLaboratoire;
	}

	public void setIdLaboratoire(long idLaboratoire) {
		this.idLaboratoire = idLaboratoire;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getNombreOrdinateurs() {
		return nombreOrdinateurs;
	}

	public void setNombreOrdinateurs(int nombreOrdinateurs) {
		this.nombreOrdinateurs = nombreOrdinateurs;
	}

	public List<Epreuve> getÉpreuves() {
		return épreuves;
	}

	public void setÉpreuves(List<Epreuve> épreuves) {
		this.épreuves = épreuves;
	}
	
	

}
