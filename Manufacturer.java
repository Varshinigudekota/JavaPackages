package com.electronics.brands;
public class Manufacturer {
private String brandName;
private String country;

public void setBrandName(String brandName) {
	this.brandName = brandName;
	}
	public void setCountry(String country) {
	this.country = country;
	}
	public String getBrandName() {
	return brandName;
	}
	public String getCountry() {
	return country;
	}
	public void showManufacturerDetails() {
	System.out.println("Brand Name: " + brandName);
	System.out.println("Country of Origin: " + country);
}
}