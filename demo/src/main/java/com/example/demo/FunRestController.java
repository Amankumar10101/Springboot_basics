package com.example.demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;

@RestController

public class FunRestController {
	
	//inject properties
	
	@Value("${captain.name}")
	private String captainName;
	
	@Value("${team.name}")
	private String teamName;
	
	//expose new endpoint for "teaminfo"
	
	@GetMapping("/teaminfo")
	public String getTeamInfo() {
		return "Captain: " + captainName + ", Team name: " + teamName;
	}
	
	@GetMapping("/")
	public String sayHello() {
		return "Hello";
	}
	
	//create a new 
	
	@GetMapping("/work")
	public String myWork() {
		return "First Work";
	}
 
}
