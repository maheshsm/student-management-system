package com.ecommerce.model;

public class CustomerProductDetails {

	private int custProdId;
	private int customerId;
	private int productId;
	private int discountId;
	private int purchaseInKgs;
	private int purchaseInLtrs;
	private int purchaseInCount;
	private int discountedAmount;
	private int productOriginalAmount;
	private int stateGstPercentage;
	private int centerGstPercentage;
	private int productFinalAmount;

	public CustomerProductDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CustomerProductDetails(int custProdId, int customerId, int productId, int discountId, int purchaseInKgs,
			int purchaseInLtrs, int purchaseInCount, int discountedAmount, int productOriginalAmount,
			int stateGstPercentage, int centerGstPercentage, int productFinalAmount) {
		super();
		this.custProdId = custProdId;
		this.customerId = customerId;
		this.productId = productId;
		this.discountId = discountId;
		this.purchaseInKgs = purchaseInKgs;
		this.purchaseInLtrs = purchaseInLtrs;
		this.purchaseInCount = purchaseInCount;
		this.discountedAmount = discountedAmount;
		this.productOriginalAmount = productOriginalAmount;
		this.stateGstPercentage = stateGstPercentage;
		this.centerGstPercentage = centerGstPercentage;
		this.productFinalAmount = productFinalAmount;
	}

	public int getCustProdId() {
		return custProdId;
	}

	public void setCustProdId(int custProdId) {
		this.custProdId = custProdId;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public int getDiscountId() {
		return discountId;
	}

	public void setDiscountId(int discountId) {
		this.discountId = discountId;
	}

	public int getPurchaseInKgs() {
		return purchaseInKgs;
	}

	public void setPurchaseInKgs(int purchaseInKgs) {
		this.purchaseInKgs = purchaseInKgs;
	}

	public int getPurchaseInLtrs() {
		return purchaseInLtrs;
	}

	public void setPurchaseInLtrs(int purchaseInLtrs) {
		this.purchaseInLtrs = purchaseInLtrs;
	}

	public int getPurchaseInCount() {
		return purchaseInCount;
	}

	public void setPurchaseInCount(int purchaseInCount) {
		this.purchaseInCount = purchaseInCount;
	}

	public int getDiscountedAmount() {
		return discountedAmount;
	}

	public void setDiscountedAmount(int discountedAmount) {
		this.discountedAmount = discountedAmount;
	}

	public int getProductOriginalAmount() {
		return productOriginalAmount;
	}

	public void setProductOriginalAmount(int productOriginalAmount) {
		this.productOriginalAmount = productOriginalAmount;
	}

	public int getStateGstPercentage() {
		return stateGstPercentage;
	}

	public void setStateGstPercentage(int stateGstPercentage) {
		this.stateGstPercentage = stateGstPercentage;
	}

	public int getCenterGstPercentage() {
		return centerGstPercentage;
	}

	public void setCenterGstPercentage(int centerGstPercentage) {
		this.centerGstPercentage = centerGstPercentage;
	}

	public int getProductFinalAmount() {
		return productFinalAmount;
	}

	public void setProductFinalAmount(int productFinalAmount) {
		this.productFinalAmount = productFinalAmount;
	}

	// Constructors, getters, setters, and other methods as needed
}
