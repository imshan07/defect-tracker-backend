package com.sgic.productservice.entities;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "license")
public class License {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@NotNull
	private String licenseName;
	@NotNull
	private String licenseValidity;
	@NotNull
	private String licenseCost;
	@ManyToMany(fetch = FetchType.LAZY,
            cascade = {
                CascadeType.PERSIST,
                CascadeType.MERGE
            })
	 @JoinTable(name = "license_features",
     joinColumns = { @JoinColumn(name = "license_id") },
     inverseJoinColumns = { @JoinColumn(name = "features_id") })
	 private Set<Features> features = new HashSet<>();
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getLicenseName() {
		return licenseName;
	}
	public void setLicenseName(String licenseName) {
		this.licenseName = licenseName;
	}
	public String getLicenseValidity() {
		return licenseValidity;
	}
	public void setLicenseValidity(String licenseValidity) {
		this.licenseValidity = licenseValidity;
	}
	public String getLicenseCost() {
		return licenseCost;
	}
	public void setLicenseCost(String licenseCost) {
		this.licenseCost = licenseCost;
	}
	public Set<Features> getFeatures() {
		return features;
	}
	public void setFeatures(Set<Features> features) {
		this.features = features;
	}
	
	
}
