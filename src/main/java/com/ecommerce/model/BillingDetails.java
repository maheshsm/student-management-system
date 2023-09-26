package com.ecommerce.model;

public class BillingDetails {
    private Integer billingId;
    private Integer customerId;
    private Double billingAmount;
    private Integer paymentId;
    private String billingDate;

    // Getter and Setter methods
    public Integer getBillingId() {
        return billingId;
    }

    public void setBillingId(Integer billingId) {
        this.billingId = billingId;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public Double getBillingAmount() {
        return billingAmount;
    }

    public void setBillingAmount(Double billingAmount) {
        this.billingAmount = billingAmount;
    }

    public Integer getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(Integer paymentId) {
        this.paymentId = paymentId;
    }

    public String getBillingDate() {
        return billingDate;
    }

    public void setBillingDate(String billingDate) {
        this.billingDate = billingDate;
    }

    // toString method for debugging
    @Override
    public String toString() {
        return "BillingDetails [billingId=" + billingId + ", customerId=" + customerId + ", billingAmount=" + billingAmount
                + ", paymentId=" + paymentId + ", billingDate=" + billingDate + "]";
    }
}
