package com.ecommerce.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.ecommerce.model.BillingDetails;
import com.ecommerce.model.CustomerDetails;
import com.ecommerce.model.DiscountDetails;

public class BillingDetailsMapper implements RowMapper<BillingDetails>{

	@Override
	public BillingDetails mapRow(ResultSet rs, int rowNum) throws SQLException {
		BillingDetails billingDetails = new BillingDetails();
		
		billingDetails.setBillingId(rs.getInt("billing_id"));
		billingDetails.setCustomerId(rs.getInt("customer_id"));
		billingDetails.setBillingAmount(rs.getDouble("billing_amount"));
		billingDetails.setPaymentId(rs.getInt("payment_id"));
		billingDetails.setBillingDate(rs.getDate("billing_date"));
		
		return billingDetails;
	}

}
