package com.ecommerce.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.ecommerce.dto.customerDetailsDTO;
import com.ecommerce.model.CustomerDetails;

@Repository
public class CustomerDetailsRepository {

	@Autowired
	JdbcTemplate jdbcTemplate;

	/**
	 * This method is responsible to create user and store in database
	 * 
	 * @param customerDetails
	 * @return Integer value
	 */
	public Integer registeCustomer(CustomerDetails customerDetails) {
		
		return jdbcTemplate.update(SqlConstant.INSERT_CUSTOMER, customerDetails.getFirstName(), customerDetails.getLastName(),
				customerDetails.getUsername(), customerDetails.getPassword(), customerDetails.getMobile(),
				customerDetails.getEmail(), customerDetails.getAddress());

	}

	/**
	 * This is DTO - customerDTO responsible for getting data using select query
	 * and it will fetch user by customerId 
	 * 
	 * @param customerId
	 * @return CustomerDetails ( it will return object )
	 */
	public customerDetailsDTO findById(Long customerId) {
		
		RowMapper<customerDetailsDTO> rowMapper = new RowMapper<customerDetailsDTO>() {

			@Override
			public customerDetailsDTO mapRow(ResultSet rs, int rowNum) throws SQLException {
				customerDetailsDTO customerDetails = new customerDetailsDTO();
				customerDetails.setCustomerId(rs.getInt(1));
				customerDetails.setFirstName(rs.getString(2));
				customerDetails.setLastName(rs.getString(3));
				customerDetails.setMobile(rs.getLong(6));
				customerDetails.setEmail(rs.getString(7));
				customerDetails.setAddress(rs.getString(8));

				return customerDetails;
			}
		};
		customerDetailsDTO customerDetails = jdbcTemplate.queryForObject(SqlConstant.FIND_CUSTOMER_BY_ID, rowMapper, customerId);
		return customerDetails;
	}

	/**
	 * This method is responsible for getting all user data form database
	 * @return List<CustomerDetails> 
	 */
	public List<customerDetailsDTO> findAll() {
		RowMapper<customerDetailsDTO> rowMapper = new RowMapper<customerDetailsDTO>() {

			@Override
			public customerDetailsDTO mapRow(ResultSet rs, int rowNum) throws SQLException {
				customerDetailsDTO customerDetails = new customerDetailsDTO();
				customerDetails.setCustomerId(rs.getInt(1));
				customerDetails.setFirstName(rs.getString(2));
				customerDetails.setLastName(rs.getString(3));
				customerDetails.setMobile(rs.getLong(6));
				customerDetails.setEmail(rs.getString(7));
				customerDetails.setAddress(rs.getString(8));
				return customerDetails;
			}
		};

		List<customerDetailsDTO> list = jdbcTemplate.query(SqlConstant.FIND_ALL_CUSTOMER_RECORD, rowMapper);
		return list;
	}

	 /**
	 * This method is responsible for updating user by customerId in database
	 * @param customerDetails
	 * @return Integer
	 */
	public Integer update(CustomerDetails customerDetails , Long userId ) {
		
				
		return jdbcTemplate.update(SqlConstant.UPDATE_CUSTOMER_BY_ID, customerDetails.getFirstName(), customerDetails.getLastName(),
				customerDetails.getEmail(), customerDetails.getMobile(), customerDetails.getAddress(),
				customerDetails.getCustomerId());

	}
	
	/**
	 * This method is responsible for delete customer from database by customerId
	 * @param customerId
	 */
	public void deleteById(Long customerId) {
		
		jdbcTemplate.update(SqlConstant.DELETE_CUSTOMER_BY_ID, customerId);
	}

}
