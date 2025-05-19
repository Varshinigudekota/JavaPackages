package com.vehicles.app;

public class Engine {
	private String engineType;
	private int horsepower;

	public void setEngineType(String engineType) 
	{
		this.engineType = engineType;
	}
	public void setHorsepower(int horsepower) 
	{
		this.horsepower = horsepower;
	}
	public String getEngineType() 
	{
		return engineType;
	}
	public int getHorsepower() 
	{
		return horsepower;
	}

	public void showEngineDetails() 
	{
		System.out.println("Engine Type: " + engineType);
		System.out.println("Horsepower: " + horsepower);
	}
}