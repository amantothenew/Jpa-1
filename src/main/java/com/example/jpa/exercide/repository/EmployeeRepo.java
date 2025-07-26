package com.example.jpa.exercide.repository;

import com.example.jpa.exercide.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository<Employee, Long> {


}
