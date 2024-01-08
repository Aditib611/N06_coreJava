package org.tnsif.ioc;

import java.util.List;

public class Student {
	private int id;
	private String name;
	private List<String> certificates;
	
	Student(int id, String name, List<String> certificates) {
		super();
		this.id = id;
		this.name = name;
		this.certificates = certificates;
	}
	Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	
	public List<String> getCertificates() {
		return certificates;
	}
	public void setCertificates(List<String> certificates) {
		this.certificates = certificates;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", certificates=" + certificates + "]";
	}
}
