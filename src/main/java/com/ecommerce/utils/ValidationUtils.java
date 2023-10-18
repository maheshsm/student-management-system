package com.ecommerce.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ecommerce.exception.DuplicateNameException;
import com.ecommerce.repository.ProductDetailsRepository;

@Component
public class ValidationUtils {

	@Autowired 
	ProductDetailsRepository detailsRepository;

	public void checkNameNotExists(String name) {
		
		if(detailsRepository.checkNameNotExists(name).size() > 0) {
			throw new DuplicateNameException("name", "Name is duplicate", name);
		}
	}
}
