package org.tnsif.singleinheritance;

//child class
public class Student extends Citizen {
	
	//private data members
	private int rollNo;
	private String collegeName;
	
	//getters and setters
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	//parameterized constructor
	public Student(int pincode, String city, String area, long adharNo,
			int rollNo, String collegeName) {
		super(pincode, city, area, adharNo);
		this.rollNo = rollNo;
		this.collegeName = collegeName;
	}
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", collegeName=" + collegeName + ", toString()=" + super.toString() + "]";
	}
	
	
	

}
