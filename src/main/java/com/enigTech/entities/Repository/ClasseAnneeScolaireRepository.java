package com.enigTech.entities.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.enigTech.entities.Classe;
import com.enigTech.entities.ClasseAnneeScolaire;
import com.enigTech.entities.ClasseAnneeScolaireID;

public interface ClasseAnneeScolaireRepository extends JpaRepository<ClasseAnneeScolaire, ClasseAnneeScolaireID> {

}
