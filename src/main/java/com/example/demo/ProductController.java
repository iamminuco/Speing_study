package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@Controller
//@ResponseBody
@RestController
public class ProductController {
//    private ProductService productService = new ProductService();
    @Autowired // 의존성 주입
    private ProductService productService;

    ProductController(){
        System.out.println("진짜 스프링이 알아서 객체 생성을?");
    }

    @RequestMapping(value = " ", method = RequestMethod.GET)
    public String getProduct() {

//        1. return "NoteBook";
        // 2. 직접 문자열을 반환하는게 아니라 서비스객체를 생성하여
        // 호출한 다음 서비스의 메서드를 통해 호출 한다.
        // 하지만 이렇게 객체를 생성하면 getProduct()을
        // 호출할때마다 새로운 ProductService 객체를 생성하게된다.
        // 방법 1. 최 상단에서 객체 생성
//        ProductService productService = new ProductService();
        return productService.getProduct();
    }
}
