package com.ecommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.dto.BillingDetailsDTO;
import com.ecommerce.model.BillingDetails;
import com.ecommerce.service.BillingDetailsService;

@RestController
@RequestMapping("/ecommerce/Billing")
public class BillingDetailsController {
	
	@Autowired
	public BillingDetailsService billingDetailsService;

	
	@PostMapping("/register")
	public ResponseEntity<Integer> registerBillingDetails(@RequestBody BillingDetails billingDetails){
		billingDetailsService.inserBillingDetails(billingDetails);
		return new ResponseEntity<>(HttpStatus.CREATED);
	}
	
	@GetMapping("/billid/{b_id}")
	public ResponseEntity<BillingDetails> getBillingDetailsById(@PathVariable int billing_id){
		
		return new ResponseEntity<BillingDetails>(billingDetailsService.getBillDetailsById(billing_id),HttpStatus.ACCEPTED);
	}
	
	@GetMapping("all_billing_data")
	public ResponseEntity<List<BillingDetails>> getAllBillingDetails(){
		return new ResponseEntity<List<BillingDetails>>(billingDetailsService.getAllBillingData(), HttpStatus.OK);
	}
}

