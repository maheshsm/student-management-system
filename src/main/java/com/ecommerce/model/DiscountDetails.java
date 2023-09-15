package com.ecommerce.model;

import java.sql.Date;

public class DiscountDetails {

	private int discountId;
	private String name;
	private double discountPercentage;
	private int productId;
	private Date discountStartDate;
	private Date discountEndDate;

	public DiscountDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DiscountDetails(int discountId, String name, double discountPercentage, int productId,
			Date discountStartDate, Date discountEndDate) {
		super();
		this.discountId = discountId;
		this.name = name;
		this.discountPercentage = discountPercentage;
		this.productId = productId;
		this.discountStartDate = discountStartDate;
		this.discountEndDate = discountEndDate;
	}

	public int getDiscountId() {
		return discountId;
	}

	public void setDiscountId(int discountId) {
		this.discountId = discountId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getDiscountPercentage() {
		return discountPercentage;
	}

	public void setDiscountPercentage(double discountPercentage) {
		this.discountPercentage = discountPercentage;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public Date getDiscountStartDate() {
		return discountStartDate;
	}

	public void setDiscountStartDate(Date discountStartDate) {
		this.discountStartDate = discountStartDate;
	}

	public Date getDiscountEndDate() {
		return discountEndDate;
	}

	public void setDiscountEndDate(Date discountEndDate) {
		this.discountEndDate = discountEndDate;
	}

	// Constructors, getters, setters, and other methods as needed
}
