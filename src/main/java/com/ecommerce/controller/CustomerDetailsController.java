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

import com.ecommerce.dto.CustomerDetailsDTO;
import com.ecommerce.model.CustomerDetails;
import com.ecommerce.service.CustomerDetailServiceIn;

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

	/**
	 * This is get method for sending response to client
	 * 
	 * @param customerId
	 * @return
	 */
	@GetMapping("/{customerId}")

	public ResponseEntity<CustomerDetailsDTO> getRecordCustomerDetails(@PathVariable Long customerId) {
		CustomerDetailsDTO cusomterDTO = customerDetailService.findByCustomerDetails(customerId);
		try

		{
			return new ResponseEntity<>(cusomterDTO, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	/**
	 * This is get method to send list of all customer to client
	 * 
	 * @return
	 */
	@GetMapping("/get/all")
	public ResponseEntity<List<CustomerDetailsDTO>> getAllCustomerRecord() {
		return new ResponseEntity<>(customerDetailService.findAllCustomerRecord(), HttpStatus.OK);
	}

	/**
	 * This is put method to response to update data from client
	 * 
	 * @param customerDetails
	 * @param customerId
	 * @return
	 */
	@PutMapping("/{customerId}")
	public ResponseEntity<Integer> updateCustomerDetails(@RequestBody CustomerDetails customerDetails,
			@PathVariable Long customerId) {
		try {
			return new ResponseEntity<>(customerDetailService.updateCustomerDetails(customerDetails, customerId),
					HttpStatus.CREATED);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<>(customerDetailService.updateCustomerDetails(customerDetails, customerId),
					HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	/**
	 * This is delete method to request to delete customer form database
	 * 
	 * @param customerId
	 * @return
	 * @throws SQLException
	 */
	@DeleteMapping("/{customerId}")
	public ResponseEntity<?> deleteCustomerDetails(@PathVariable Long customerId) throws SQLException {
		customerDetailService.deleteCustomerDetails(customerId);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}
}
