package tn.esprit.spring.entity;


import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Formation {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long idFormation;
	private String titre;
	@Temporal (TemporalType.DATE)
	private Date dateDebut;
	@Temporal (TemporalType.DATE)
	private Date dateFin;
	private int nbrHeures;
	private int nbrMaxParticipant;
	private int frais;
	@Enumerated(EnumType.STRING)
	private Niveau niveau ;
	
	@ManyToMany(cascade = CascadeType.ALL, mappedBy="formations" )
	private Set<Apprenant> apprenants;
	
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy="formation")
	private Set<Formateur> formateurs;
	
	
	
	
	

}
