package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

		Parent parent = new Child();
		parent.method();
	}

}

class Parent {
	public void  method() {
		System.out.println("parent");
	}
}

class Child extends Parent {
	@Override
	public void method() {
		System.out.println("child");
	}
}