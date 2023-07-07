package com.practice.corepractice.common;

import org.springframework.stereotype.Component;

@Component
public class BaseballCoach implements Coach {

	public BaseballCoach() {
		System.out.println("In: " + getClass().getSimpleName());
	}
	
	
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "bla bla bla bla";
	}
	
}
