package com.sgic.product.server.dto;

public class LicenseDto {
	private Long id;
	private String licenseName;
	private String licenseValidity;
	private String licenseCost;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
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
