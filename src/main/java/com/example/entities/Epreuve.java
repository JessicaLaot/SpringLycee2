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
import javax.persistence.OneToOne;

@Entity
public class Epreuve {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long idEpreuve;
	private Date dateEpreuve;
	
	@OneToOne
	private Matiere matiere;
	
	@ManyToOne
	private Laboratoire labo;
	
	@ManyToMany(cascade =  CascadeType.ALL)
	@JoinTable(
			name = "Convocations",
			joinColumns=@JoinColumn(name= "id_epreuve", referencedColumnName = "idEpreuve"),
			inverseJoinColumns=@JoinColumn(name = "mat_eleve", referencedColumnName = "idEleve")
			)
	private List<Eleve> eleves;

	
	
	public Epreuve(Date dateEpreuve, Matiere matiere, Laboratoire labo, List<Eleve> eleves) {
		super();
		this.dateEpreuve = dateEpreuve;
		this.matiere = matiere;
		this.labo = labo;
		this.eleves = eleves;
	}

	public Epreuve() {
	
	}

	public long getIdEpreuve() {
		return idEpreuve;
	}

	public void setIdEpreuve(long idEpreuve) {
		this.idEpreuve = idEpreuve;
	}

	public Date getDateEpreuve() {
		return dateEpreuve;
	}

	public void setDateEpreuve(Date dateEpreuve) {
		this.dateEpreuve = dateEpreuve;
	}

	public Matiere getMatiere() {
		return matiere;
	}

	public void setMatiere(Matiere matiere) {
		this.matiere = matiere;
	}

	public Laboratoire getLabo() {
		return labo;
	}

	public void setLabo(Laboratoire labo) {
		this.labo = labo;
	}

	public List<Eleve> getEleves() {
		return eleves;
	}

	public void setEleves(List<Eleve> eleves) {
		this.eleves = eleves;
	}

	
	

}
