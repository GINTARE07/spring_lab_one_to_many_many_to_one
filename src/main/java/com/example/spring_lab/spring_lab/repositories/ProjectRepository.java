package com.example.spring_lab.spring_lab.repositories;

import com.example.spring_lab.spring_lab.models.Employee;
import com.example.spring_lab.spring_lab.models.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Long> {
}
