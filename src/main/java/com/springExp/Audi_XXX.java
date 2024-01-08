package com.springExp;

public class Audi_XXX implements Car {

	private String modelName;

	private String number;

	private String color;

	@Override
	public String getCarModel() {
		
		return this.modelName;
	}

	@Override
	public String getCarNumber() {
		
		return this.number;
	}

	@Override
	public String getCarColor() {
		
		return this.color;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	
}
