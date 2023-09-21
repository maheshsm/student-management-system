package com.ecommerce.service;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.ecommerce.dto.CustomerDetailsDTO;
import com.ecommerce.model.CustomerDetails;
import com.ecommerce.repository.CustomerDetailsRepository;


@Service
public class CustomerDetailsServiceImpl implements CustomerDetailServiceIn {
	
	
	@Autowired
	CustomerDetailsRepository customerDetailsRepository;
	
	@Override
	public Integer registerCustomer(CustomerDetails cutomerDeatails) {
		
		return customerDetailsRepository.registerNewCustomer(cutomerDeatails);
	}

	@Override
	public CustomerDetailsDTO findByCustomerDetails(int customerId) {
		return customerDetailsRepository.findById(customerId);
	}

	@Override
	public List<CustomerDetailsDTO> findAllCustomerRecord() {
		return customerDetailsRepository.findAll();
	}

	@Override
	public int updateCustomerDetails(CustomerDetails customerDetails) {
		return customerDetailsRepository.update(customerDetails);
	}

	@Override
	public void deleteCustomerDetails(int customerId){
			customerDetailsRepository.deleteById(customerId);
	}
}
