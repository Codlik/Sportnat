package fr.formation.inti.service;

import java.util.List;


import fr.formation.inti.entities.Sportifs;



public interface SportifService {

	public Sportifs savOrUpdate(Sportifs c);
	public void deleteSportifs(Integer id);
	public List<Sportifs> findAllSportifs();
	public Sportifs findByID(Integer id);
}
	
	


