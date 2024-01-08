//program to define Person Bean
package org.tnsif.ioc;

public class Person {
	private int id;
	private String name;
	private Address addr;
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
	public Address getAddr() {
		return addr;
	}
	public void setAddr(Address addr) {
		this.addr = addr;
	}
	Person( Address addr) {
		super();
		this.id = id;
		this.name = name;
		this.addr = addr;
	}
	Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", addr=" + addr + "]";
	}
}
