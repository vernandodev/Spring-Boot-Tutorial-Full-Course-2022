package com.springboot.springbootdemo;

import com.springboot.springbootdemo.sub1.SpringComponent1;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringbootDemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = SpringApplication.run(SpringbootDemoApplication.class, args);
		SpringComponent1 springComponent1 = applicationContext.getBean(SpringComponent1.class);
		System.out.println(springComponent1.getMessage());
	}

}
