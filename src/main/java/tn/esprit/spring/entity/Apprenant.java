package tn.esprit.spring.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

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
public class Apprenant {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long idApprenant;
	private String nom;
	private String prenom;
	private int telephone;
	private String email;

	@ManyToMany(cascade = CascadeType.ALL )
	private Set<Formation> formations;
	
	
}