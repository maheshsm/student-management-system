package com.ecommerce.service;

import java.sql.SQLException;
import java.util.List;

import com.ecommerce.dto.customerDetailsDTO;
import com.ecommerce.model.CustomerDetails;

public interface CustomerDetailServiceIn {
	// add
    int registerCustomer(CustomerDetails cutomerDeatails);
	// get
    customerDetailsDTO findByCustomerDetails(int customerId);
    List<customerDetailsDTO> findAllCustomerRecord();
	// update
    int updateCustomerDetails(CustomerDetails customerDetails);
	// delete
    void deleteCustomerDetails(int customerId);
}
