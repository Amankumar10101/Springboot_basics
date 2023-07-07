package com.practice.corepractice.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.practice.corepractice.common.Coach;
import com.practice.corepractice.common.SwimCoach;

@Configuration
public class SportConfig {
	
	@Bean("aqua")
	public Coach swimCoach() {
		return new SwimCoach();
	}

}
