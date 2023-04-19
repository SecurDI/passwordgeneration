package com.second.accountclaim.secondtest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.second.accountclaim.secondtest.control")
public class SecondtestApplication {

	public static void main(String[] args) {
		SpringApplication.run(SecondtestApplication.class, args);
	}

}
