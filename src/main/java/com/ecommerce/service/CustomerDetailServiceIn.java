package com.ecommerce.service;

import java.util.List;

import com.ecommerce.model.CustomerDetails;

public interface CustomerDetailServiceIn {
	// add
    int registerCustomer(CustomerDetails cutomerDeatails);
	// get
    List<CustomerDetails> getCustomerDetails(int customerId);
    List<CustomerDetails> getAllCustomerRecord();
	// update
    int updateCustomerDetails(CustomerDetails customerDetails);
	// delete
    void deleteCustomerDetails(int customerId);
}
