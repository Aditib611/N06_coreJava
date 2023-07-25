//driver class
//program to demonstrate on class and objects
package org.tnsif.classandobject;
//class declaration
public class EmployeeExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//object creation
		Employee e = new Employee();
		e.empID = 1238;
		e.empName = "Shivani Kumbhalkar";
		e.salary = 45000;
		e.department = "IT";
		//this is a method call
		e.display();

	}

}
