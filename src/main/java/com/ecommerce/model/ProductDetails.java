package com.ecommerce.model;

import java.sql.Date;

public class ProductDetails {

	private Integer productId;
	private String name;
	private Integer categoryId;
	private double stockInKgs;
	private double stockInLtrs;
	private Integer stockInCount;
	private String description;
	private String companyName;
	private Date expiryDate;
	private Date warrantyDate;
	private Date guaranteeDate;
	private double price;

	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Integer categoryId) {
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

	public Integer getStockInCount() {
		return stockInCount;
	}

	public void setStockInCount(Integer stockInCount) {
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
