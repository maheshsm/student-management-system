package com.ecommerce.service;


import java.util.List;

import com.ecommerce.model.BillingDetails;

/**
 * This is specification class for billing activities.
 */
public interface BillingDetailsService {

	public void inserBillingDetails(BillingDetails billingDetails);

	public BillingDetails getBillDetailsById(int billing_id);

	public List<BillingDetails> getAllBillingData();
	

}
