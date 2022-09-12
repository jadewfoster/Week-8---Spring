package com.example.demo.appconfig;

import java.time.LocalTime;

import org.springframework.context.annotation.Bean;

public class AppConfig {
	
	@Bean(name = "showTime")
	public LocalTime showTime() {
		LocalTime time = LocalTime.now();
		return time;
	}
	
//	@Bean(name = "noon")
//	public LocalTime showNoon() {
//		return LocalTime.NOON;
//	}

}
