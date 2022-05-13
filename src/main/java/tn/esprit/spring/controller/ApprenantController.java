package tn.esprit.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.parameters.RequestBody;
import tn.esprit.spring.entity.Apprenant;
import tn.esprit.spring.interfaces.ApprenantInterface;

@RestController
@RequestMapping("/apprenant")
public class ApprenantController {

	
	@Autowired
	ApprenantInterface ApprenantInterface;
	
	
	
	@PostMapping("/add-apprenant")
	@ResponseBody
	public Apprenant addSujet(@RequestBody Apprenant a)
	{
		
		return ApprenantInterface.addApprenant(a);
	}
}
