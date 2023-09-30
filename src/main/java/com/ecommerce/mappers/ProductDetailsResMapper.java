package com.ecommerce.mappers;

import org.springframework.jdbc.core.RowMapper;

import com.ecommerce.model.ProductDetailsRes;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ProductDetailsResMapper implements RowMapper<ProductDetailsRes> {
    
	@Override
    public ProductDetailsRes mapRow(ResultSet resultSet, int rowNum) throws SQLException {
    	
		
        ProductDetailsRes productDetails = new ProductDetailsRes();
        
        productDetails.setProductId(resultSet.getInt("productid"));
        productDetails.setName(resultSet.getString("name"));
        productDetails.setPricePerQuantity(resultSet.getDouble("pricePerQuantity"));
        productDetails.setPricePerKg(resultSet.getDouble("pricePerKg"));
        productDetails.setPricePerLtr(resultSet.getDouble("pricePerLtr"));
        productDetails.setTotalQuantity(resultSet.getInt("totalQuantity"));
        productDetails.setTotalKg(resultSet.getInt("totalKg"));
        productDetails.setTotalLtr(resultSet.getInt("totalLtr"));
        productDetails.setTotalPrice(resultSet.getDouble("totalPrice"));
        productDetails.setIsWarranty(resultSet.getBoolean("isWarranty"));
        if(resultSet.getDate("warrantyDate") != null)
        productDetails.setWarrantyDate(resultSet.getDate("warrantyDate").toLocalDate());
        
        productDetails.setIsGuarantee(resultSet.getBoolean("isGuarantee"));
        if(resultSet.getDate("guaranteeDate") != null)
        productDetails.setGuaranteeDate(resultSet.getDate("guaranteeDate").toLocalDate());
        productDetails.setSgst(resultSet.getDouble("sgst"));
        productDetails.setCgst(resultSet.getDouble("cgst"));
        productDetails.setCategoryName(resultSet.getString("categoryName"));
        productDetails.setDiscountName(resultSet.getString("discountName"));
        productDetails.setDiscountType(resultSet.getString("discountType"));
        productDetails.setDiscountValue(resultSet.getInt("discountValue"));
        
        return productDetails;
    }
}