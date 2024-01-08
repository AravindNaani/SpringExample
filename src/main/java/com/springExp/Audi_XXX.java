package com.springExp;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Audi_XXX implements Car {

	@Value("${Audi.model}")
	private String modelName;

	@Value("${Audi.number}")
	private String number;

	@Value("${Audi.color}")
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

	@Override
	public String toString() {
		return "Audi_XXX [modelName=" + modelName + ", number=" + number + ", color=" + color + "]";
	}

	
}
