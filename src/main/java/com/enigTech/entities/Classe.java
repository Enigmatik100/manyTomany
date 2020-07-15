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

import org.springframework.boot.autoconfigure.domain.EntityScan;

@Entity
//@Table(name="CLASSE")
public class Classe {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long classeId;

	private String promotion;
	
	

	public Classe(String promotion) {
		this.promotion = promotion;
	}

	public List<ClasseAnneeScolaire> getClasseAnneeScolaires() {
		return classeAnneeScolaires;
	}

	public void setClasseAnneeScolaires(List<ClasseAnneeScolaire> classeAnneeScolaires) {
		this.classeAnneeScolaires = classeAnneeScolaires;
	}

	@OneToMany(mappedBy = "classe", cascade = CascadeType.ALL)
	private List<ClasseAnneeScolaire> classeAnneeScolaires = new ArrayList<>();

	public Long getClasseId() {
		return classeId;
	}

	public void setClasseId(Long classeId) {
		this.classeId = classeId;
	}

	public String getPromotion() {
		return promotion;
	}

	public void setPromotion(String promotion) {
		this.promotion = promotion;
	}

	public Classe() {

	}

	public Classe(Long classeId, String promotion) {

		this.classeId = classeId;
		this.promotion = promotion;
	}

}
