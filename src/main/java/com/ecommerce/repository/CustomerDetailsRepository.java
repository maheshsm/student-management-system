package com.ecommerce.repository;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.ecommerce.model.CustomerDetails;

@Repository
public class CustomerDetailsRepository{
   
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	// save
	public int save(CustomerDetails customerDetails) {
		
		int insertedRow = jdbcTemplate.update("insert into customer_details"
				+ "(firstName, lastName, username, password, mobile, email,address) "
				+ "value(?,?,?,?,?,?,?)", 
				customerDetails.getFirstName(),
				customerDetails.getLastName(),
				customerDetails.getUsername(),
				customerDetails.getPassword(),
				customerDetails.getMobile(),
				customerDetails.getEmail(),
				customerDetails.getAddress());
		
		return insertedRow;
	}
	
	@SuppressWarnings("deprecation")
	public List<CustomerDetails> findById(int customerId) {
		
		
		     return jdbcTemplate.query(
				"select * from customer_details where customerId = ?",
				new Object[] { customerId },
				(rs ,rowNum) -> 
						
						new CustomerDetails(
						
								rs.getInt("customerId"),
								rs.getString("firstName"),
								rs.getString("lastName"),
								rs.getString("username"),
								rs.getString("password"),
								rs.getLong("mobile"),
								rs.getString("email"),
								rs.getString("address"),
								rs.getInt("billId")
								
						)
				
				);
		    
		    

	}
	
	
	// findAll
	 public List<CustomerDetails> findAll(){
		
		return  jdbcTemplate.query(
				"select * from customer_details", 
				(rs , rowNum) -> 
						
						new CustomerDetails(
						
								rs.getInt("customerId"),
								rs.getString("firstName"),
								rs.getString("lastName"),
								rs.getString("username"),
								rs.getString("password"),
								rs.getLong("mobile"),
								rs.getString("email"),
								rs.getString("address"),
								rs.getInt("billId")
								
						)
				
				);
		 
		

	 }
	 
	 //update
	 public int update(CustomerDetails customerDetails) {
		   return jdbcTemplate.update(
	                "update customer_details set firstName = ? , lastName = ? , "
	                + " email = ?, mobile = ?, address = ?  where customerId = ?",
	              
	                customerDetails.getFirstName(),
	                customerDetails.getLastName(),
	                customerDetails.getEmail(),
	                customerDetails.getMobile(),
	                customerDetails.getAddress(),
	                customerDetails.getCustomerId()
	                ); 
		
	 }
	 
	 
	 
	 // deleteById
	  public int deleteById(int customerId) {
		  return jdbcTemplate.update("delete customer_details where customerId = ? ", customerId );
	  }
	 
	
}
