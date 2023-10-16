package com.ecommerce.repository;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.stereotype.Repository;

import com.ecommerce.constant.SqlConstant;
import com.ecommerce.mappers.ProductDetailsMapper;
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

		List<ProductDetailsRes> response = jdbcTemplate.query(SqlConstant.GET_ALL_PRODUCT_DETAILS,
				new ProductDetailsResMapper());
		productDetailsResponse.setProductDetailsRes(response);

		return productDetailsResponse;
	}

	public ProductDetailsRes getProductDetails(Integer productId) {

		ProductDetailsRes response = jdbcTemplate.queryForObject(SqlConstant.GET_PRODUCT_DETAILS_BY_PRODUCTID,
				new ProductDetailsMapper(), productId);

		return response;
	}

	public List<Map<String, Object>> checkNameNotExists(String name) {
		
		MapSqlParameterSource params = new MapSqlParameterSource();
	    params.addValue("name", name);
	    
		List<Map<String, Object>> response = jdbcTemplate.queryForList(SqlConstant.CHECK_PRODUCT_DUPLICATION, params,
				new ProductDetailsResMapper());
		
		return response;
	}
}
