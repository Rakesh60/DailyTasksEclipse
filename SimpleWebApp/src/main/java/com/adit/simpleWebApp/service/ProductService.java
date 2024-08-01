package com.adit.simpleWebApp.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.adit.simpleWebApp.model.Product;

@Service
public class ProductService {

    List<Product> products = new ArrayList<>(Arrays.asList(
            new Product(101, "Iphone", 2222),
            new Product(102, "Oppo", 3000),
            new Product(103, "Samsung", 1200)));

    public List<Product> getProducts() {

        return products;

    }

    public void addProducts(Product prod) {
        products.add(prod);
    }

    // public Product getProductsByID(int id) {
    // for (Product product : products) {
    // if (product.getProdId() == id) {

    // return product;
    // }
    // }
    // return null; // Return null if no product is found with the given ID
    // }

    public Product getProductsByID(int id) {
        return products.stream().filter(p -> p.getProdId() == id).findFirst().orElse(new Product(0, null, 0));
    }

}
