package tn.esprit.spring.service;

import org.springframework.beans.factory.annotation.Autowired;

import tn.esprit.spring.entity.Apprenant;
import tn.esprit.spring.interfaces.ApprenantInterface;
import tn.esprit.spring.interfaces.FormateurInterface;
import tn.esprit.spring.repository.ApprenantRepository;
import tn.esprit.spring.repository.FormateurRepository;

public class ApprenantService implements ApprenantInterface {

	
	@Autowired
	ApprenantRepository  apprenantRepository;
	@Override
	public Apprenant addApprenant(Apprenant a) {
		return apprenantRepository.save(a);
	}

}
