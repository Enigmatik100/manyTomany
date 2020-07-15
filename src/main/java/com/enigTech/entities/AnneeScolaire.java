package com.enigTech.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
//@Table(name = "ANNEESCOLAIRE")
public class AnneeScolaire {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long anneeScolaireId;
	
	private String lib;
	
	
	public AnneeScolaire(String lib) {
		super();
		this.lib = lib;
	}

	@OneToMany(mappedBy = "anneeScolaire", cascade = CascadeType.ALL)
	private List<ClasseAnneeScolaire> anneeScolaires = new ArrayList<>();


	public AnneeScolaire() {		
	}
	
	public AnneeScolaire(String lib, List<ClasseAnneeScolaire> anneeScolaires) {
		this.lib = lib;
		this.anneeScolaires = anneeScolaires;
	}

	public Long getAnneeScolaireId() {
		return anneeScolaireId;
	}

	public void setAnneeScolaireId(Long anneeScolaireId) {
		this.anneeScolaireId = anneeScolaireId;
	}

	public String getLib() {
		return lib;
	}

	public void setLib(String lib) {
		this.lib = lib;
	}

	public List<ClasseAnneeScolaire> getAnneeScolaires() {
		return anneeScolaires;
	}

	public void setAnneeScolaires(List<ClasseAnneeScolaire> anneeScolaires) {
		this.anneeScolaires = anneeScolaires;
	}

	
	
}
