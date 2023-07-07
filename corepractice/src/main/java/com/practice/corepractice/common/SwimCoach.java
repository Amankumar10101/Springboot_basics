package com.practice.corepractice.common;

public class SwimCoach implements Coach {

	public SwimCoach() {
		System.out.println("In constructor: " + getClass().getSimpleName());
	}
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "just swim.. ";
	}

}
