package com.pluralsight.orders;

import com.pluralsight.products.Product;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Order {
    private List<Product> products;

    public Order() {

        products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);

    }

    public BigDecimal getTotal() {
        return
        products.stream()
                .map(product -> product.getProductPrice())
                .reduce(BigDecimal.ZERO,(total, price) -> total.add(price));

    }

    public boolean isEmpty(){

        return products.isEmpty();
    }

    @Override
    public String toString() {
        return products.stream()
                .map(product -> product.toString())
                .collect(Collectors.joining("\n"));
    }
}
