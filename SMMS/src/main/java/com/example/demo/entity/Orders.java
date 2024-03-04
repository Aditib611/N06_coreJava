package com.example.demo.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class Orders {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int orderId;
	private String category;
	private int userId;
	private int productId;
	
	private String status;
	
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", category=" + category + ", userId=" + userId + ", productId="
				+ productId + ", status=" + status + "]";
	}
	Orders(int orderId, String category, int userId, int productId, String status) {
		super();
		this.orderId = orderId;
		this.category = category;
		this.userId = userId;
		this.productId = productId;
		this.status = status;
	}
	public Orders() {
		super();
		// TODO Auto-generated constructor stub
	}

}
