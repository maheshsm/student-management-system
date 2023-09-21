package com.ecommerce.service;

import java.util.List;

import com.ecommerce.dto.CustomerDetailsDTO;
import com.ecommerce.model.CustomerDetails;

/**
 * This is specification class for customer activities.
 */
public interface CustomerDetailServiceIn {
	
	Integer registerCustomer(CustomerDetails cutomerDeatails);

	CustomerDetailsDTO findByCustomerDetails(Long customerId);

	List<CustomerDetailsDTO> findAllCustomerRecord();

	Integer updateCustomerDetails(CustomerDetails customerDetails, Long customerId);

	void deleteCustomerDetails(Long customerId);

}
