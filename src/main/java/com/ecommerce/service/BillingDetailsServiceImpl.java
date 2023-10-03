package com.ecommerce.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

import com.ecommerce.dto.BillingDetailsDTO;
import com.ecommerce.mappers.DiscountDetailsRowMapper;
import com.ecommerce.model.BillingDetails;
import com.ecommerce.model.DiscountDetails;
import com.ecommerce.repository.billDetails.BillingDetailsRepository;

@Service
public class BillingDetailsServiceImpl implements BillingDetailsService{

	@Autowired
	public BillingDetailsRepository billingDetailsRepository;
	
	@Override
	public void inserBillingDetails(BillingDetails billingDetails) {
		billingDetailsRepository.insertBillingDetails(billingDetails);		
	}

	@Override
	public BillingDetails getBillDetailsById(int billing_id) {
		return billingDetailsRepository.getBillDetailsById(billing_id);
	}

	@Override
	public List<BillingDetails> getAllBillingData() {
		return billingDetailsRepository.getAllBillingDetails();
	}

}
