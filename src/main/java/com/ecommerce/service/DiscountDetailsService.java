package com.ecommerce.service;

import java.util.List;

import com.ecommerce.model.DiscountDetails;

public interface DiscountDetailsService {
  
	List<DiscountDetails> getAllDiscountDetails();
	
	DiscountDetails getDiscountDetails(Integer id);
	
	DiscountDetails saveDiscountDetails(DiscountDetails discountDetails);
	
	void deleteDiscountDetails(Integer id);

}
