package com.ecommerce.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.dto.customerDetailsDTO;
import com.ecommerce.model.CustomerDetails;
import com.ecommerce.repository.CustomerDetailsRepository;


@Service
public class CustomerDetailsServiceImpl implements CustomerDetailServiceIn {
	
	
	@Autowired
	CustomerDetailsRepository customerDetailsRepository;
	
	@Override
	public Integer registerCustomer(CustomerDetails cutomerDeatails) {
		Integer save = customerDetailsRepository.registeCustomer(cutomerDeatails);
		return save;
	}

	@Override
	public customerDetailsDTO findByCustomerDetails(Long customerId) {
		return customerDetailsRepository.findById(customerId);
	}

	@Override
	public List<customerDetailsDTO> findAllCustomerRecord() {
		return customerDetailsRepository.findAll();
	}

	@Override
	public Integer updateCustomerDetails(CustomerDetails customerDetails , Long customerId) {
		return customerDetailsRepository.update(customerDetails, customerId);
	}

	@Override
	public void deleteCustomerDetails(Long customerId){
			customerDetailsRepository.deleteById(customerId);
	}
}
