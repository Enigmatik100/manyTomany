package com.enigTech;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.enigTech.entities.AnneeScolaire;
import com.enigTech.entities.Classe;
import com.enigTech.entities.ClasseAnneeScolaire;
import com.enigTech.entities.ClasseAnneeScolaireID;
import com.enigTech.entities.Repository.AnneeScolaireRepository;
import com.enigTech.entities.Repository.ClasseAnneeScolaireRepository;
import com.enigTech.entities.Repository.ClasseRepository;

@SpringBootApplication
public class ManyTomanyApplication {

	@Autowired
	private ClasseRepository classeRepository;
	
	@Autowired
	private AnneeScolaireRepository anneeScolaireRepository;
	
	@Autowired
	private ClasseAnneeScolaireRepository classeAnneeScolaireRepository;
	
	
	public static void main(String[] args) {
		SpringApplication.run(ManyTomanyApplication.class, args);
	}

	@Bean
	public CommandLineRunner insertDemoData(ClasseRepository cRepository, AnneeScolaireRepository aRepository,
			ClasseAnneeScolaireRepository caAnneeScolaireRepository) {
		return args->{
			
			Classe cl1 = cRepository.save(new Classe("6emmA"));
			AnneeScolaire an = anneeScolaireRepository.save(new AnneeScolaire("2012-2020"));
			
			ClasseAnneeScolaireID canID = new ClasseAnneeScolaireID(cl1.getClasseId(), an.getAnneeScolaireId());
			ClasseAnneeScolaire can = new ClasseAnneeScolaire();
			can.setClasseAnneeScolaireID(canID);
			can.setAnneeScolaire(an);
			can.setClasse(cl1);
			can.setUnChamps("Une valeur ici");
			
			classeAnneeScolaireRepository.save(can);
		};
	}


	
	
}
