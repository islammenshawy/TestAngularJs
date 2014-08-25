package com.dt.entity;

import java.util.ArrayList;
import java.util.List;

public class CustomersWrapper {
	private static CustomersWrapper instance_;
	public static List<Customer> customers = new ArrayList<Customer>();

	private CustomersWrapper(){
		customers.add(new Customer("Islam Elmenshawy", "Sacramento"));
		customers.add(new Customer("Darrel Urlich", "Sacramento"));
	}
	
	public static CustomersWrapper getInstance(){
		if(instance_ == null){
			instance_ = new CustomersWrapper();
		}
		return instance_;	
	}
		

	public List<Customer> getCustomers() {
		// TODO Auto-generated method stub
		return customers;
	}
	

}
