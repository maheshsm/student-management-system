package com.ecommerce.service.productDetails;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.model.ProductDetails;
import com.ecommerce.model.ProductDetailsRes;
import com.ecommerce.model.ProductDetailsResponse;
import com.ecommerce.repository.ProductDetailsRepository;
import com.ecommerce.repository.categoryDetails.CategoryDetailsRepository;
import com.ecommerce.repository.discountDetails.DiscountDetailsRepository;
import com.ecommerce.utils.ValidationUtils;

@Service
public class ProductDetailsServiceImpl implements ProductDetailsService {

	@Autowired
	ProductDetailsRepository productDetailsRepository;

	@Autowired
	CategoryDetailsRepository categoryDetailsRepository;

	@Autowired
	DiscountDetailsRepository discountDetailsRepository;

	@Autowired
	ValidationUtils validationUtils;
	
	@Override
	public void addNewProduct(ProductDetails productDetails) {

		validationUtils.checkNameNotExists(productDetails.getName());
		
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
	public ProductDetailsRes getProductDetails(Integer productId) {
		
		return productDetailsRepository.getProductDetails(productId);
	}
}
