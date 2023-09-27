package com.ecommerce.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.ecommerce.constant.SqlConstant;
import com.ecommerce.model.ProductDetails;

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
}
