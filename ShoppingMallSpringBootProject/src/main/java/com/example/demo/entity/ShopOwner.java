package com.example.demo.entity;

import java.time.LocalDate;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

@Entity

public class ShopOwner {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private LocalDate dob;
    private String address;


    @ManyToOne
    @JoinColumn(name = "shop_id")
    private Shop shop;

    @OneToOne(mappedBy = "shopOwner", cascade = CascadeType.ALL)
    private User user;

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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	public Shop getShop() {
        return shop;
    }

    public void setShop(Shop shop) {
        this.shop = shop;
    }
	ShopOwner() {
		super();
		// TODO Auto-generated constructor stub
	}
    public ShopOwner(String name, LocalDate dob, String address, Shop shop) {
        this.name = name;
        this.dob = dob;
        this.address = address;
        this.shop = shop;
    }
	@Override
	public String toString() {
		return "ShopOwner [id=" + id + ", name=" + name + ", dob=" + dob + ", address=" + address + ", user=" + user
				+ "]";
	}
    
    
    


}
