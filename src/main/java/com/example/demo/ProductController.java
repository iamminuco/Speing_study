package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
    @Autowired
    private ProductService productService;

    ProductController(){
        System.out.println("진짜 스프링이 알아서 객체를 생성 하나?");
    }

    @RequestMapping(value = " ", method = RequestMethod.GET)
    public String getProduct() {
        return productService.getProduct();
    }
}
