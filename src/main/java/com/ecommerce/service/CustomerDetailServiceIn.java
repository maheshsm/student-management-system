package com.ecommerce.service;

import java.util.List;

import com.ecommerce.model.CustomerDetails;

public interface CustomerDetailServiceIn {
	// add
    int registerCustomer(CustomerDetails cutomerDeatails);
	// get
    CustomerDetails getCustomerDetails(int customerId);
    List<CustomerDetails> getAllCustomerRecord();
	// update
    CustomerDetails updateCustomerDetails(int customerId);
	// delete
    CustomerDetails deleteCustomerDetails(int customerId);
}
