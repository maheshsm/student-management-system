package com.ecommerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.mongo.ReactiveStreamsMongoClientDependsOnBeanFactoryPostProcessor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.model.ProductCategory;
import com.ecommerce.service.ProductCategoryService;

@RequestMapping("/ecommerce/category")
@RestController
public class ProductCategoryController {

	@Autowired
	private ProductCategoryService productCategoryService;

	@PostMapping("/")
	public ResponseEntity<?> addNewProductCategory(@RequestBody ProductCategory productCategory) {

		productCategoryService.addProductCategory(productCategory);

		return new ResponseEntity<>(HttpStatus.CREATED);
	}

	@GetMapping("/getall")
	public ResponseEntity<?> getAllProductCategories() {

		return new ResponseEntity<>(productCategoryService.findAllProductCategories(), HttpStatus.OK);
	}

	@GetMapping("/get/{categoryId}")
	public ResponseEntity<?> getProductCategoryById(@PathVariable Integer categoryId) {

		return new ResponseEntity<>(productCategoryService.findProductCategoryById(categoryId), HttpStatus.OK);
	}

	@DeleteMapping("/delete/{categoryId}")
	public ResponseEntity<?> deleteProductCategoryById(@PathVariable Integer categoryId) {
		productCategoryService.deleteProductCategoryById(categoryId);
		return new ResponseEntity<>(HttpStatus.OK);
	}

	@PutMapping("/edit/{categoryId}")
	public ResponseEntity<?> updateProductCategory(@PathVariable Integer categoryId,
			@RequestBody ProductCategory productCategory) {
		return new ResponseEntity<>(productCategoryService.updateProductCategory(productCategory, categoryId),
				HttpStatus.OK);

	}

}
