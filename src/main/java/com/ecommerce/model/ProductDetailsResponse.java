package com.ecommerce.model;

import java.util.List;

public class ProductDetailsResponse {

	private List<ProductDetailsRes> productDetailsRes;

	public List<ProductDetailsRes> getProductDetailsRes() {
		return productDetailsRes;
	}

	public void setProductDetailsRes(List<ProductDetailsRes> productDetailsRes) {
		this.productDetailsRes = productDetailsRes;
	}

	@Override
	public String toString() {
		return "ProductDetailsResponse [productDetailsRes=" + productDetailsRes + "]";
	}

}
