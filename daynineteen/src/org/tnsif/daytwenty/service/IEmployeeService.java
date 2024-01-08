//program to define Employee Service Interface for CRUD operation
package org.tnsif.daytwenty.service;

import java.sql.SQLException;
import java.util.List;

import org.tnsif.daytwenty.entity.Employee;

public interface IEmployeeService {
	int addEmployee(Employee emp) throws SQLException;
	
	int deleteEmployeeByEmpNo(int empNo)throws SQLException;
	
	int updateEmployeeByEmpNo(int empNo, Employee emp) throws SQLException;
	
	List<Employee> getAllEmployees() throws SQLException;
	
}
