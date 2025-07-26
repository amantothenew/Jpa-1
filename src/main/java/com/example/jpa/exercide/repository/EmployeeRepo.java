package com.example.jpa.exercide.repository;

import com.example.jpa.exercide.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepo extends JpaRepository<Employee, Long> {

    List<Employee> findByName(String name);

    List<Employee> findByNameStartingWith(String prefix);

    List<Employee> findByAgeBetween(int startAge, int endAge);
}
