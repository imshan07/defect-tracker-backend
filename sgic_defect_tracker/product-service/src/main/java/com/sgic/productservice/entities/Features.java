package com.sgic.productservice.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name="features")
public class Features {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;
	@Column(unique = true)
	@Size(max = 250)
	private String featureName;
	
	private String featureDescription;
	
	 @ManyToMany(fetch = FetchType.LAZY,
	            cascade = {
	                CascadeType.PERSIST,
	                CascadeType.MERGE
	            },
	            mappedBy = "features")
	    private Set<License> license = new HashSet<>();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFeatureName() {
		return featureName;
	}

	public void setFeatureName(String featureName) {
		this.featureName = featureName;
	}

	public String getFeatureDescription() {
		return featureDescription;
	}

	public void setFeatureDescription(String featureDescription) {
		this.featureDescription = featureDescription;
	}

	public Set<License> getLicense() {
		return license;
	}

	public void setLicense(Set<License> license) {
		this.license = license;
	}
	 
	 
	
}
