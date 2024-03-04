package com.example.demo.entity;
import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class User {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
	private String username;
	private String name;
	private String contactNo;
	private String address;
	private String email;
	private String type; //CUSTOMER OR ADMIN
    private String password;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContactNo() {
		return contactNo;
	}
	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	User() {
		super();
		// TODO Auto-generated constructor stub
	}
	User(int id, String username, String name, String contactNo, String address, String email, String type,
			String password) {
		super();
		this.id = id;
		this.username = username;
		this.name = name;
		this.contactNo = contactNo;
		this.address = address;
		this.email = email;
		this.type = type;
		this.password = password;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", name=" + name + ", contactNo=" + contactNo
				+ ", address=" + address + ", email=" + email + ", type=" + type + ", password=" + password + "]";
	}
    
  
    
}
