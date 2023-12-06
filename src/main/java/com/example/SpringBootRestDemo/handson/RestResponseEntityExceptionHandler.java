package com.example.SpringBootRestDemo.handson;

import java.util.Date;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class RestResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {

//	@ExceptionHandler(value = { EmployeeNotFoundException.class })
//	protected ResponseEntity<Object> handleNotFound(EmployeeNotFoundException ex, WebRequest request) {
//		String bodyOfResponse = "This should be application specific";
//		return handleExceptionInternal(ex, bodyOfResponse, new HttpHeaders(), HttpStatus.CONFLICT, request);
//	}
	
	@ExceptionHandler(value = {EmployeeNotFoundException.class})
	  public ResponseEntity<ErrorMessage> resourceNotFoundException(EmployeeNotFoundException ex, WebRequest request) {
	    ErrorMessage message = new ErrorMessage(
	        4,
	        new Date(),
	        "4 employees found message",
	        "4 employees found description");
	    
	    return new ResponseEntity<ErrorMessage>(message, HttpStatus.CONFLICT);
	  }
}