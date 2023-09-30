package com.ecommerce.model;


public class DiscountDetails {
    private Integer discountId;
    private String discountName;
    private String discountType;
    private Integer discountValue;

    // Getter and Setter methods
    public Integer getDiscountId() {
        return discountId;
    }

    public void setDiscountId(Integer discountId) {
        this.discountId = discountId;
    }

    public String getDiscountName() {
        return discountName;
    }

    public void setDiscountName(String discountName) {
        this.discountName = discountName;
    }

    public String getDiscountType() {
        return discountType;
    }

    public void setDiscountType(String discountType) {
        this.discountType = discountType;
    }

    public Integer getDiscountValue() {
        return discountValue;
    }

    public void setDiscountValue(Integer discountValue) {
        this.discountValue = discountValue;
    }

    // toString method for debugging
    @Override
    public String toString() {
        return "DiscountDetails [discountId=" + discountId + ", discountName=" + discountName + ", discountType=" + discountType + ", discountValue=" + discountValue + "]";
    }
}
