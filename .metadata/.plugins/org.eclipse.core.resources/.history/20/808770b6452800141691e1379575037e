package com.dt.services;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.dt.entity.Customer;
import com.dt.entity.CustomersWrapper;

@Path("/customer")
public class CustomerServices {
	
	@GET()
	@Produces({ MediaType.APPLICATION_JSON})
	public List<Customer> getCustomers(){
		return CustomersWrapper.getInstance().getCustomers();
	}
}
