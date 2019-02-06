package org.sinares.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.xml.bind.annotation.XmlTransient;

import com.fasterxml.jackson.annotation.JsonIgnore;
@Entity
public class Annexe_2 implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idAnnexe_2;
	private String region;
	private String district;
	private String numIden;
	private String lieuDeces;
	private String dateDeces;
	private String causeDeces;
	private String dateSignature;
	private String personneNotifie;
	private String responsableFOSA;
	private String responsableAS;
	private String chefDistrict;
	@OneToMany(mappedBy="annexe_2" ,fetch=FetchType.LAZY,cascade=CascadeType.ALL)
	private Collection<Maladie> maladies;
	public Long getIdAnnexe_2() {
		return idAnnexe_2;
	}
	public void setIdAnnexe_2(Long idAnnexe_2) {
		this.idAnnexe_2 = idAnnexe_2;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getNumIden() {
		return numIden;
	}
	public void setNumIden(String numIden) {
		this.numIden = numIden;
	}
	public String getLieuDeces() {
		return lieuDeces;
	}
	public void setLieuDeces(String lieuDeces) {
		this.lieuDeces = lieuDeces;
	}
	public String getDateDeces() {
		return dateDeces;
	}
	public void setDateDeces(String dateDeces) {
		this.dateDeces = dateDeces;
	}
	public String getCauseDeces() {
		return causeDeces;
	}
	public void setCauseDeces(String causeDeces) {
		this.causeDeces = causeDeces;
	}
	public String getDateSignature() {
		return dateSignature;
	}
	public void setDateSignature(String dateSignature) {
		this.dateSignature = dateSignature;
	}
	public String getPersonneNotifie() {
		return personneNotifie;
	}
	public void setPersonneNotifie(String personneNotifie) {
		this.personneNotifie = personneNotifie;
	}
	public String getResponsableFOSA() {
		return responsableFOSA;
	}
	public void setResponsableFOSA(String responsableFOSA) {
		this.responsableFOSA = responsableFOSA;
	}
	public String getResponsableAS() {
		return responsableAS;
	}
	public void setResponsableAS(String responsableAS) {
		this.responsableAS = responsableAS;
	}
	public String getChefDistrict() {
		return chefDistrict;
	}
	public void setChefDistrict(String chefDistrict) {
		this.chefDistrict = chefDistrict;
	}
	@JsonIgnore
	@XmlTransient
	public Collection<Maladie> getMaladies() {
		return maladies;
	}
	public void setMaladies(Collection<Maladie> maladies) {
		this.maladies = maladies;
	}
	public Annexe_2() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Annexe_2(String region, String district, String numIden, String lieuDeces, String dateDeces,
			String causeDeces, String dateSignature, String personneNotifie, String responsableFOSA,
			String responsableAS, String chefDistrict) {
		super();
		this.region = region;
		this.district = district;
		this.numIden = numIden;
		this.lieuDeces = lieuDeces;
		this.dateDeces = dateDeces;
		this.causeDeces = causeDeces;
		this.dateSignature = dateSignature;
		this.personneNotifie = personneNotifie;
		this.responsableFOSA = responsableFOSA;
		this.responsableAS = responsableAS;
		this.chefDistrict = chefDistrict;
		
	}
	
	
	
}
