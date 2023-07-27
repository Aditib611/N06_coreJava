package org.tnsif.multilevelinheritance;

public class TeamMemberExecutor extends ManagerExecutor {
	
	private String department;
	private String name;
	//getter and setter
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "TeamMemberExecutor [department=" + department + ", name=" + name + ", toString()=" + super.toString()
				+ "]";
	}
	public TeamMemberExecutor() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TeamMemberExecutor(int orgId, String orgName, String area, int pincode, int salary, int managerId,String department,String name) {
		super(orgId, orgName, area, pincode, salary, managerId);
		this.department=department;
		this.name=name;
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
