package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class User {

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private int id;

	    private String name;
	    private String type;
	    private String password;

	    @OneToOne
	    @JoinColumn(name = "shopOwner_id")
	    private ShopOwner shopOwner;

		User( String name, String type, String password, ShopOwner shopOwner) {
			super();
			
			this.name = name;
			this.type = type;
			this.password = password;
			this.shopOwner = shopOwner;
		}

		@Override
		public String toString() {
			return "User [id=" + id + ", name=" + name + ", type=" + type + ", password=" + password + ", shopOwner="
					+ shopOwner + "]";
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

		public ShopOwner getShopOwner() {
			return shopOwner;
		}

		public void setShopOwner(ShopOwner shopOwner) {
			this.shopOwner = shopOwner;
		}


}
