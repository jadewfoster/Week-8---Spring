package com.example.demo;

import java.time.LocalTime;

import org.springframework.context.ApplicationContext;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	
	   Object byName = context.getBean("getTime");
	   LocalTime byType = context.getBean(LocalTime.class);
	   LocalTime byBoth = context.getBean("showTimeUK", LocalTime.class);

	   System.out.println(byName);
	   System.out.println(byType);
	   System.out.println(byBoth);
	   
	}

}
