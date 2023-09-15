package com.ecommerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.model.CustomerDetails;
import com.ecommerce.service.CustomerDetailServiceIn;


@RestController
@RequestMapping("/api")
public class CustomerDetailsController {
	
	@Autowired
	public CustomerDetailServiceIn customerDetailService;

	@PostMapping("/register/customer")
	public ResponseEntity<Integer> registerCustomer(@RequestBody CustomerDetails customerDetails){
		return new ResponseEntity<>(customerDetailService.registerCustomer(customerDetails), HttpStatus.CREATED);
	}
}
