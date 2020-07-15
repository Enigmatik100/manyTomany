package com.enigTech.entities;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class ClasseAnneeScolaireID implements Serializable{

	private Long classeId;
	private Long anneeScolaireId;
	
	
	public ClasseAnneeScolaireID(Long classeId, Long anneeScolaireId) {
		super();
		this.classeId = classeId;
		this.anneeScolaireId = anneeScolaireId;
	}

	public ClasseAnneeScolaireID() {
	}
	
	public Long getClasseId() {
		return classeId;
	}
	public void setClasseId(Long classeId) {
		this.classeId = classeId;
	}
	public Long getAnneeScolaireId() {
		return anneeScolaireId;
	}
	public void setAnneeScolaireId(Long anneeScolaireId) {
		this.anneeScolaireId = anneeScolaireId;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((anneeScolaireId == null) ? 0 : anneeScolaireId.hashCode());
		result = prime * result + ((classeId == null) ? 0 : classeId.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ClasseAnneeScolaireID other = (ClasseAnneeScolaireID) obj;
		if (anneeScolaireId == null) {
			if (other.anneeScolaireId != null)
				return false;
		} else if (!anneeScolaireId.equals(other.anneeScolaireId))
			return false;
		if (classeId == null) {
			if (other.classeId != null)
				return false;
		} else if (!classeId.equals(other.classeId))
			return false;
		return true;
	}
	
	
}
