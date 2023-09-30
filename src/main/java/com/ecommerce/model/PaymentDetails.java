package com.ecommerce.model;

public class PaymentDetails {
    private Integer paymentId;
    private String paymentMode;
    private String description;

    // Getter and Setter methods
    public Integer getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(Integer paymentId) {
        this.paymentId = paymentId;
    }

    public String getPaymentMode() {
        return paymentMode;
    }

    public void setPaymentMode(String paymentMode) {
        this.paymentMode = paymentMode;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    // toString method for debugging
    @Override
    public String toString() {
        return "PaymentDetails [paymentId=" + paymentId + ", paymentMode=" + paymentMode + ", description=" + description + "]";
    }
}
