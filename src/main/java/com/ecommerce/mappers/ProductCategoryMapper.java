package com.ecommerce.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.ecommerce.model.ProductCategory;

public class ProductCategoryMapper implements RowMapper<ProductCategory> {

	@Override
	public ProductCategory mapRow(ResultSet rs, int rowNum) throws SQLException {
		ProductCategory productCategory = new ProductCategory();

		productCategory.setCategoryId(rs.getInt(1));
		productCategory.setCategoryName(rs.getString(2));
		return productCategory;
	}

}
