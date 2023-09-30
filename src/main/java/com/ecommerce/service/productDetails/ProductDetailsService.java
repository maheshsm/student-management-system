package com.ecommerce.service.productDetails;

import java.util.List;

import com.ecommerce.model.ProductDetails;
import com.ecommerce.model.ProductDetailsResponse;

public interface ProductDetailsService {

	public void addNewProduct(ProductDetails productDetails);
	
	public ProductDetailsResponse getAllProductDetails();
}
