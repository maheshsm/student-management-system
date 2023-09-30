package com.ecommerce.repository.categoryDetails;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;


@Repository
public class CategoryDetailsRepository {

	@Autowired
	NamedParameterJdbcTemplate namedParameterJdbcTemplate;
	
	public Boolean isCategoryExists(Integer categoryId) {
		
		MapSqlParameterSource map = new MapSqlParameterSource();
		map.addValue("category_id", categoryId);
		
		return namedParameterJdbcTemplate.queryForList("SELECT * FROM product_category WHERE category_id=:category_id", map).isEmpty() ? false : true;
	}
}
