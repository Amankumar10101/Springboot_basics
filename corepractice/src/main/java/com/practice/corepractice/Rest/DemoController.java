package com.practice.corepractice.Rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.practice.corepractice.common.Coach;

@RestController
public class DemoController {
	
	//define a field for the dependency
	private Coach myCoach;
	
//	private Coach yourCoach;
	
	// define a constructor for dependency injection for important dependencies
	@Autowired
	public DemoController(
			@Qualifier("aqua")Coach theCoach
//			@Qualifier("tennisCoach")Coach jesicaCoach
			) {

			System.out.println("In: " + getClass().getSimpleName());

		myCoach = theCoach;
//		yourCoach = jesicaCoach;
		
		
	}
	
	// define a setter injection for optional dependencies
//	public void setCoach(Coach theCoach) {
//    	myCoach = theCoach;
//		
//	}
//		
		
	@GetMapping("/dailyworkout")
	public String getDailyWorkout() {
		return myCoach.getDailyWorkout();
	}
	
//	@GetMapping("/check")
//	public String check() {
//		return "Comaparing beans: mycoach == jesicaCoach, " + (myCoach == yourCoach);
//	}

}
