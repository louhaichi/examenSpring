package tn.esprit.spring.interfaces;



import tn.esprit.spring.entity.Formateur;

import java.util.List;
public interface FormateurInterface {

	
	List<Formateur> retrieveAllFormateurs();

	Formateur addFormateur(Formateur s);
}


