//client -> service
package org.tnsif.daytwenty.client;
import java.util.List;
import java.sql.SQLException;
import java.util.Scanner;
import java.util.ArrayList;
import org.tnsif.daytwenty.entity.Employee;
import org.tnsif.daytwenty.service.EmployeeServiceImpl;

public class Executor {

	

	//private static List<Employee> empList;

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int ch, n;
		int empNo;
		String empName;
		float empSalary;
		Employee emp = null;
		EmployeeServiceImpl service = new EmployeeServiceImpl();
		try {
		do {
			System.out.println("--------------Employee---------------");
			System.out.println("1. Add Employee");
			System.out.println("2. Delete Employee");
			System.out.println("3. Update Employee");
			System.out.println("4. Display All Employee");
			System.out.println("5. Close");
			System.out.println("5. Enter your Choice(1...5) : ");
			ch = sc.nextInt();
			List<Employee> empList;
			switch(ch) {
			case 1:
				System.out.println("Enter Employee details: ");
				System.out.println("Employee No: ");
				empNo = sc.nextInt();
				System.out.println("Employee Name : ");
				empName = sc.next();
				System.out.println("Employee Salary: ");
				empSalary = sc.nextFloat();
				
				emp = new Employee(empNo, empName, empSalary);
				n = service.addEmployee(emp);
				System.out.println(n>0? n +"employee(s) added..." : "Insertion Failed...");
				break;
			case 2:
				System.out.println("Enter Employee number: ");
				empNo = sc.nextInt();
				n=service.deleteEmployeeByEmpNo(empNo);
				break;
			case 3:
				System.out.println("Enter Employee number  to modify: ");
				empNo = sc.nextInt();
				System.out.println("Enter updated employee name: ");
				empName = sc.next();
				System.out.println("Enter updated employee salary: ");
				empSalary = sc.nextFloat();
				n=service.updateEmployeeByEmpNo(empNo, emp);
				break;
			case 4:
				empList = service.getAllEmployees();
				System.out.println(empList);
				break;
			case 5:
				System.out.println("Thankyou for using the application");
				default:System.out.println("Invalid choice : ");
				break;
				
			}
		}while(ch<5);
		
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
}
		
		

	

	
