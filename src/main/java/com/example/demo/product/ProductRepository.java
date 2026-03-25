package com.example.demo.product;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class ProductRepository {
    private Map<Integer, String> db = new HashMap<>();
    private int id = 1;

    public String getProduct(){
        return db.get(1);
    }

    public void saveProduct(String productName) {
        db.put(id++, productName);
    }
}