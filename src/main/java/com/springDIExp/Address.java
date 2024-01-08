package com.springDIExp;

public class Address {
	
	private String cityName;
	
	private int pincode;

	public Address(String cityName, int pincode) {
		this.cityName = cityName;
		this.pincode = pincode;
	}
	
	public Address() {
		
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "Address [cityName=" + cityName + ", pincode=" + pincode + "]";
	}
	
	
}
