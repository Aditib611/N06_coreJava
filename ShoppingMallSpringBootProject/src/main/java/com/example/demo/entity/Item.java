package com.example.demo.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    private LocalDate manufacturing;

    private LocalDate expiry;

    private float price;

    private String category;

    @ManyToOne
    @JoinColumn(name = "shop_id")
    private Shop shop;

    // Constructors, getters, setters, and other methods

    public Item() {
        // Default constructor
    }

    public Item(String name, LocalDate manufacturing, LocalDate expiry, float price, String category, Shop shop) {
        this.name = name;
        this.manufacturing = manufacturing;
        this.expiry = expiry;
        this.price = price;
        this.category = category;
        this.shop = shop;
    }

    // Getter and Setter methods

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

    public LocalDate getManufacturing() {
        return manufacturing;
    }

    public void setManufacturing(LocalDate manufacturing) {
        this.manufacturing = manufacturing;
    }

    public LocalDate getExpiry() {
        return expiry;
    }

    public void setExpiry(LocalDate expiry) {
        this.expiry = expiry;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Shop getShop() {
        return shop;
    }

    public void setShop(Shop shop) {
        this.shop = shop;
    }

	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + ", manufacturing=" + manufacturing + ", expiry=" + expiry
				+ ", price=" + price + ", category=" + category + ", shop=" + shop + "]";
	}
}


