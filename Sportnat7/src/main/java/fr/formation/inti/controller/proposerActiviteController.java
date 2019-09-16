package fr.formation.inti.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import fr.formation.inti.dao.ActiviteDao;
import fr.formation.inti.dao.ISportifsDao;
import fr.formation.inti.entities.ActiviteRecord;
import fr.formation.inti.entities.Sportifs;
import fr.formation.inti.service.ActiviteRecordService;



	@Controller
	public class proposerActiviteController {

		@Autowired
		ActiviteDao dao;
		
		@RequestMapping("/proposerAct")
		public String proposerActivite(Model model) {
			model.addAttribute("Activite", new ActiviteRecord());
			
			return "view/login/proposerAct";
		}
		
		@GetMapping("/saveAct")
		public String saveSportif(ActiviteRecord ActiviteRecord) {
			dao.save(ActiviteRecord);
			return "view/login/rechercherAct";
		}
		}
		
		
		
