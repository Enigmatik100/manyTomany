package com.enigTech.entities;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.Embedded;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;

@Entity
public class ClasseAnneeScolaire{

	@EmbeddedId
	private ClasseAnneeScolaireID classeAnneeScolaireID = new ClasseAnneeScolaireID();
	
	@ManyToOne
	@MapsId("classeId")
	@JoinColumn(name="classeId")
	private Classe classe;
	
	
	@ManyToOne
	@MapsId("anneScolaireId")
	@JoinColumn(name="classeId")
	private AnneeScolaire anneeScolaire;
	
	private String unChamps;

	public ClasseAnneeScolaireID getClasseAnneeScolaireID() {
		return classeAnneeScolaireID;
	}

	public void setClasseAnneeScolaireID(ClasseAnneeScolaireID classeAnneeScolaireID) {
		this.classeAnneeScolaireID = classeAnneeScolaireID;
	}

	public Classe getClasse() {
		return classe;
	}

	public void setClasse(Classe classe) {
		this.classe = classe;
	}

	public AnneeScolaire getAnneeScolaire() {
		return anneeScolaire;
	}

	public void setAnneeScolaire(AnneeScolaire anneeScolaire) {
		this.anneeScolaire = anneeScolaire;
	}

	public String getUnChamps() {
		return unChamps;
	}

	public void setUnChamps(String unChamps) {
		this.unChamps = unChamps;
	}
	
	
	
	
	
}
