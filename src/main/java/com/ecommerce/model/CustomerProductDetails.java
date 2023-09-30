package com.ecommerce.model;
public class CustomerProductDetails {
    private Integer id;
    private Integer uid;
    private Integer productId;
    private Double qtyKg;
    private Double qtyLtr;
    private Integer qty;
    private Double totalAmount;
    private Double discountedAmount;
    private String billingDate;

    // Getter and Setter methods
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Double getQtyKg() {
        return qtyKg;
    }

    public void setQtyKg(Double qtyKg) {
        this.qtyKg = qtyKg;
    }

    public Double getQtyLtr() {
        return qtyLtr;
    }

    public void setQtyLtr(Double qtyLtr) {
        this.qtyLtr = qtyLtr;
    }

    public Integer getQty() {
        return qty;
    }

    public void setQty(Integer qty) {
        this.qty = qty;
    }

    public Double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Double getDiscountedAmount() {
        return discountedAmount;
    }

    public void setDiscountedAmount(Double discountedAmount) {
        this.discountedAmount = discountedAmount;
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
        return "CustomerProductDetails [id=" + id + ", uid=" + uid + ", productId=" + productId + ", qtyKg=" + qtyKg + ", qtyLtr=" + qtyLtr + ", qty=" + qty + ", totalAmount=" + totalAmount + ", discountedAmount=" + discountedAmount + ", billingDate=" + billingDate + "]";
    }
}
