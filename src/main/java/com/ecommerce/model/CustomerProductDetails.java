package com.ecommerce.model;

public class CustomerProductDetails {

	private Integer custProdId;
	private Integer customerId;
	private Integer productId;
	private Integer discountId;
	private Integer purchaseInKgs;
	private Integer purchaseInLtrs;
	private Integer purchaseInCount;
	private Integer discountedAmount;
	private Integer productOriginalAmount;
	private Integer stateGstPercentage;
	private Integer centerGstPercentage;
	private Double productFinalAmount;

	public Integer getCustProdId() {
		return custProdId;
	}

	public void setCustProdId(Integer custProdId) {
		this.custProdId = custProdId;
	}

	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public Integer getDiscountId() {
		return discountId;
	}

	public void setDiscountId(Integer discountId) {
		this.discountId = discountId;
	}

	public Integer getPurchaseInKgs() {
		return purchaseInKgs;
	}

	public void setPurchaseInKgs(Integer purchaseInKgs) {
		this.purchaseInKgs = purchaseInKgs;
	}

	public Integer getPurchaseInLtrs() {
		return purchaseInLtrs;
	}

	public void setPurchaseInLtrs(Integer purchaseInLtrs) {
		this.purchaseInLtrs = purchaseInLtrs;
	}

	public Integer getPurchaseInCount() {
		return purchaseInCount;
	}

	public void setPurchaseInCount(Integer purchaseInCount) {
		this.purchaseInCount = purchaseInCount;
	}

	public Integer getDiscountedAmount() {
		return discountedAmount;
	}

	public void setDiscountedAmount(Integer discountedAmount) {
		this.discountedAmount = discountedAmount;
	}

	public Integer getProductOriginalAmount() {
		return productOriginalAmount;
	}

	public void setProductOriginalAmount(Integer productOriginalAmount) {
		this.productOriginalAmount = productOriginalAmount;
	}

	public Integer getStateGstPercentage() {
		return stateGstPercentage;
	}

	public void setStateGstPercentage(Integer stateGstPercentage) {
		this.stateGstPercentage = stateGstPercentage;
	}

	public Integer getCenterGstPercentage() {
		return centerGstPercentage;
	}

	public void setCenterGstPercentage(Integer centerGstPercentage) {
		this.centerGstPercentage = centerGstPercentage;
	}

	public double getProductFinalAmount() {
		return productFinalAmount;
	}

	public void setProductFinalAmount(double productFinalAmount) {
		this.productFinalAmount = productFinalAmount;
	}

}
