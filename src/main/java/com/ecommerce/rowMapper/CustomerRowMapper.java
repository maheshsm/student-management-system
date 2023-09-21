package com.ecommerce.rowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.ecommerce.model.CustomerDetails;

public class CustomerRowMapper implements RowMapper<CustomerDetails> {

	@Override
	public CustomerDetails mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		CustomerDetails customerDetails = new CustomerDetails();
		
		customerDetails.setCustomerId(rs.getInt("customerId"));
		customerDetails.setFirstName(rs.getString("firstName"));
		customerDetails.setLastName(rs.getString("lastName"));
		customerDetails.setUsername(rs.getString("username")); 
		customerDetails.setPassword(rs.getString("password"));
		customerDetails.setMobile(rs.getLong("mobile"));
		customerDetails.setEmail(rs.getString("email"));
		customerDetails.setAddress(rs.getString("address"));
		customerDetails.setBillId(rs.getInt("billId"));
		
		return customerDetails;
	}

}


