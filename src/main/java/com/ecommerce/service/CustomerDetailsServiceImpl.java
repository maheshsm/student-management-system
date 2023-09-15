package com.ecommerce.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.ecommerce.model.CustomerDetails;
import com.ecommerce.repository.CustomerDetailsRepository;


@Service
public class CustomerDetailsServiceImpl implements CustomerDetailServiceIn {
	
	
	@Autowired
	CustomerDetailsRepository customerDetailsRepository;
	
	@Override
	public int registerCustomer(CustomerDetails cutomerDeatails) {
		int save = customerDetailsRepository.save(cutomerDeatails);
		return save;
	}

	@Override
	public CustomerDetails getCustomerDetails(int customerId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<CustomerDetails> getAllCustomerRecord() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CustomerDetails updateCustomerDetails(int customerId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CustomerDetails deleteCustomerDetails(int customerId) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
