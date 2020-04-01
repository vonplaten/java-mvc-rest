package com.casimirvonplaten.mvcrest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class DemoApplication {
	

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		
		// ApplicationContext context = new ClassPathXmlApplicationContext();
		// Vehicle obj = getBean("vehicle");
		// car.drive();
	}

}
