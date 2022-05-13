package tn.esprit.spring.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import tn.esprit.spring.entity.Formateur;
import tn.esprit.spring.interfaces.FormateurInterface;

import java.util.List;

@RestController
@RequestMapping("/formateur")
public class FormateurController {

	
	@Autowired
	FormateurInterface formateurInterface;
	
	@GetMapping("/retrieve-all-formateurs")
	@ResponseBody
	public List<Formateur> getFormateurs() {
		List<Formateur> listsujets = formateurInterface.retrieveAllFormateurs();
		return listsujets;
	}
	
	@PostMapping("/add-formateur")
	@ResponseBody
	public Formateur addfFormateur(@RequestBody Formateur f)
	{
		
		return formateurInterface.addFormateur(f);
	}
	
	
}
