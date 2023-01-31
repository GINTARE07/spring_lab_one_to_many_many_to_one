package com.example.spring_lab.spring_lab;

import com.example.spring_lab.spring_lab.models.Department;
import com.example.spring_lab.spring_lab.models.Employee;
import com.example.spring_lab.spring_lab.models.Project;
import com.example.spring_lab.spring_lab.repositories.DepartmentRepository;
import com.example.spring_lab.spring_lab.repositories.EmployeeRepository;
import com.example.spring_lab.spring_lab.repositories.ProjectRepository;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
class SpringLabApplicationTests {

	@Autowired
	EmployeeRepository employeeRepository;

	@Autowired
	DepartmentRepository departmentRepository;

	@Autowired
	ProjectRepository projectRepository;

	@Before
	public void before() {
	}

	@Test
	public void canCreateEmployeeAndDepartment(){
		Department marketing = new Department("Marketing");
		departmentRepository.save(marketing);

		Employee jillDoe = new Employee("Jill Doe", 30, 126, "jilldoe@email.com", marketing);
		employeeRepository.save(jillDoe);
	}

	@Test
	public void canAddEmployeesAndProjects(){
		Department sales = new Department("Sales");
		departmentRepository.save(sales);

		Employee janeDoe = new Employee("Jane Doe", 32, 123, "janedoe@email.com", sales);
		employeeRepository.save(janeDoe);

		Project lab = new Project("Lab", 2);
		projectRepository.save(lab);

		lab.addEmployee(janeDoe);
		projectRepository.save(lab);
	}
}
