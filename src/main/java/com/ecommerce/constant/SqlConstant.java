package com.ecommerce.constant;

public class SqlConstant {

	public static final String REGISTER_CUSTOMER = "insert into customer_details"
			+ "(firstName, lastName, username, password, mobile, email,address) " 
			+ "value(?,?,?,?,?,?,?)";

}
