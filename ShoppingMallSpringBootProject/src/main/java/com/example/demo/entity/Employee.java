package com.example.demo.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;


import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    private LocalDate dob;

    private float salary;

    private String address;

    private String designation;

    @ManyToOne
    @JoinColumn(name = "shop_id")
    @JsonIgnore
    private Shop shop;

    // Constructors, getters, and setters


    public Employee(String name, LocalDate dob, float salary, String address, String designation, Shop shop) {
        this.name = name;
        this.dob = dob;
        this.salary = salary;
        this.address = address;
        this.designation = designation;
        this.shop = shop;
    }

    // Getters and setters

    Employee() {
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

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public Shop getShop() {
        return shop;
    }

    public void setShop(Shop shop) {
        this.shop = shop;
    }
    }