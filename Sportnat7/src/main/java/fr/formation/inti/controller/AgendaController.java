package fr.formation.inti.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import fr.formation.inti.entities.Sportifs;

@Controller
public class AgendaController {
	
	@GetMapping(path = "/agenda")
	public String monCompte(Model model) {
		model.addAttribute("sportif", new Sportifs());
		 return "view/login/agenda";
}

}
