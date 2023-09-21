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

import com.ecommerce.dto.CustomerDetailsDTO;
import com.ecommerce.model.CustomerDetails;
import com.ecommerce.service.CustomerDetailServiceIn;

@RestController
@RequestMapping("/ecommerce/customer")
public class CustomerDetailsController {

	@Autowired
	public CustomerDetailServiceIn customerDetailService;

	/**
	 * Register New customer.
	 * 
	 * @param customerDetails
	 * @return ResponseEntity<Integer>
	 */
	@PostMapping("/register")
	public ResponseEntity<Integer> registerCustomer(@RequestBody CustomerDetails customerDetails) {

		return new ResponseEntity<>(customerDetailService.registerCustomer(customerDetails), HttpStatus.CREATED);
	}

	// retrieve details by id
	@GetMapping("/{customerId}")
	public ResponseEntity<CustomerDetailsDTO> getRecordCustomerDetails(@PathVariable int customerId) {
		return new ResponseEntity<>(customerDetailService.findByCustomerDetails(customerId), HttpStatus.OK);

	}

	// retrieve all details
	@GetMapping("/get/all")
	public ResponseEntity<List<CustomerDetailsDTO>> getAllCustomerRecord() {
		return new ResponseEntity<>(customerDetailService.findAllCustomerRecord(), HttpStatus.OK);
	}

	// update
	@PutMapping("/{customerId}")
	public ResponseEntity<Integer> updateCustomerDetails(@PathVariable Integer customerId,
			@RequestBody CustomerDetails customerDetails) {
		try {
			return new ResponseEntity<>(customerDetailService.updateCustomerDetails(customerDetails),
					HttpStatus.CREATED);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<>(customerDetailService.updateCustomerDetails(customerDetails),
					HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	// delete
	@DeleteMapping("/{customerId}")
	public ResponseEntity<?> deleteCustomerDetails(@PathVariable int customerId) throws SQLException {
		customerDetailService.deleteCustomerDetails(customerId);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}

}
