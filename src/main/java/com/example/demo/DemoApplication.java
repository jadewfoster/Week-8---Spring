package com.example.demo;

import java.time.LocalTime;
import com.example.demo.appconfig.*;

import org.springframework.context.ApplicationContext;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(DemoApplication.class, args);
	
	   Object byName = context.getBean("showTime");
	   LocalTime byType = context.getBean(LocalTime.class);
	   LocalTime byBoth = context.getBean("showTime", LocalTime.class);

	   System.out.println(byName);
	   System.out.println(byType);
	   System.out.println(byBoth);
	   
	}

}
