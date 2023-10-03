package com.ecommerce.repository.billDetails;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.ecommerce.constant.SqlConstant;
import com.ecommerce.dto.BillingDetailsDTO;
import com.ecommerce.mappers.BillingDetailsMapper;
import com.ecommerce.model.BillingDetails;

@Repository
public class BillingDetailsRepository {
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	/**
	 
	 */

	public void insertBillingDetails(BillingDetails billingDetails) {
		
		jdbcTemplate.update(SqlConstant.INSERT_BILLINGDETAILS, billingDetails.getBillingId(), billingDetails.getCustomerId(),
				billingDetails.getBillingAmount(), billingDetails.getPaymentId(), billingDetails.getBillingDate());
	}

	public BillingDetails getBillDetailsById(int billing_id) {
		BillingDetails billingDetails = jdbcTemplate.queryForObject(SqlConstant.FIND_BILLING_DETAILS_BY_ID, new BillingDetailsMapper(), billing_id);
		return billingDetails;
	}

	public List<BillingDetails> getAllBillingDetails() {
		List<BillingDetails> details = jdbcTemplate.query(SqlConstant.GET_ALL_BILLING_DETAILS, new BillingDetailsMapper());
		return details;
	}

}
