package com.example.demo.entity;
import java.time.LocalDate;

import java.util.Arrays;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;

@Entity

public class Product {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int productId;

    private String name;
    private LocalDate manufacturing;
    private float price;
    private String category;
    
    @Lob
    @Column(name = "image", columnDefinition = "LONGBLOB")
    private byte[] image;

    
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
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
	public byte[] getImage() {
		return image;
	}
	public void setImage(byte[] image) {
		this.image = image;
	}
	Product(int productId, String name, LocalDate manufacturing, float price, String category, byte[] image) {
		super();
		this.productId = productId;
		this.name = name;
		this.manufacturing = manufacturing;
		this.price = price;
		this.category = category;
		this.image = image;
	}
	public Product() {
		
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", name=" + name + ", manufacturing=" + manufacturing + ", price="
				+ price + ", category=" + category + ", image=" + Arrays.toString(image) + "]";
	}
	public void setImagePath(String string) {
		
		
	}




}
