package com.aswtp2;

public class Car {
	private String plate,model,make,color;
	
	

	public Car(String plate, String model, String make, String color) {
		super();
		this.plate = plate;
		this.model = model;
		this.make = make;
		this.color = color;
	}

	public String getPlate() {
		return plate;
	}

	public void setPlate(String plate) {
		this.plate = plate;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
}
