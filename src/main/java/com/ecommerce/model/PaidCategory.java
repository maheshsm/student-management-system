package com.ecommerce.model;

public class PaidCategory {
	private int paidCategoryId;
	private String name;

	public PaidCategory() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PaidCategory(int paidCategoryId, String name) {
		super();
		this.paidCategoryId = paidCategoryId;
		this.name = name;
	}

	public int getPaidCategoryId() {
		return paidCategoryId;
	}

	public void setPaidCategoryId(int paidCategoryId) {
		this.paidCategoryId = paidCategoryId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
