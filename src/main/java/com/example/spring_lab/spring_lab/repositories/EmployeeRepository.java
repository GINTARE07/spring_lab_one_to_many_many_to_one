package com.example.spring_lab.spring_lab.repositories;


import com.example.spring_lab.spring_lab.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
