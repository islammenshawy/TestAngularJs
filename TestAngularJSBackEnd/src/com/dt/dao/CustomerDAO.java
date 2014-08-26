//$Id$
package com.dt.dao;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Id;

import com.db.CustomersWrapper;

/**
 * <br>
 * <br>
 * Copyright (c) 2014 Datavantage Corporation
 *
 * @author Islam.Elmenshawy
 * @created Aug 26, 2014
 * @version $Revision$
 */
public class CustomerDAO implements IGenericDAO {

	/** {@inheritDoc} */
	@Override
	public List findAll() {
		// Should query the DB and return all customer entities present.
		return CustomersWrapper.getInstance().getCustomers();
	}

}
