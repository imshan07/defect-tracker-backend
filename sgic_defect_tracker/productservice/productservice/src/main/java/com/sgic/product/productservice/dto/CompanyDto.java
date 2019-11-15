package com.sgic.product.productservice.dto;

import java.sql.Date;


import com.sgic.product.productservice.entity.License;

public class CompanyDto {
	private Long id;

	private String companyName;

	private String email;
	private String licenseType;
	private Date LicenseStartDate;
	private Date LicenseExpiryDate;
	private License license;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getLicenseType() {
		return licenseType;
	}

	public void setLicenseType(String licenseType) {
		this.licenseType = licenseType;
	}

	public Date getLicenseStartDate() {
		return LicenseStartDate;
	}

	public void setLicenseStartDate(Date licenseStartDate) {
		LicenseStartDate = licenseStartDate;
	}

	public Date getLicenseExpiryDate() {
		return LicenseExpiryDate;
	}

	public void setLicenseExpiryDate(Date licenseExpiryDate) {
		LicenseExpiryDate = licenseExpiryDate;
	}

	public License getLicense() {
		return license;
	}

	public void setLicense(License license) {
		this.license = license;
	}

}
