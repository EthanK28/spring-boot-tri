package com.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.app.AddCaculator;
import com.example.app.Calculator;

@Configuration
public class AppConfig {
	
	@Bean
	Calculator caculator() {
		return new AddCaculator();
	}
}
