package com.ecommerce.dto;

public class BillingDetailsDTO {

	private int billingId;
	private int customerId;
	private double billingAmount;
	private int paymentId;
	private String billingDate;
	public int getBillingId() {
		return billingId;
	}
	public void setBillingId(int billingId) {
		this.billingId = billingId;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public double getBillingAmount() {
		return billingAmount;
	}
	public void setBillingAmount(double billingAmount) {
		this.billingAmount = billingAmount;
	}
	public int getPaymentId() {
		return paymentId;
	}
	public void setPaymentId(int paymentId) {
		this.paymentId = paymentId;
	}
	public String getBillingDate() {
		return billingDate;
	}
	public void setBillingDate(String billingDate) {
		this.billingDate = billingDate;
	}
	
	public BillingDetailsDTO() {
		super();
	}
	public BillingDetailsDTO(int billingId, int customerId, double billingAmount, int paymentId, String billingDate) {
		super();
		this.billingId = billingId;
		this.customerId = customerId;
		this.billingAmount = billingAmount;
		this.paymentId = paymentId;
		this.billingDate = billingDate;
	}
	
	
	
}
