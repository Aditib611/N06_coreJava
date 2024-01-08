package org.tnsif.daytwenty.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.tnsif.daytwenty.dao.DBUtil;
import org.tnsif.daytwenty.entity.Employee;

public class EmployeeServiceImpl implements IEmployeeService{
	PreparedStatement pst;
	Connection cn;
 
	public EmployeeServiceImpl(){
		cn = DBUtil.getCn();        //because getCn is declared as static method
				
	
	}
	@Override
	public int addEmployee(Employee emp) throws SQLException {
		pst = cn.prepareStatement("INSERT INTO employee VALUES(?, ?, ?)");//? starts with index of 1
		pst.setInt(1, emp.getEmpNo());
		pst.setString(2, emp.getEmpName());
		pst.setFloat(3, emp.getSalary());
	
		return pst.executeUpdate();
	}

	@Override
	public int deleteEmployeeByEmpNo(int empNo) throws SQLException{
		pst =cn .prepareStatement("DELETE FROM employee WHERE empNo=?");
		pst.setInt(1, empNo);
		int n =pst.executeUpdate();
		return n;
	}

	@Override
	public int updateEmployeeByEmpNo(int empNo, Employee emp)throws SQLException {
		pst =cn .prepareStatement("UPDATE employee SET empName=?, empsalary=? WHERE empNo=?");
		pst.setString(1, emp.getEmpName());
		pst.setFloat(2,  emp.getSalary());
		pst.setInt(3, emp.getEmpNo());
		int n =pst.executeUpdate();
		return n;
	
	}

	@Override
	public List<Employee> getAllEmployees() throws SQLException{
		int empNo;
		String empName;
		float salary;
		Employee emp;
		ArrayList<Employee> empList = new ArrayList<Employee>();//? starts with index of 1
		pst = cn.prepareStatement("SELECT * FROM employee");
		ResultSet rs = pst.executeQuery();
		while(rs.next()) {
			empNo = rs.getInt(1);
			empName = rs.getString(2);
			salary =rs.getFloat(3);
			emp = new Employee(empNo, empName, salary);
			empList.add(emp);
		}
		rs.close();
		return empList;
	}

}
