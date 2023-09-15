package com.ecommerce.model;

import java.sql.Date;

public class BillDetails {
	private int billId;
	private int customerId;
	private Date billDate;
	private int totalAmount;

	public BillDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BillDetails(int billId, int customerId, Date billDate, int totalAmount) {
		super();
		this.billId = billId;
		this.customerId = customerId;
		this.billDate = billDate;
		this.totalAmount = totalAmount;
	}

	public int getBillId() {
		return billId;
	}

	public void setBillId(int billId) {
		this.billId = billId;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public Date getBillDate() {
		return billDate;
	}

	public void setBillDate(Date billDate) {
		this.billDate = billDate;
	}

	public int getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(int totalAmount) {
		this.totalAmount = totalAmount;
	}

}
