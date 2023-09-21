package com.ecommerce.service;

import java.util.List;

import com.ecommerce.dto.customerDetailsDTO;
import com.ecommerce.model.CustomerDetails;

public interface CustomerDetailServiceIn {
	
	Integer registerCustomer(CustomerDetails cutomerDeatails);

	customerDetailsDTO findByCustomerDetails(Long customerId);

	List<customerDetailsDTO> findAllCustomerRecord();

	Integer updateCustomerDetails(CustomerDetails customerDetails, Long customerId);

	void deleteCustomerDetails(Long customerId);
}
