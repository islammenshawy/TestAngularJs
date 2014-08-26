package com.dt.services;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.dt.business.CustomerHelper;
import com.dt.model.entity.Customer;
import com.db.CustomersWrapper;

@Path("/customer")
public class CustomerServices {
	
	@GET()
	@Produces({ MediaType.APPLICATION_JSON})
	public List<Customer> getCustomers(){
		return CustomerHelper.getInstance().getAllCustomers();
	}
}
