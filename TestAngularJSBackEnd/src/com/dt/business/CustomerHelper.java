//$Id$
package com.dt.business;

import java.util.List;

import com.dt.dao.CustomerDAO;
import com.dt.model.entity.Customer;


/**
 * Helper class that will contain the buisness logic for the customer service<br>
 * <br>
 * Copyright (c) 2014 Datavantage Corporation
 *
 * @author Islam.Elmenshawy
 * @created Aug 26, 2014
 * @version $Revision$
 */
public class CustomerHelper {
	
	private static CustomerHelper instance_;

	private CustomerHelper(){

	}
	
	public static CustomerHelper getInstance(){
		if(instance_ == null){
			instance_ = new CustomerHelper();
		}
		return instance_;	
	}
	
	/**
	 * Method to return all the customers available in the system.
	 * @return
	 */
	public List<Customer> getAllCustomers(){
		CustomerDAO dao = new CustomerDAO();
		return dao.findAll();
	}

}
