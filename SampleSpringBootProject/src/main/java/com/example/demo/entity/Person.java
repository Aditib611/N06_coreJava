package com.example.demo.entity;

import jakarta.persistence.Entity;

import jakarta.persistence.Id;

@Entity
public class Person {
	@Id
	private int pId;
	private String name;
	private String city;
	
	public int getpId() {
		return pId;
	}
	public void setpId(int pId) {
		this.pId = pId;
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
	Person(int pId, String name, String city) {
		super();
		this.pId = pId;
		this.name = name;
		this.city = city;
	}
	
	Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Person [pId=" + pId + ", name=" + name + ", city=" + city + "]";
	}

}
