package com.sgic.product.productservice.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.persistence.*;

@Entity
@Table(name="license")
public class License {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotNull
    @Size(max = 100)
    @Column(unique = true)
	private String licenseName;
	
	@NotNull
    @Size(max = 100)
	private String licenseValidity;
	
	@NotNull
    @Size(max = 100)
	private String licenseCost;
	
	@ManyToMany(fetch = FetchType.LAZY,
            cascade = {CascadeType.PERSIST,CascadeType.MERGE})
	@JoinTable(name = "license_features",
    joinColumns = { @JoinColumn (name = "license_id") },
    inverseJoinColumns = { @JoinColumn(name = "feature_id") })
	private Set<Features> features = new HashSet<>();
	
	
}
