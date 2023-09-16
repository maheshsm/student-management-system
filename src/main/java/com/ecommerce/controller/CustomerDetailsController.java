package com.ecommerce.controller;

import java.sql.SQLException;
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

import com.ecommerce.dto.customerDetailsDTO;
import com.ecommerce.exception.ResourceNotFoundException;
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
	
	//retrieve details by id
	@GetMapping("/customer/{customerId}")
	public ResponseEntity<customerDetailsDTO> getRecordCustomerDetails(@PathVariable int customerId){
			return new ResponseEntity<>(customerDetailService.findByCustomerDetails(customerId), HttpStatus.OK);	
		
	}
	
	//retrieve all details
	@GetMapping("/customer")
	public  ResponseEntity<List<customerDetailsDTO>> getAllCustomerRecord() {
			return new ResponseEntity<>(customerDetailService.findAllCustomerRecord(), HttpStatus.OK);
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
	public ResponseEntity<?> deleteCustomerDetails(@PathVariable int customerId ) throws SQLException{
		 customerDetailService.deleteCustomerDetails(customerId);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}
	
}
