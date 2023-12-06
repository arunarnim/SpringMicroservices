package com.example.SpringBootRestDemo.handson;

import java.util.List;

public interface EmployeeService {

	List<Employee> getEmp();
	
	Employee saveEmp(Employee e);
}
