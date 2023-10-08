package com.ecommerce.service.productDetails;

import com.ecommerce.model.ProductDetails;
import com.ecommerce.model.ProductDetailsRes;
import com.ecommerce.model.ProductDetailsResponse;

public interface ProductDetailsService {

	public void addNewProduct(ProductDetails productDetails);
	
	public ProductDetailsResponse getAllProductDetails();
	
	public ProductDetailsRes getProductDetails(Integer productId);
}
