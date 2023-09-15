package com.ecommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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

	
	//insert 
	@PostMapping("/register/customer")
	public ResponseEntity<Integer> registerCustomer(@RequestBody CustomerDetails customerDetails){
		return new ResponseEntity<>(customerDetailService.registerCustomer(customerDetails), HttpStatus.CREATED);
	}
	
	//retrieve details
	@GetMapping("/customer/{customerId}")
	public ResponseEntity<List<CustomerDetails>> getRecordCustomerDetails(@PathVariable int customerId){
		try {
			return new ResponseEntity<>(customerDetailService.getCustomerDetails(customerId), HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<>(customerDetailService.getCustomerDetails(customerId), HttpStatus.NOT_FOUND);
		}
		
		
		
	}
	
	@GetMapping("/customer")
	public  ResponseEntity<List<CustomerDetails>> getAllCustomerRecord() {
		
		try {
			return new ResponseEntity<>(customerDetailService.getAllCustomerRecord(), HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<>(customerDetailService.getAllCustomerRecord(), HttpStatus.NOT_FOUND);
		}
		
	}
	
	
	//update
	@PutMapping("/customer")
	public ResponseEntity<Integer> updateCustomerDetails(@RequestBody CustomerDetails customerDetails){
		try {
			return new ResponseEntity<>(customerDetailService.updateCustomerDetails(customerDetails), HttpStatus.CREATED);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<>(customerDetailService.updateCustomerDetails(customerDetails), HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	
	//delete
	@DeleteMapping("/customer/{customerId}")
	public ResponseEntity<?> deleteCustomerDetails(@PathVariable int customerId ){
		 customerDetailService.deleteCustomerDetails(customerId);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}
	
}
