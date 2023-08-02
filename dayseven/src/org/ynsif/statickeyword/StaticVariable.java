package org.ynsif.statickeyword;

class Employee{
	private int eid;
	private String name;
	private static String companyName = "TNSIF";
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public static String getCompanyName() {
		return companyName;
	}
	public static void setCompanyName(String companyName) {
		Employee.companyName = companyName;
	}
	
	void display() {
		System.out.println("Emp id: "+ this.getEid() + "Emp Name: " + this.getName() + "Company Name: " + Employee.getCompanyName());
	}
	
	
}
//driver class
public class StaticVariable {

	public static void main(String[] args) {
		Employee e = new Employee();
		e.setEid(1);
		e.setName("Aditi");
		e.display();
		Employee e1= new Employee();
		e1.setEid(5);
		e1.setName("nikita");
		e1.display();
		
		

	}

}
