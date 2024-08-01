package com.adit.simpleWebApp.service;


import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.adit.simpleWebApp.model.Product;

@Service
public class ProductService {

    List<Product> products=Arrays.asList(
        new Product(101,"Iphone",2222),
        new Product(101,"Oppo",3000),
        new Product(2, "Samsung", 1200)
       );

    public List<Product> getProducts(){
        
        
        return products;

    }

}
