package com.example.spring_lab.spring_lab.repositories;

import com.example.spring_lab.spring_lab.models.Department;
import com.example.spring_lab.spring_lab.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {
}