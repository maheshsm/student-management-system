package com.ecommerce.repository;

import java.util.List;

import org.aspectj.apache.bcel.classfile.ConstantNameAndType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
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
	
	@Autowired
	NamedParameterJdbcTemplate namedParameterJdbcTemplate;

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

	/* Product get all product
	 */
	public ProductDetailsResponse getAllProductDetails() {
		
		ProductDetailsResponse productDetailsResponse = new ProductDetailsResponse();
		
		List<ProductDetailsRes> response = jdbcTemplate.query(SqlConstant.GET_ALL_PRODUCT_DETAILS, new ProductDetailsResMapper());
		productDetailsResponse.setProductDetailsRes(response);
		
		return productDetailsResponse;
	}
	
	/*Product Upadate Oparation*/

	public Integer updateProduct(ProductDetails productDetails, Long productId) {
		 return jdbcTemplate.update(SqlConstant.UPDATE_PRODUCT_BY_ID, productDetails.getCategoryId(),productDetails.getDiscountId(),productDetails.getName(),
				productDetails.getPricePerQuantity(), productDetails.getPricePerKg(), productDetails.getPricePerLtr(), productDetails.getTotalQuantity(),
				productDetails.getTotalKg(),productDetails.getTotalLtr(), productDetails.getTotalPrice(), productDetails.getIsWarranty(),
				productDetails.getIsGuarantee(), productDetails.getGuaranteeDate(), productDetails.getSgst(), productDetails.getCgst(),productDetails.getProductId());
	}

	/*Product delete Id*/
	public void deleteProductById(long productId) {
		MapSqlParameterSource params = new MapSqlParameterSource();
	    params.addValue("discount_id", productId);
	    namedParameterJdbcTemplate.update(SqlConstant.DELETE_PRODUCT_BY_ID, params);
	}
}
