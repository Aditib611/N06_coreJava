package org.tnsif.singledimensionalarray;
//program to demonstrate on arrays of objects
public class Employees {
	//private data members
	private int ID;
	private String Name;
	private double salary;
	
	//getters and setters
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	//parameterized constructor
	public Employees(int iD, String name, double salary) {
		super();
		ID = iD;
		Name = name;
		this.salary = salary;
	}
	

}
