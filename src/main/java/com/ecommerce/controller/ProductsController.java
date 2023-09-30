package com.ecommerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.model.ProductDetails;
import com.ecommerce.model.ProductDetailsResponse;
import com.ecommerce.service.productDetails.ProductDetailsService;

@RestController
@RequestMapping("/product")
public class ProductsController {

	@Autowired
	ProductDetailsService productDetailsService;
	
	@PostMapping
	public ResponseEntity<?> addNewProduct(@RequestBody ProductDetails productDetails) {
		
		productDetailsService.addNewProduct(productDetails);
		
		return new ResponseEntity<>(HttpStatus.CREATED);
	}
	
	@GetMapping
	public ResponseEntity<ProductDetailsResponse> getAllProductDetails() {
		
		return new ResponseEntity<ProductDetailsResponse>(productDetailsService.getAllProductDetails(), HttpStatus.OK);
	}
}
