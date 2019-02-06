package org.sinares.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
@Entity
public class District implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idDistrict;
	private String nomDistrict;
	private String codeDistrict;
	public Long getIdDistrict() {
		return idDistrict;
	}
	public void setIdDistrict(Long idDistrict) {
		this.idDistrict = idDistrict;
	}
	public String getNomDistrict() {
		return nomDistrict;
	}
	public void setNomDistrict(String nomDistrict) {
		this.nomDistrict = nomDistrict;
	}
	public String getCodeDistrict() {
		return codeDistrict;
	}
	public void setCodeDistrict(String codeDistrict) {
		this.codeDistrict = codeDistrict;
	}
	public District() {
		super();
		// TODO Auto-generated constructor stub
	}
	public District(String nomDistrict, String codeDistrict) {
		super();
		this.nomDistrict = nomDistrict;
		this.codeDistrict = codeDistrict;
		
	}
	

}
