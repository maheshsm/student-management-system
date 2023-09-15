package com.ecommerce.model;

import java.sql.Date;

public class ProductDetails {

    private int productId;
    private String name;
    private int categoryId;
    private double stockInKgs; // Changed data type to double
    private double stockInLtrs; // Changed data type to double
    private int stockInCount;
    private String description;
    private String companyName;
    private Date expiryDate;
    private Date warrantyDate;
    private Date guaranteeDate; // Corrected variable name
    private double price; // Changed data type to double (or use BigDecimal if needed)
}
