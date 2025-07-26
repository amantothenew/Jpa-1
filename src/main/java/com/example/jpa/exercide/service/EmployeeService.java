package com.example.jpa.exercide.service;

import com.example.jpa.exercide.entity.Employee;
import com.example.jpa.exercide.repository.EmployeeRepo;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class EmployeeService {

    EmployeeRepo repository;

    public EmployeeService(EmployeeRepo repository) {
        this.repository = repository;
    }

    //create and update
    public Employee save(Employee employee) {
        return repository.save(employee);
    }

    //delete
    public Employee delete(Long id) {
        Optional<Employee> employee = repository.findById(id);
        if (employee.isPresent()) {
            repository.deleteById(id);
            return employee.get();
        } else {
            return null;
        }
    }

    //Retrieve
    public List<Employee> findAll() {
        return repository.findAll();
    }

}
