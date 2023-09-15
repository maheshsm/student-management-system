package com.ecommerce.model;

import java.sql.Date;

public class ProductDetails {

	private int productId;
	private String name;
	private int categoryId;
	private double stockInKgs;
	private double stockInLtrs;
	private int stockInCount;
	private String description;
	private String companyName;
	private Date expiryDate;
	private Date warrantyDate;
	private Date guaranteeDate;
	private double price;

	public ProductDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ProductDetails(int productId, String name, int categoryId, double stockInKgs, double stockInLtrs,
			int stockInCount, String description, String companyName, Date expiryDate, Date warrantyDate,
			Date guaranteeDate, double price) {
		super();
		this.productId = productId;
		this.name = name;
		this.categoryId = categoryId;
		this.stockInKgs = stockInKgs;
		this.stockInLtrs = stockInLtrs;
		this.stockInCount = stockInCount;
		this.description = description;
		this.companyName = companyName;
		this.expiryDate = expiryDate;
		this.warrantyDate = warrantyDate;
		this.guaranteeDate = guaranteeDate;
		this.price = price;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public double getStockInKgs() {
		return stockInKgs;
	}

	public void setStockInKgs(double stockInKgs) {
		this.stockInKgs = stockInKgs;
	}

	public double getStockInLtrs() {
		return stockInLtrs;
	}

	public void setStockInLtrs(double stockInLtrs) {
		this.stockInLtrs = stockInLtrs;
	}

	public int getStockInCount() {
		return stockInCount;
	}

	public void setStockInCount(int stockInCount) {
		this.stockInCount = stockInCount;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public Date getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}

	public Date getWarrantyDate() {
		return warrantyDate;
	}

	public void setWarrantyDate(Date warrantyDate) {
		this.warrantyDate = warrantyDate;
	}

	public Date getGuaranteeDate() {
		return guaranteeDate;
	}

	public void setGuaranteeDate(Date guaranteeDate) {
		this.guaranteeDate = guaranteeDate;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
