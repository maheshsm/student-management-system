package com.ecommerce.controller;

import java.util.HashMap;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.ecommerce.model.ProductDetails;
import com.ecommerce.model.ProductDetailsRes;
import com.ecommerce.model.ProductDetailsResponse;
import com.ecommerce.model.Test;
import com.ecommerce.service.productDetails.ProductDetailsService;

@RestController
@RequestMapping("/product")
public class ProductsController {

	@Autowired
	ProductDetailsService productDetailsService;
	
	@Autowired
	RestTemplate restTemplate;
	
	@PostMapping
	public ResponseEntity<?> addNewProduct(@RequestBody ProductDetails productDetails) {
		
		productDetailsService.addNewProduct(productDetails);
		
		return new ResponseEntity<>(HttpStatus.CREATED);
	}
	
	@GetMapping
	public ResponseEntity<ProductDetailsResponse> getAllProductDetails() {
		
		return new ResponseEntity<ProductDetailsResponse>(productDetailsService.getAllProductDetails(), HttpStatus.OK);
	}
	
	@GetMapping("/{productId}")
	public ResponseEntity<ProductDetailsRes> getProductDetails(@PathVariable Integer productId) {
		
		return new ResponseEntity<ProductDetailsRes>(productDetailsService.getProductDetails(productId), HttpStatus.OK);
	}
	
	@GetMapping("/call")
	public ResponseEntity<String> getAnotherApi(@RequestBody @Valid Test test) {
		
		HttpEntity<?> entity = new HttpEntity<Test>(test);
		
		
		
		// Simple Request - restTemplate.getForEntity("http://localhost:8077/test/get", String.class);
		// Query Param - restTemplate.exchange("http://localhost:8077/test/get/name?name= {name}", HttpMethod.GET, entity, String.class, map);
		// Path Variable - restTemplate.exchange("http://localhost:8077/test/get/{name}", HttpMethod.GET, entity, String.class, map);
		// Request Body - restTemplate.postForEntity("http://localhost:8077/test/get/add", entity, String.class);
		// Request Body - restTemplate.exchange("http://localhost:8077/test/get/add", HttpMethod.GET, entity, String.class);

		// validate input data
		ResponseEntity<String> response = restTemplate.postForEntity("http://localhost:8077/test/get/add", entity, String.class);
		
		// calculate student percentage
		///
		
		// Make DB entry
		
		/////
		return response;
	}
}
