package com.example.employeetracking;

import com.example.employeetracking.Repository.EmployeeRepository;
import com.example.employeetracking.models.Employee;
import com.sun.javafx.geom.PickRay;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EmployeetrackingApplicationTests {

	@Autowired
	EmployeeRepository employeeRepository;

	@Test
	public void contextLoads() {
	}

	@Test
	public void createemployee(){
		Employee steve = new Employee("Steve", 38, 12345, "somebody@udemy.com");
		employeeRepository.save(steve);
	}

}
