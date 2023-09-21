package com.ecommerce.service;

import java.util.List;

import com.ecommerce.dto.CustomerDetailsDTO;
import com.ecommerce.model.CustomerDetails;

/**
 * This is specification class for customer activities.
 */
public interface CustomerDetailServiceIn {
	
	/**
	 * 
	 * @param cutomerDeatails
	 * @return Integer
	 */
	Integer registerCustomer(CustomerDetails cutomerDeatails);

	// get
	CustomerDetailsDTO findByCustomerDetails(int customerId);

	List<CustomerDetailsDTO> findAllCustomerRecord();

	// update
	int updateCustomerDetails(CustomerDetails customerDetails);

	// delete
	void deleteCustomerDetails(int customerId);
}
