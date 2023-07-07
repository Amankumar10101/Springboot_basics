package com.api.rest.prac;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class PokemonRestExceptionHandler {
	

	//add an exception handler using @ExceptionHandler
	
	@ExceptionHandler
	public ResponseEntity<PokemonErrorResponse> handleException(PokemonNotFoundException exc) {
		
		//create a studentErrorResponse
		
		PokemonErrorResponse error = new PokemonErrorResponse();
		
		error.setStatus(HttpStatus.NOT_FOUND.value());
		error.setMessage(exc.getMessage());
		error.setTimestamp(System.currentTimeMillis());
			
		//return responseEntity	
		
		return new ResponseEntity<>(error, HttpStatus.NOT_FOUND) ;
	}
	
	//add new exception handler .. . to catch any exception 
	
	
	@ExceptionHandler
    public ResponseEntity<PokemonErrorResponse> handleException(Exception exc) {
		
		//create a studentErrorResponse
		
		PokemonErrorResponse error = new PokemonErrorResponse();
		
		error.setStatus(HttpStatus.BAD_REQUEST.value());
		error.setMessage(exc.getMessage());
		error.setTimestamp(System.currentTimeMillis());
			
		//return responseEntity	
		
		return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST) ;
	}
	

}
