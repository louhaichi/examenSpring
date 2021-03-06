package tn.esprit.spring.entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

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
public class Formateur {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long idFormateur;
	private String nom;
	private String prenom;
	private int tarifHoraire;
	private String email;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private Formation formation;
	

}