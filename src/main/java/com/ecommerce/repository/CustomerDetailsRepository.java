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

	// save
	public int save(CustomerDetails customerDetails) {
		String saveQuery = "insert into customer_details"
				+ "(firstName, lastName, username, password, mobile, email,address) " + "value(?,?,?,?,?,?,?)";
		return jdbcTemplate.update(saveQuery, customerDetails.getFirstName(), customerDetails.getLastName(),
				customerDetails.getUsername(), customerDetails.getPassword(), customerDetails.getMobile(),
				customerDetails.getEmail(), customerDetails.getAddress());

	}

	// findById query
	public customerDetailsDTO findById(int customerId) {
		String findByIdQuery = "select * from customer_details where customerId = ?";

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
		customerDetailsDTO customerDetails = jdbcTemplate.queryForObject(findByIdQuery, rowMapper, customerId);
		return customerDetails;
	}

	// findAll
	public List<customerDetailsDTO> findAll() {
		String findListQuery = "select * from customer_details";
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

		List<customerDetailsDTO> list = jdbcTemplate.query(findListQuery, rowMapper);
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
