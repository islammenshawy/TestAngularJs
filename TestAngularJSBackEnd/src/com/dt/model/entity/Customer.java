package com.dt.model.entity;

public class Customer {
	
	private String name;
	private String city;
//	private Account account;
	
	public Customer(String argName, String argCity){
		this.name = argName;
		this.city = argCity;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}

}
