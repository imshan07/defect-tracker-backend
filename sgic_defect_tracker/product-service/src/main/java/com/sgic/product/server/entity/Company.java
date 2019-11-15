package com.sgic.product.server.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="company")
public class Company {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotNull
    @Size(max = 100)
    @Column(unique = true)
	private String companyName;
	
	@NotNull
    @Size(max = 100)
    @Column(unique = true)
	private String email;
	
	@NotNull
    @Size(max = 100)
	private String licenseType;
	
	@NotNull
    @Size(max = 100)
	private Date LicenseStartDate;
	
	@NotNull
    @Size(max = 100)
	private Date LicenseExpiryDate;
	
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "license_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JsonIgnore
    private License license;
	
	
}
