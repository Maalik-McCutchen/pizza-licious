package com.pluralsight.products;

import java.math.BigDecimal;

public class GarlicKnots extends Product {

    public GarlicKnots(String productName) {
        super(productName);
    }

    @Override
    public BigDecimal getProductPrice() {

        return new BigDecimal("1.50");

    }

    @Override
    public String toString() {
        return getProductName() + " - $" + getProductPrice();
    }
}
