package com.ecommerce.repository;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.ecommerce.model.CustomerDetails;

@Repository
public class CustomerDetailsRepository {

	@Autowired
	JdbcTemplate jdbcTemplate;

	// save
	public int save(CustomerDetails customerDetails) {
		String saveQuery = "insert into customer_details"
				+ "(firstName, lastName, username, password, mobile, email,address) " + "value(?,?,?,?,?,?,?)";
		return jdbcTemplate.update(saveQuery, customerDetails.getFirstName(), customerDetails.getLastName(),
				customerDetails.getUsername(), customerDetails.getPassword(), customerDetails.getMobile(),
				customerDetails.getEmail(), customerDetails.getAddress());

	}

	@SuppressWarnings("deprecation")
	public List<CustomerDetails> findById(int customerId) {
		String findByIdQuery = "select * from customer_details where customerId = ?";
		return jdbcTemplate.query(findByIdQuery, new Object[] { customerId },
				(rs, rowNum) -> new CustomerDetails(rs.getInt("customerId"), rs.getString("firstName"),
						rs.getString("lastName"), rs.getString("username"), rs.getString("password"),
						rs.getLong("mobile"), rs.getString("email"), rs.getString("address"), rs.getInt("billId")));

	}

	// findAll
	public List<CustomerDetails> findAll() {
		String findListQuery = "select * from customer_details";
		return jdbcTemplate.query(findListQuery,
				(rs, rowNum) -> new CustomerDetails(rs.getInt("customerId"), rs.getString("firstName"),
						rs.getString("lastName"), rs.getString("username"), rs.getString("password"),
						rs.getLong("mobile"), rs.getString("email"), rs.getString("address"), rs.getInt("billId")));

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
	public int deleteById(int customerId) throws SQLException {
		String deleteQuery = "delete customer_details where customerId = ? ";
		return jdbcTemplate.update(deleteQuery, customerId);
	}

}
