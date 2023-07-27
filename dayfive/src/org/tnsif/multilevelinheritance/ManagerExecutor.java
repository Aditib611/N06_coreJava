package org.tnsif.multilevelinheritance;

public class ManagerExecutor extends OrganizationExecutor {
	
	private int salary;
	private int managerId;
	
	//getters and setters
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getManagerId() {
		return managerId;
	}
	public void setManagerId(int managerId) {
		this.managerId = managerId;
	}
	@Override
	public String toString() {
		return "ManagerExecutor [salary=" + salary + ", managerId=" + managerId + ", toString()=" + super.toString()
				+ "]";
	}
	public ManagerExecutor() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ManagerExecutor(int orgId, String orgName, String area, int pincode,int salary,int managerId) {
		super(orgId, orgName, area, pincode);
		this.salary=salary;
		this.managerId=managerId;
		// TODO Auto-generated constructor stub
	}
	
	
	
	

	
	
	

	
	
	
	
	
	

}
