//$Id$
package com.dt.dao;

import java.io.Serializable;
import java.util.List;

/**
 * Interface for the abstract implementation of any DAO<br>
 * <br>
 * Copyright (c) 2014 Datavantage Corporation
 *
 * @author Islam.Elmenshawy
 * @created Aug 26, 2014
 * @version $Revision$
 */
public interface IGenericDAO<T> {
	
	
	/**
	 * returns all the records from the database
	 * 
	 * @return all the records for the table in database
	 */
	List<T> findAll();

}
