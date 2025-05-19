package com.vehicles.parts;

import com.vehicles.Car;

import com.vehicles.app.Engine;

public class CarApp 
{
	public static void main(String[] args) 
	{
		Car c = new Car();
		c.setBrand("BMW");
		c.setModel("Benze");
		c.setPrice(250000.00);

		Engine e = new Engine();
		e.setEngineType("Ultra First");
		e.setHorsepower(2000);

		c.showCarDetails();
		System.out.println();
		e.showEngineDetails();
	}
}