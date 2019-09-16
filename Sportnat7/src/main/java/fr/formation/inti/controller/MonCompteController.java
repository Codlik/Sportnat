package fr.formation.inti.controller;

import java.security.Principal;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class MonCompteController {
	
	
	
	@GetMapping(path = "/moncompte")
	public String monCompte(Model model,Principal principal) {
		User loginedUser = (User) ((Authentication) principal).getPrincipal();
		model.addAttribute("sportif", loginedUser);
		 return "view/login/moncompte";
}

}
