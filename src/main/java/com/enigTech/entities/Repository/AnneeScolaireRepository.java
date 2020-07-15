package com.enigTech.entities.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.enigTech.entities.AnneeScolaire;
import com.enigTech.entities.Classe;

public interface AnneeScolaireRepository extends JpaRepository<AnneeScolaire, Long> {

}
