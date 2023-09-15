package com.ecommerce.repository;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.ecommerce.model.CustomerDetails;

@Repository
public class CustomerDetailsRepository {
   
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public int save(CustomerDetails customerDetails) {
		
		int insertedRow = jdbcTemplate.update("insert into customer_details"
				+ "(firstName, lastName, username, password, mobile, email,address) "
				+ "value(?,?,?,?,?,?,?)", 
				customerDetails.getFirstName(),
				customerDetails.getLastName(),
				customerDetails.getUsername(),
				customerDetails.getPassword(),
				customerDetails.getMobile(),
				customerDetails.getEmail(),
				customerDetails.getAddress());
		return insertedRow;
	}
	
}
