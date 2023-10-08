package com.ecommerce.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.model.DiscountDetails;
import com.ecommerce.repository.discountDetails.DiscountDetailsRepository;

@Service
public class DiscountDetailsServiceImpl implements DiscountDetailsService{

	@Autowired
	 private DiscountDetailsRepository discountDetailsRepository;
	
	@Override
	public List<DiscountDetails> getAllDiscountDetails() {
		
		return  discountDetailsRepository.getAllDiscountDetails();
	}

	@Override
	public DiscountDetails getDiscountDetails(Integer id) {
		
		return discountDetailsRepository.getDiscountDetails(id);
	}

	@Override
	public DiscountDetails saveDiscountDetails(DiscountDetails discountDetails) {
		discountDetailsRepository.saveDiscountDetails(discountDetails);
		return null;
	}

	@Override
	public void deleteDiscountDetails(Integer id) {
		discountDetailsRepository.deleteDiscountDetails(id);
	}

}
