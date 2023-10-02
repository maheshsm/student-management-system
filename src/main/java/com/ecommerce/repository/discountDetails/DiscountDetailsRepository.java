package com.ecommerce.repository.discountDetails;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.ecommerce.constant.SqlConstant;
import com.ecommerce.mappers.DiscountDetailsRowMapper;
import com.ecommerce.model.DiscountDetails;


@Repository
public class DiscountDetailsRepository  {

	@Autowired
	NamedParameterJdbcTemplate namedParameterJdbcTemplate;
	
	@Autowired
	 private JdbcTemplate jdbcTemplate;
	
	public Boolean isDiscountExists(Integer discountId) {
		MapSqlParameterSource params = new MapSqlParameterSource();
	    params.addValue("discountId", discountId);
		return namedParameterJdbcTemplate.queryForList("SELECT * FROM discount_details WHERE discount_id=:discountId", params).isEmpty() ? false : true;
	}
	
	 public List<DiscountDetails> getAllDiscountDetails() {
	        List<DiscountDetails> discounts = jdbcTemplate.query(SqlConstant.SELECT_ALL_DISCOUNTS, new DiscountDetailsRowMapper());
	        return discounts;
	    }
	
	    public DiscountDetails getDiscountDetails(Integer discountId) {
		    RowMapper<DiscountDetails> rowMapper = new DiscountDetailsRowMapper(); 
		    return jdbcTemplate.queryForObject(SqlConstant.SELECT_DISCOUNT_BY_ID, rowMapper,discountId);
		}

		
	    public void saveDiscountDetails(DiscountDetails discountDetails) {
	        jdbcTemplate.update(SqlConstant.INSERT_DISCOUNT, discountDetails.getDiscountId(), discountDetails.getDiscountName(),
	                           discountDetails.getDiscountType(), discountDetails.getDiscountValue());
	    }
		
		public void deleteDiscountDetails(Integer discount_id) {
		    MapSqlParameterSource params = new MapSqlParameterSource();
		    params.addValue("discount_id", discount_id);
		    namedParameterJdbcTemplate.update(SqlConstant.DELETE_DISCOUNT_BY_ID, params);
		}
		

}