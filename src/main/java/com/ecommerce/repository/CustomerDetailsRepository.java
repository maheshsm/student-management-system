package com.ecommerce.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.ecommerce.constant.SqlConstant;
import com.ecommerce.dto.CustomerDetailsDTO;
import com.ecommerce.model.CustomerDetails;

@Repository
public class CustomerDetailsRepository {

	@Autowired
	JdbcTemplate jdbcTemplate;

	/**
	 * Creating New Customer
	 * 
	 * @param customer
	 * @return Integer
	 */
	public Integer registerNewCustomer(CustomerDetails customer) {

		return jdbcTemplate.update(SqlConstant.REGISTER_CUSTOMER, customer.getFirstName(), customer.getLastName(),
				customer.getUsername(), customer.getPassword(), customer.getMobile(), customer.getEmail(),
				customer.getAddress());
	}

	/**
	 * This is DTO - customerDTO responsible for getting data using select query and
	 * it will fetch user by customerId
	 * 
	 * @param customerId
	 * @return CustomerDetails ( it will return object )
	 */
	public CustomerDetailsDTO findById(Long customerId) {

		RowMapper<CustomerDetailsDTO> rowMapper = new RowMapper<CustomerDetailsDTO>() {
			@Override
			public CustomerDetailsDTO mapRow(ResultSet rs, int rowNum) throws SQLException {
				CustomerDetailsDTO customerDetails = new CustomerDetailsDTO();
				customerDetails.setCustomerId(rs.getInt(1));
				customerDetails.setFirstName(rs.getString(2));
				customerDetails.setLastName(rs.getString(3));
				customerDetails.setMobile(rs.getLong(6));
				customerDetails.setEmail(rs.getString(7));
				customerDetails.setAddress(rs.getString(8));

				return customerDetails;
			}
		};
		CustomerDetailsDTO customerDetails = jdbcTemplate.queryForObject(SqlConstant.FIND_CUSTOMER_BY_ID, rowMapper,
				customerId);
		return customerDetails;
	}

	/**
	 * This method is responsible for getting all user data form database
	 * 
	 * @return List<CustomerDetails>
	 */
	public List<CustomerDetailsDTO> findAll() {
		RowMapper<CustomerDetailsDTO> rowMapper = new RowMapper<CustomerDetailsDTO>() {
			@Override
			public CustomerDetailsDTO mapRow(ResultSet rs, int rowNum) throws SQLException {
				CustomerDetailsDTO customerDetails = new CustomerDetailsDTO();
				customerDetails.setCustomerId(rs.getInt(1));
				customerDetails.setFirstName(rs.getString(2));
				customerDetails.setLastName(rs.getString(3));
				customerDetails.setMobile(rs.getLong(6));
				customerDetails.setEmail(rs.getString(7));
				customerDetails.setAddress(rs.getString(8));
				return customerDetails;
			}
		};

		List<CustomerDetailsDTO> list = jdbcTemplate.query(SqlConstant.FIND_ALL_CUSTOMER_RECORD, rowMapper);
		return list;
	}

	/**
	 * This method is responsible for updating user by customerId in database
	 * 
	 * @param customerDetails
	 * @return Integer
	 */
	public Integer update(CustomerDetails customerDetails, Long userId) {

		return jdbcTemplate.update(SqlConstant.UPDATE_CUSTOMER_BY_ID, customerDetails.getFirstName(),
				customerDetails.getLastName(), customerDetails.getEmail(), customerDetails.getMobile(),
				customerDetails.getAddress(), customerDetails.getCustomerId());

	}

	/**
	 * This method is responsible for delete customer from database by customerId
	 * 
	 * @param customerId
	 * @return Void
	 */
	public void deleteById(Long customerId) {

		jdbcTemplate.update(SqlConstant.DELETE_CUSTOMER_BY_ID, customerId);
	}

}
