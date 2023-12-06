package com.example.SpringBootRestDemo.handson;

public class EmployeeNotFoundException extends Exception {

	public EmployeeNotFoundException() {
	        super();
	    }
	    public EmployeeNotFoundException(String message, Throwable cause) {
	        super(message, cause);
	    }
	    public EmployeeNotFoundException(String message) {
	        super(message);
	    }
}
