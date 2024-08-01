package com.adit.simpleWebApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.adit.simpleWebApp.model.Product;
import com.adit.simpleWebApp.service.ProductService;

@RestController
public class ProductController {
    
    @Autowired
    ProductService service;

    @RequestMapping("/allproducts")
    public List<Product> getProducts(){
        return service.getProducts();
    }

}
