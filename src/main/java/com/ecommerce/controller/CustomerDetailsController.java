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
import com.ecommerce.model.CustomerDetails;
import com.ecommerce.service.CustomerDetailServiceIn;

@RestController
@RequestMapping("/ecommerce")
public class CustomerDetailsController {

	@Autowired
	public CustomerDetailServiceIn customerDetailService;

	/**
	 * This is post method to response for client
	 * 
	 * @param customerDetails
	 * @return
	 */
	@PostMapping("customer/register")
	public ResponseEntity<Integer> registerCustomer(@RequestBody CustomerDetails customerDetails) {
		return new ResponseEntity<>(customerDetailService.registerCustomer(customerDetails), HttpStatus.CREATED);
	}

	/**
	 * This is get method for sending response to client
	 * 
	 * @param customerId
	 * @return
	 */
	@GetMapping("customer/{customerId}")
	public ResponseEntity<customerDetailsDTO> getRecordCustomerDetails(@PathVariable Long customerId) {

		customerDetailsDTO cusomterDTO = customerDetailService.findByCustomerDetails(customerId);

		try {
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
	@GetMapping("/customer/all")
	public ResponseEntity<List<customerDetailsDTO>> getAllCustomerRecord() {
		return new ResponseEntity<>(customerDetailService.findAllCustomerRecord(), HttpStatus.OK);
	}

	/**
	 * This is put method to response to update data from client
	 * 
	 * @param customerDetails
	 * @param customerId
	 * @return
	 */
	@PutMapping("customer/{customerId}")
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
	@DeleteMapping("customer/delete/{customerId}")
	public ResponseEntity<?> deleteCustomerDetails(@PathVariable Long customerId) throws SQLException {
		customerDetailService.deleteCustomerDetails(customerId);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}

}
