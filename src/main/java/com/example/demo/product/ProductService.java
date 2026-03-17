package com.example.demo.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

// 방법 2. @Component 해줌으로써 객체생성을 하지 않아도 됨.
/*
Spring이 애플리케이션 시작할 때
1. 해당 클래스를 스캔하고
2. 객체를 자동 생성해서
3. 컨테이너에 보관한다
4. 이걸 Bean 등록이라고 한다.
 */
@Component
public class ProductService {
    private ProductRepository productRepository;

    @Autowired
    ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;

    }

    public String getProduct() {
        return productRepository.getProduct();
    }

    public void saveProduct() {
        productRepository.saveProduct();
    }
}
