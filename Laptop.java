package com.electronics.devices;
public class Laptop {
private String model;
private double price;
	public void setModel(String model) {
	this.model = model;
	}
	public void setPrice(double price) {
	this.price = price;
	}

	public String getModel() {
	return model;
	}
	public double getPrice() {
	return price;
	}
	public void showLaptopDetails() {
	System.out.println("Laptop Model: " + model);
	System.out.println("Price: $" + price);
}
}