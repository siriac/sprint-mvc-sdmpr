package org.sinares.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@Entity
public class Maladie implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idMaladie;
	private String nom_maladie;
	private boolean checked;
	@ManyToOne
	@JoinColumn(name="idAnnexe_2")
	private Annexe_2 annexe_2;
	public Long getIdMaladie() {
		return idMaladie;
	}
	public void setIdMaladie(Long idMaladie) {
		this.idMaladie = idMaladie;
	}
	public String getNom_maladie() {
		return nom_maladie;
	}
	public void setNom_maladie(String nom_maladie) {
		this.nom_maladie = nom_maladie;
	}
	
	public boolean getChecked() {
		return checked;
	}
	public void setChecked(boolean checked) {
		this.checked = checked;
	}
	
	public Annexe_2 getAnnexe_2() {
		return annexe_2;
	}
	public void setAnnexe_2(Annexe_2 annexe_2) {
		this.annexe_2 = annexe_2;
	}
	public Maladie() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Maladie(String nom_maladie, boolean checked, Annexe_2 annexe_2) {
		super();
		this.nom_maladie = nom_maladie;
		this.checked = checked;
		this.annexe_2 = annexe_2;
	}
	

}
