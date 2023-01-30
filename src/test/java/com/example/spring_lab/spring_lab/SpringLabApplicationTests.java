package com.example.spring_lab.spring_lab;

import com.example.spring_lab.spring_lab.models.Employee;
import com.example.spring_lab.spring_lab.repositories.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class SpringLabApplicationTests {

	@Autowired
	EmployeeRepository employeeRepository;

	@Test
	public void before() {
	}

	@Test
	public void createSingleEmployeeAndSave(){
		Employee employee = new Employee("Jane Doe", 32, 123, "janedoe@email.com");
		employeeRepository.save(employee);
	}

}
