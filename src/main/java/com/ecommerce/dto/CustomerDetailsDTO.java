package com.ecommerce.dto;

public class CustomerDetailsDTO {
	
	private int customerId;
	private String firstName;
	private String lastName;
	private long mobile;
	private String email;
	private String address;
	private int billId;
	
	public CustomerDetailsDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CustomerDetailsDTO(int customerId, String firstName, String lastName, long mobile, String email,
			String address, int billId) {
		super();
		this.customerId = customerId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.mobile = mobile;
		this.email = email;
		this.address = address;
		this.billId = billId;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public long getMobile() {
		return mobile;
	}

	public void setMobile(long mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getBillId() {
		return billId;
	}

	public void setBillId(int billId) {
		this.billId = billId;
	}
	

}
