package com.example.SpringBootRestDemo.handson;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

	@Autowired 
	private EmployeeService employeeService;
	
	@GetMapping("/getEmp")
	public List<Employee> getEmp() throws EmployeeNotFoundException {
		List<Employee> emps = employeeService.getEmp();
		if (emps.size() == 4) {
			throw new EmployeeNotFoundException("4 Employees found");
		}
		return employeeService.getEmp();
	}
	
	@PostMapping("saveEmp")
	public Employee saveEmp(Employee e) {
		return employeeService.saveEmp(e);
	}
	
}
