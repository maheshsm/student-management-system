package com.ecommerce.constant;

public class SqlConstant {

	public static final String REGISTER_CUSTOMER = "insert into customer_details"
			+ "(firstName, lastName, username, password, mobile, email,address) " 
			+ "value(?,?,?,?,?,?,?)";

	public static final String FIND_CUSTOMER_BY_ID = "SELECT * FROM customer_details "
			+ "WHERE customerId = ?";

	public static final String FIND_ALL_CUSTOMER_RECORD = "SELECT * FROM customer_details";

	public static final String UPDATE_CUSTOMER_BY_ID = "UPDATE customer_details SET "
			+ "firstName = ?, lastName = ?, email = ?, mobile = ?, address = ? " 
			+ "WHERE customerId = ?";

	public static final String DELETE_CUSTOMER_BY_ID = "DELETE FROM customer_details "
			+ "WHERE customerId = ?";

}
