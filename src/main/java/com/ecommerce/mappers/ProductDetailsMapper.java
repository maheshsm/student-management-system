package com.ecommerce.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.ecommerce.model.ProductDetailsRes;

public class ProductDetailsMapper implements RowMapper<ProductDetailsRes> {

	@Override
	public ProductDetailsRes mapRow(ResultSet rs, int rowNum) throws SQLException {
		ProductDetailsRes productDetails = new ProductDetailsRes();

		productDetails.setProductId(rs.getInt("productid"));
		productDetails.setName(rs.getString("name"));
		productDetails.setPricePerQuantity(rs.getDouble("pricePerQuantity"));
		productDetails.setPricePerKg(rs.getDouble("pricePerKg"));
		productDetails.setPricePerLtr(rs.getDouble("pricePerLtr"));
		productDetails.setTotalQuantity(rs.getInt("totalQuantity"));
		productDetails.setTotalKg(rs.getInt("totalKg"));
		productDetails.setTotalLtr(rs.getInt("totalLtr"));
		productDetails.setTotalPrice(rs.getDouble("totalPrice"));
		productDetails.setIsWarranty(rs.getBoolean("isWarranty"));
		if (rs.getDate("warrantyDate") != null)
			productDetails.setWarrantyDate(rs.getDate("warrantyDate").toLocalDate());

		productDetails.setIsGuarantee(rs.getBoolean("isGuarantee"));
		if (rs.getDate("guaranteeDate") != null)
			productDetails.setGuaranteeDate(rs.getDate("guaranteeDate").toLocalDate());
		productDetails.setSgst(rs.getDouble("sgst"));
		productDetails.setCgst(rs.getDouble("cgst"));
		productDetails.setCategoryName(rs.getString("categoryName"));
		productDetails.setDiscountName(rs.getString("discountName"));
		productDetails.setDiscountType(rs.getString("discountType"));
		productDetails.setDiscountValue(rs.getInt("discountValue"));

		return productDetails;
	}

}
