package com.example.demo.service;
import com.example.demo.entity.Employee;
import com.example.demo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {
	  @Autowired
	    private EmployeeRepository employeeRepository;
	  // Add new employee
	  public ResponseEntity<String> addEmployee(Employee employee) {

			if (employeeRepository.findByemail(employee.getEmail()).isPresent()) {
				return new ResponseEntity<>("User already exists with same email", HttpStatus.CONFLICT);
			}

			// If contactNo is unique, save the employee
			employeeRepository.save(employee);
			return new ResponseEntity<>("Employee added successfully", HttpStatus.CREATED);
		}

	    // Get employee by ID
	    public Optional<Employee> getEmployeeById(int employeeId) {
	        return employeeRepository.findById(employeeId);
	    }

	    // Get all employees
	    public List<Employee> getAllEmployees() {
	        return employeeRepository.findAll();
	    }

	    // Update employee
	    public Employee updateEmployee(int employeeId, Employee updatedEmployee) {
	        Optional<Employee> existingEmployeeOptional = employeeRepository.findById(employeeId);

	        if (existingEmployeeOptional.isPresent()) {
	            Employee existingEmployee = existingEmployeeOptional.get();
	            existingEmployee.setName(updatedEmployee.getName());
	            existingEmployee.setAddress(updatedEmployee.getAddress());
	            existingEmployee.setSalary(updatedEmployee.getSalary());
	            existingEmployee.setDesignation(updatedEmployee.getDesignation());
	            existingEmployee.setContactNo(updatedEmployee.getContactNo());
	            existingEmployee.setEmail(updatedEmployee.getEmail());
	            // Update other fields as needed

	            return employeeRepository.save(existingEmployee);
	        } else {
	            // Handle not found scenario, you might choose to throw an exception
	            return null;
	        }
	    }

	    // Delete employee
	    public void deleteEmployee(int employeeId) {
	        employeeRepository.deleteById(employeeId);
	    }
}
