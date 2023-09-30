package com.ecommerce.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.ecommerce.constant.SqlConstant;
import com.ecommerce.mappers.ProductDetailsResMapper;
import com.ecommerce.model.ProductDetails;
import com.ecommerce.model.ProductDetailsRes;
import com.ecommerce.model.ProductDetailsResponse;

@Repository
public class ProductDetailsRepository {

	@Autowired
	JdbcTemplate jdbcTemplate;

	/**
	 * 
	 * @param productDetails
	 */
	public void addNewProduct(ProductDetails productDetails) {

		jdbcTemplate.update(SqlConstant.ADD_NEW_PRODUCT, productDetails.getProductId(), productDetails.getCategoryId(),
				productDetails.getDiscountId(), productDetails.getName(), productDetails.getPricePerQuantity(),
				productDetails.getPricePerKg(), productDetails.getPricePerLtr(), productDetails.getTotalQuantity(),
				productDetails.getTotalKg(), productDetails.getTotalLtr(), productDetails.getTotalPrice(),
				productDetails.getIsWarranty(), productDetails.getWarrantyDate(), productDetails.getIsGuarantee(),
				productDetails.getGuaranteeDate(), productDetails.getSgst(), productDetails.getCgst());
	}

	/**
	 * 
	 * @return
	 */
	public ProductDetailsResponse getAllProductDetails() {
		
		ProductDetailsResponse productDetailsResponse = new ProductDetailsResponse();
		
		List<ProductDetailsRes> response = jdbcTemplate.query(SqlConstant.GET_ALL_PRODUCT_DETAILS, new ProductDetailsResMapper());
		productDetailsResponse.setProductDetailsRes(response);
		
		return productDetailsResponse;
	}
}
