package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Employee;
import com.example.demo.service.EmployeeService;



@RestController
@RequestMapping("/employees")
public class EmployeeController {
	 @Autowired
	    private EmployeeService employeeService;
	 public EmployeeController(EmployeeService employeeService) {
	        this.employeeService = employeeService;
	    }

	    @PostMapping("/add")
	    public ResponseEntity<Employee> addEmployee(@RequestBody Employee employee) {
	        Employee addedEmployee = employeeService.addEmployee(employee);
	        return new ResponseEntity<>(addedEmployee, HttpStatus.CREATED);
	    }

	    @PutMapping("/update")
	    public ResponseEntity<?> updateEmployee(@RequestBody Employee updatedEmployee) {
	        try {
	            Employee updatedEmployeeResult = employeeService.updateEmployee(updatedEmployee);
	            return ResponseEntity.ok(updatedEmployeeResult);
	        } catch (RuntimeException e) {
	            return ResponseEntity.status(404).body("Employee not found or error updating: " + e.getMessage());
	        }
	    }
	    @GetMapping("/search/{id}")
	    public ResponseEntity<Employee> searchEmployee(@PathVariable Integer id) {
	        Employee foundEmployee = employeeService.searchEmployee(id);
	        if (foundEmployee != null) {
	            return new ResponseEntity<>(foundEmployee, HttpStatus.OK);
	        } else {
	            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	        }
	    }

	    @DeleteMapping("/delete/{id}")
	    public ResponseEntity<Boolean> deleteEmployee(@PathVariable Integer id) {
	        boolean result = employeeService.deleteEmployee(id);
	        return new ResponseEntity<>(result, HttpStatus.OK);
	    }
  
}
