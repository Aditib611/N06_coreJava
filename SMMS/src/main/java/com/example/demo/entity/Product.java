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
	private int discount;
    private String name;
    private LocalDate manufacturing;
    private float price;
    private String category;
    private String description;
//    private int rating;
//   private String comments;
//    public int getRating() {
//		return rating;
//	}
//	public void setRating(int rating) {
//		this.rating = rating;
//	}
//	public String getComments() {
//		return comments;
//	}
//	public void setComments(String comments) {
//		this.comments = comments;
//	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
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
	
	public int getDiscount() {
		return discount;
	}

	public void setDiscount(int discount) {
		this.discount = discount;
	}
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	Product(int productId, int discount, String name, LocalDate manufacturing, float price, String category,
			String description, int rating, String comments, byte[] image) {
		super();
		this.productId = productId;
		this.discount = discount;
		this.name = name;
		this.manufacturing = manufacturing;
		this.price = price;
		this.category = category;
		this.description = description;
//		this.rating = rating;
//		this.comments = comments;
		this.image = image;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", discount=" + discount + ", name=" + name + ", manufacturing="
				+ manufacturing + ", price=" + price + ", category=" + category + ", description=" + description
				+ ",  image=" + Arrays.toString(image) + "]";
	}
	public void setImagePath(String string) {
		
		
	}




}
