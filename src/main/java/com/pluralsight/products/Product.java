package com.pluralsight.products;

import java.math.BigDecimal;

public abstract class Product {

    private String productName;

    public Product(String productName) {
        this.productName = productName;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public abstract BigDecimal getProductPrice();

    @Override
    public String toString() {
        return productName;
    }
}
