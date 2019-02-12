package com.test.EmpRESTBootApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan(basePackages="com.test.EmpRESTBootApp.controllers")
public class EmpRestBootAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmpRestBootAppApplication.class, args);
	}

}

