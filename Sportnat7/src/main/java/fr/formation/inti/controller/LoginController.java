package fr.formation.inti.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import fr.formation.inti.dao.ISportifsDao;

@Controller
public class LoginController {
	
	@Autowired
	ISportifsDao dao;
	
	@GetMapping(path = { "", "/","/login" })
	public String login(Model model) {
		 return "view/login";
}

}
