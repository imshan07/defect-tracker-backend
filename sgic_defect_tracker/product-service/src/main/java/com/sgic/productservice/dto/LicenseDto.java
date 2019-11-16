package com.sgic.productservice.dto;



public class LicenseDto {
	private long id;
	
	private String licenseName;
	
	private String licenseValidity;

	private String licenseCost;

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
	
}
