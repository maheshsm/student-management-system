package com.ecommerce.constant;

public class SqlConstant {

	public static final String REGISTER_CUSTOMER = "INSERT INTO customer_details"
			+ "(firstName, lastName, username, password, mobile, email,address) " 
			+ "VALUES(?,?,?,?,?,?,?)";

	public static final String FIND_CUSTOMER_BY_ID = "SELECT * FROM customer_details "
			+ "WHERE customerId = ?";

	public static final String FIND_ALL_CUSTOMER_RECORD = "SELECT * FROM customer_details";

	public static final String UPDATE_CUSTOMER_BY_ID = "UPDATE customer_details SET "
			+ "firstName = ?, lastName = ?, email = ?, mobile = ?, address = ? " 
			+ "WHERE customerId = ?";

	public static final String DELETE_CUSTOMER_BY_ID = "DELETE FROM customer_details "
			+ "WHERE customerId = ?";
	
	public static final String ADD_NEW_PRODUCT = "INSERT INTO dmart.product_details "
			+ "(product_id, category_id, discount_id, name, price_per_quantity,"
			+ "price_per_kg, price_per_ltr, total_quantity, total_kg, total_ltr,"
			+ "total_price, is_warrenty, warrenty_date, is_guarrenty, guarrenty_date,"
			+ "s_gst, c_gst)"
			+ "VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

}
