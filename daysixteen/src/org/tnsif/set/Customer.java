package org.tnsif.set;

public class Customer {
	private String name;
	private String city;
	Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	Customer(String name, String city) {
		super();
		this.name = name;
		this.city = city;
	}
	@Override
	public String toString() {
		return "Customer [name=" + name + ", city=" + city + "]";
	}
	

}
