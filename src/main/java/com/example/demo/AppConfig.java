package com.example.demo;

import java.time.LocalTime;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

public class AppConfig {
	
	@Bean(name = "localtime")
	public LocalTime showTimeUK() {
		return LocalTime.now();
	}
	
	@Bean(name = "time in USA")
	public LocalTime showTimeUSA() {
		return LocalTime.now();
	}

}
