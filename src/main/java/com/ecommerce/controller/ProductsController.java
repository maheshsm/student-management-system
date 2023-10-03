package com.ecommerce.controller;

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

	@PutMapping("/{productId}")
	public ResponseEntity<Integer> updateProductDetails(@RequestBody ProductDetails productDetails,
			@PathVariable Long productId) {

		return new ResponseEntity<>(productDetailsService.updateProductsDetails(productDetails, productId),
				HttpStatus.CREATED);
	}
	
	@DeleteMapping("/{productId}")
	public ResponseEntity<String> deleteProductById(@PathVariable long productId){
		productDetailsService.deleteById(productId);
		return new ResponseEntity<String>("product are deleted",HttpStatus.OK);
		
	}
}
