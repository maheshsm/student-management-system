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
	 * 
	 * @param customer
	 * @return
	 */
	public Integer registerNewCustomer(CustomerDetails customer) {
		
		return jdbcTemplate.update(SqlConstant.REGISTER_CUSTOMER, customer.getFirstName(), customer.getLastName(),
				customer.getUsername(), customer.getPassword(), customer.getMobile(),
				customer.getEmail(), customer.getAddress());

	}

	// findById query
	public CustomerDetailsDTO findById(int customerId) {
		String findByIdQuery = "select * from customer_details where customerId = ?";

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
		CustomerDetailsDTO customerDetails = jdbcTemplate.queryForObject(findByIdQuery, rowMapper, customerId);
		return customerDetails;
	}

	// findAll
	public List<CustomerDetailsDTO> findAll() {
		String findListQuery = "select * from customer_details";
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

		List<CustomerDetailsDTO> list = jdbcTemplate.query(findListQuery, rowMapper);
		return list;
	}

	// update
	public int update(CustomerDetails customerDetails) {
		String updateQuery = "update customer_details set firstName = ? , lastName = ? , "
				+ "email = ?, mobile = ?, address = ?  where customerId = ?";
		return jdbcTemplate.update(updateQuery, customerDetails.getFirstName(), customerDetails.getLastName(),
				customerDetails.getEmail(), customerDetails.getMobile(), customerDetails.getAddress(),
				customerDetails.getCustomerId());

	}

	// deleteById
	public void deleteById(int customerId){
		String deleteQuery = "delete from customer_details where customerId = ? ";
        jdbcTemplate.update(deleteQuery, customerId);
	}

}
