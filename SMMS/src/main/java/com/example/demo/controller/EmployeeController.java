package com.example.demo.controller;

import com.example.demo.entity.Employee;

import com.example.demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE, RequestMethod.OPTIONS})
@RestController
@RequestMapping("/api/employees")
public class EmployeeController {
	  @Autowired
	    private EmployeeService employeeService;

	    // Add new employee
	    @PostMapping("/add")
	    public ResponseEntity<String> addEmployee(@RequestBody Employee employee) {
	        return employeeService.addEmployee(employee);
	    }

	    // Get employee by ID
	    @GetMapping("/{employeeId}")
	    public ResponseEntity<Employee> getEmployeeById(@PathVariable int employeeId) {
	        Optional<Employee> employeeOptional = employeeService.getEmployeeById(employeeId);

	        return employeeOptional.map(ResponseEntity::ok)
	                .orElse(ResponseEntity.notFound().build());
	    }

	    // Get all employees
	    @GetMapping("/all")
	    public List<Employee> getAllEmployees() {
	        return employeeService.getAllEmployees();
	    }

	    // Update employee
	    @PutMapping("/{employeeId}")
	    public ResponseEntity<Employee> updateEmployee(@PathVariable int employeeId, @RequestBody Employee updatedEmployee) {
	        Employee updated = employeeService.updateEmployee(employeeId, updatedEmployee);

	        return Optional.ofNullable(updated)
	                .map(ResponseEntity::ok)
	                .orElse(ResponseEntity.notFound().build());
	    }

	    // Delete employee
	    @DeleteMapping("/{employeeId}")
	    public ResponseEntity<Void> deleteEmployee(@PathVariable int employeeId) {
	        employeeService.deleteEmployee(employeeId);
	        return ResponseEntity.noContent().build();
	    }
}
