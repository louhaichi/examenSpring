package tn.esprit.spring.service;




import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.spring.entity.Formateur;
import tn.esprit.spring.interfaces.FormateurInterface;
import tn.esprit.spring.repository.FormateurRepository;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Slf4j
public class FormateurService implements FormateurInterface{

	@Autowired
	 FormateurRepository  formateurRepository;
	
	@Override
	public List<Formateur> retrieveAllFormateurs() {
		List<Formateur> FormateurList = formateurRepository.findAll();
		for(Formateur Sujet : FormateurList) {
		}
		return FormateurList;
	}

	@Override
	public Formateur addFormateur(Formateur f) {
		return formateurRepository.save(f);
	}
	
	

}
