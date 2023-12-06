package com.example.SpringBootRestDemo.handson;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository empRepo;
	
	@Override
	public List<Employee> getEmp() {
		// TODO Auto-generated method stub
		return empRepo.findAll();
	}

	@Override
	public Employee saveEmp(Employee e) {
		// TODO Auto-generated method stub
		return empRepo.save(e);
	}

}
