package com.practice.corepractice.common;

//import javax.annotation.PostConstruct;
//import javax.annotation.PreDestroy;

//import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class CricketCoach implements Coach {
	
	public CricketCoach() {
		System.out.println("In: " + getClass().getSimpleName());
	}
	
//	//our init method
//	@PostConstruct
//	public void startApp() {
//		System.out.println("In startApp(): " + getClass().getSimpleName());
//	}
//	
//	//our destroy method
//	@PreDestroy
//	public void endApp() {
//		System.out.println("In endApp(): " + getClass().getSimpleName());
//	}
	
	
	
	@Override
	public String getDailyWorkout() {
		return "Practice daily ";
	}

}
