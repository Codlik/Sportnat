package fr.formation.inti.dao;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import fr.formation.inti.entities.Sportifs;



public interface SportifsRepository extends JpaRepository<Sportifs, Integer> { 



}


