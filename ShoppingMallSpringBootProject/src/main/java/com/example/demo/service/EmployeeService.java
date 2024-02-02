package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Employee;
import com.example.demo.entity.Shop;
import com.example.demo.repository.IEmployeeRepository;
import com.example.demo.repository.IShopRepository;

import jakarta.transaction.Transactional;

import java.util.NoSuchElementException;
import java.util.Optional;
@Service
public class EmployeeService {
	  @Autowired
	    private IEmployeeRepository employeeRepository;
	
	        private IShopRepository shopRepository;
	    
	        public Employee addEmployee(Employee employee) {
	            // Additional logic if needed
	            // Set the shop for the employee
	            int shopId = employee.getShop().getShopId();
	            Shop shop = shopRepository.findById(shopId).orElseThrow(() -> new RuntimeException("Shop not found with id: " + shopId));
	            employee.setShop(shop);

	            return employeeRepository.save(employee);
	        }
	        @Transactional
	        public Employee updateEmployee(Employee updatedEmployee) {
	            try {
	                int id = updatedEmployee.getId();
	                Optional<Employee> existingEmployeeOptional = employeeRepository.findById(id);

	                if (existingEmployeeOptional.isPresent()) {
	                    Employee existingEmployee = existingEmployeeOptional.get();

	                    // Log the updatedEmployee and the associated shop before update
	                    System.out.println("Updated Employee: " + updatedEmployee);
	                    System.out.println("Associated Shop: " + updatedEmployee.getShop());

	                    // Update fields based on the provided employee
	                    existingEmployee.setName(updatedEmployee.getName());
	                    // ... (other updates)

	                    // Update the associated shop
	                    Shop updatedShop = updatedEmployee.getShop();
	                    existingEmployee.setShop(updatedShop);

	                    // Log the updated employee after update
	                    System.out.println("Updated Employee after update: " + existingEmployee);

	                    // Save the updated employee to the repository
	                    return employeeRepository.save(existingEmployee);
	                } else {
	                    throw new RuntimeException("Employee not found with ID: " + id);
	                }
	            } catch (Exception e) {
	                throw new RuntimeException("Error updating employee: " + e.getMessage());
	            }
	        }

	    // Search for an employee by ID
	    public Employee searchEmployee(Integer id) {
	        Optional<Employee> optionalEmployee = employeeRepository.findById(id);
	        return optionalEmployee.orElse(null);
	    }

	    // Delete an employee by ID
	    public boolean deleteEmployee(Integer id) {
	        // Check if the employee with the given ID exists
	        if (employeeRepository.existsById(id)) {
	            employeeRepository.deleteById(id);
	            return true;
	        }
	        return false; // or throw an exception indicating that the employee doesn't exist
	    }

}
