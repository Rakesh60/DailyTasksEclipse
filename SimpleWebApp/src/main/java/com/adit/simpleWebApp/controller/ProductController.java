package com.adit.simpleWebApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.adit.simpleWebApp.model.Product;
import com.adit.simpleWebApp.service.ProductService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class ProductController {

    @Autowired
    ProductService service;

    @RequestMapping("/allproducts")
    public List<Product> getProducts() {
        return service.getProducts();
    }

    @GetMapping("/product/{id}")
    public Product geProductById(@PathVariable int id) {

        return service.getProductsByID(id);
    }

    @PostMapping("/product")
    public String addProducts(@RequestBody Product prod) {

        System.out.println(prod);
        service.addProducts(prod);

        return "Product Inserted successfully";
    }

}
