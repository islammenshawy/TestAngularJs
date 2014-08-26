package com.db;
/**
 * This class will represent the DB for a simple customer entity.<br>
 * <br>
 * Copyright (c) 2014 Datavantage Corporation
 *
 * @author Islam.Elmenshawy
 * @created Aug 26, 2014
 * @version $Revision$
 */
import java.util.ArrayList;
import java.util.List;
import com.dt.model.entity.Customer;

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
