package com.ecommerce.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.ecommerce.model.DiscountDetails;

public class DiscountDetailsRowMapper implements RowMapper<DiscountDetails> {

	
	    
		@Override
		public DiscountDetails mapRow(ResultSet rs, int rowNum) throws SQLException {
			
			DiscountDetails  discountDetails = new DiscountDetails();
			
			  discountDetails.setDiscountId(rs.getInt("discount_id"));
		        discountDetails.setDiscountName(rs.getString("discount_name"));
		        discountDetails.setDiscountType(rs.getString("discount_type"));
		        discountDetails.setDiscountValue(rs.getInt("discount_value"));
			
			return discountDetails;
		}
	
		

}
