package com.ecommerce.service.productDetails;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.model.ProductDetails;
import com.ecommerce.model.ProductDetailsResponse;
import com.ecommerce.repository.ProductDetailsRepository;
import com.ecommerce.repository.categoryDetails.CategoryDetailsRepository;
import com.ecommerce.repository.discountDetails.DiscountDetailsRepository;

@Service
public class ProductDetailsServiceImpl implements ProductDetailsService {

	@Autowired
	ProductDetailsRepository productDetailsRepository;

	@Autowired
	CategoryDetailsRepository categoryDetailsRepository;

	@Autowired
	DiscountDetailsRepository discountDetailsRepository;

	@Override
	public void addNewProduct(ProductDetails productDetails) {

		// 1. validate category and discount exists or not.
		if (categoryDetailsRepository.isCategoryExists(productDetails.getCategoryId())
				&& discountDetailsRepository.isDiscountExists(productDetails.getDiscountId()))
			productDetailsRepository.addNewProduct(productDetails);
	}
	
	@Override
	public ProductDetailsResponse getAllProductDetails() {
		
		return productDetailsRepository.getAllProductDetails();
	}

	@Override
	public Integer updateProductsDetails(ProductDetails productDetails, Long customerId) {
		
		return productDetailsRepository.updateProduct(productDetails, customerId);
	}
	
	@Override
	public void deleteById(long productId) {
		productDetailsRepository.deleteProductById(productId);
		}
}
