package com.ecommerce.repository.discountDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;


@Repository
public class DiscountDetailsRepository {

	@Autowired
	NamedParameterJdbcTemplate namedParameterJdbcTemplate;
	
	public Boolean isDiscountExists(Integer discountId) {
		
		MapSqlParameterSource map = new MapSqlParameterSource();
		map.addValue("discountId", discountId);
		
		return namedParameterJdbcTemplate.queryForList("SELECT * FROM discount_details WHERE discount_id=:discountId", map).isEmpty() ? false : true;
	}
}