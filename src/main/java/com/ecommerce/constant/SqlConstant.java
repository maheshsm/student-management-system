package com.ecommerce.constant;

import org.springframework.jdbc.core.PreparedStatementCreator;

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
	
	public static final String GET_ALL_PRODUCT_DETAILS = "SELECT pd.product_id as productid, pd.name as name, pd.price_per_kg as pricePerKg, pd.price_per_ltr as pricePerLtr, "
			+ "pd.price_per_quantity as pricePerQuantity, pd.c_gst as cgst, pd.s_gst as sgst, pd.is_guarrenty as isGuarantee, pd.guarrenty_date as guaranteeDate, "
			+ "pd.is_warrenty as isWarranty, pd.warrenty_date as warrantyDate, pd.total_kg as totalKg, pd.total_ltr as totalLtr, pd.total_price as totalPrice, "
			+ "pd.total_quantity as totalQuantity, pc.category_name as categoryName, dd.discount_name as discountName, dd.discount_type as discountType,"
			+ "dd.discount_value as discountValue FROM dmart.product_details pd "
			+ "left join dmart.discount_details dd "
			+ "on pd.discount_id = dd.discount_id "
			+ "left join dmart.product_category pc "
			+ "on pc.category_id = pd.category_id ";
	
	public static final String ADD_NEW_PRODUCTCATEGORY = "INSERT INTO dmart.product_category "
			+"(category_id,category_name) VALUES (?,?)";
	
	public static final String GET_ALL_PRODUCT_CATEGORIES ="select * from dmart.product_category";
	
	public static final String FIND_PRODUCT_CATEGORY_BY_ID = "select * from dmart.product_category WHERE category_id=?";

	public static final String DELETE_PRODUCT_CATEGORY_BY_ID = "DELETE FROM dmart.product_category "
			+"WHERE category_id= ?";

	public static final String UPDATE_PRODUCT_CATEGORY_BY_ID = "UPDATE dmart.product_category SET "
			+"category_name =? WHERE category_id= ?";
}
