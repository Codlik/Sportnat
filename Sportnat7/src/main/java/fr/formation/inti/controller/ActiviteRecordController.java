package fr.formation.inti.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import fr.formation.inti.service.ActiviteRecordService;

@Controller
public class ActiviteRecordController {

	@Autowired
	ActiviteRecordService serviceActivite;
	
	
	public void setServiceActivity(ActiviteRecordService serviceActivite) {
		this.serviceActivite = serviceActivite;
	}


	@GetMapping(path="/rechercherAct")
	public String getAll(Model model) {
		model.addAttribute("listActivite", serviceActivite.getActivite());
		return "view/login/rechercherAct";
	}
	
	
	
}
	

