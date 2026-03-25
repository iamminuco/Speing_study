package com.example.demo.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
public class ProductController {
    @Autowired
    private ProductService productService;

    ProductController(){
        System.out.println("진짜 스프링이 알아서 객체를 생성 하나?");
    }

    @RequestMapping(value = "/product", method = RequestMethod.GET)
    public String getProduct() {
        return productService.getProduct();
    }


    @RequestMapping(value = "/product", method = RequestMethod.POST)
    public void saveProduct(@RequestParam(value="name") String productName) {
        productService.saveProduct(productName);
    }
}
