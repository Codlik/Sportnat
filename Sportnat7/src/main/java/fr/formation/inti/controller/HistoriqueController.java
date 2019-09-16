package fr.formation.inti.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import fr.formation.inti.entities.Sportifs;

public class HistoriqueController {
	
	@GetMapping(path = "/historique")
	public String monCompte(Model model) {
		model.addAttribute("sportif", new Sportifs());
		 return "view/login/statistiques";
}

}
