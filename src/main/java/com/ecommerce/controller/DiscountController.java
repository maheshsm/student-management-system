package com.ecommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.model.DiscountDetails;
import com.ecommerce.service.DiscountDetailsService;


@RestController
@RequestMapping("/ecommerce/discount")
public class DiscountController {

	@Autowired
	private DiscountDetailsService discountDetailsService;
	
	
	@PostMapping("/create")
    public ResponseEntity<String> createDiscountDetails(@RequestBody DiscountDetails discountDetails) {
        try {
        	discountDetailsService.saveDiscountDetails(discountDetails);
            return new ResponseEntity<>("Discount details created successfully", HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>("Error creating discount details: " + e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
	
	
   	@GetMapping("/get/all")
   	public ResponseEntity<List<DiscountDetails>> getAllDiscountDetails() {
   		return new ResponseEntity<List<DiscountDetails>>(discountDetailsService.getAllDiscountDetails(), HttpStatus.OK );
   	}
   	
   	@GetMapping("/get/{discountId}")
   	public ResponseEntity<DiscountDetails> getAllDiscountDetails( @PathVariable Integer discountId) {
   		return new ResponseEntity<DiscountDetails>(discountDetailsService.getDiscountDetails(discountId), HttpStatus.OK );
   	}
   	
   	
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteUser(@PathVariable Integer id) {
    	 discountDetailsService.deleteDiscountDetails(id);
    	return new ResponseEntity<>("discount deleted with Id: " + id, HttpStatus.NO_CONTENT);
    }
	
}
