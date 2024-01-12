package com.example.demo.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class Shop {
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private int shopId;

	    private String shopCategory;
	    private String shopName;
	    private String customers;
	    private String shopStatus;
	    private String leaseStatus;
	    @OneToMany(mappedBy = "shop", cascade = CascadeType.ALL )
	    @JsonIgnore
	    private List<Employee> employees;

	    @OneToOne
	    @JoinColumn(name = "shopOwnerId")
	    private ShopOwner shopOwner;
	    
	    @OneToMany(mappedBy = "shop", cascade = CascadeType.ALL)
	    private List<Item> items;
  
	    public int getShopId() {
	        return shopId;
	    }

	    public void setShopId(int shopId) {
	        this.shopId = shopId;
	    }

	    public String getShopCategory() {
	        return shopCategory;
	    }

	    public void setShopCategory(String shopCategory) {
	        this.shopCategory = shopCategory;
	    }

	    public String getShopName() {
	        return shopName;
	    }

	    public void setShopName(String shopName) {
	        this.shopName = shopName;
	    }

	    public String getCustomers() {
	        return customers;
	    }

	    public void setCustomers(String customers) {
	        this.customers = customers;
	    }

	    public String getShopStatus() {
	        return shopStatus;
	    }

	    public void setShopStatus(String shopStatus) {
	        this.shopStatus = shopStatus;
	    }

	    public String getLeaseStatus() {
	        return leaseStatus;
	    }

	    public void setLeaseStatus(String leaseStatus) {
	        this.leaseStatus = leaseStatus;
	    }

	    public List<Employee> getEmployees() {
	        return employees;
	    }

	    public void setEmployees(List<Employee> employees) {
	        this.employees = employees;
	    }

	    public ShopOwner getShopOwner() {
	        return shopOwner;
	    }

	    public void setShopOwner(ShopOwner shopOwner) {
	        this.shopOwner = shopOwner;
	    }
	    
	    public List<Item> getItems() {
	        return items;
	    }

	    public void setItems(List<Item> items) {
	        this.items = items;
	    }
	    // Constructors

	    @Override
		public String toString() {
			return "Shop [shopId=" + shopId + ", shopCategory=" + shopCategory + ", shopName=" + shopName
					+ ", customers=" + customers + ", shopStatus=" + shopStatus + ", leaseStatus=" + leaseStatus
					+ ", employees=" + employees + ", shopOwner=" + shopOwner + ", items=" + items + "]";
		}

		public Shop() {
	        // Default constructor
	    }

	    public Shop(String shopCategory, String shopName, String customers, String shopStatus, String leaseStatus,  List<Item> items) {
	        this.shopCategory = shopCategory;
	        this.shopName = shopName;
	        this.customers = customers;
	        this.shopStatus = shopStatus;
	        this.leaseStatus = leaseStatus;
	        this.items = items;
	    }

		

	   

	}
	
    
    

    

    

