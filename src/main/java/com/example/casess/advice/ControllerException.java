package com.example.casess.advice;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.example.casess.exceptions.IdNotFoundException;

@EnableWebMvc
@ControllerAdvice	
public class ControllerException extends ResponseEntityExceptionHandler {

	@ExceptionHandler(IdNotFoundException.class)
	public ResponseEntity<Object> handleEmptyInput(IdNotFoundException idNotFoundException){
		ExceptionResponse response = new ExceptionResponse();
        response.setMessage("Id not found");
        ResponseEntity<Object> entity = new ResponseEntity<>(response,HttpStatus.NOT_FOUND);
        return entity;
		
	}
}
