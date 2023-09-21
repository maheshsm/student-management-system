package com.ecommerce.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.ecommerce.model.CustomerDetails;

public class CustomerDetailsMapper implements RowMapper<CustomerDetails> {

	@Override
	public CustomerDetails mapRow(ResultSet rs, int rowNum) throws SQLException {
		CustomerDetails customerDetails = new CustomerDetails();

		customerDetails.setAddress(rs.getString("address"));
		customerDetails.setMobile(rs.getLong("mobile"));
		return null;
	}

}
