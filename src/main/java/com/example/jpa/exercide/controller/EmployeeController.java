package com.example.jpa.exercide.controller;

import com.example.jpa.exercide.entity.Employee;
import com.example.jpa.exercide.service.EmployeeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    EmployeeService service;

    public EmployeeController(EmployeeService service){
        this.service = service;
    }

    @PostMapping("/employees")
    public Employee create(@RequestBody Employee employee) {
        return service.save(employee);
    }

    @DeleteMapping("/employees/{id}")
    public Employee removeById(@PathVariable long id) {
        return service.delete(id);
    }

    @PutMapping("/employees")
    public Employee update(@RequestBody Employee employee) {
        return service.save(employee);
    }

    @GetMapping("/employees")
    public List<Employee> retrieveAllEmployee() {
         return service.findAll();
    }

    @GetMapping("/employees/count")
    public long count() {
        return service.count();
    }


    @GetMapping("/employees/page/sort")
    public List<Employee> retrieveAllEmployeeWithPaginationAndSorting() {
        return service.findAllWithPaginationAndSorting();
    }

}
