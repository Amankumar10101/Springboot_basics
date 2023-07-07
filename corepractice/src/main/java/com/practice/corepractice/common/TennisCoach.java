package com.practice.corepractice.common;

import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach{

	public TennisCoach() {
		System.out.println("In: " + getClass().getSimpleName());
	}
	
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "ha aha aja";
	}

}
