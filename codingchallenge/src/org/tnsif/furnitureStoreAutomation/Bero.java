package org.tnsif.furnitureStoreAutomation;

 public abstract class Bero {
	protected String beroType;
	protected String beroColour;
	protected double price;
	
	//parameterized constructor
	public Bero(String beroType, String beroColour) {
		super();
		this.beroType = beroType;
		this.beroColour = beroColour;
	}
	
	//getters and setters
	public String getBeroType() {
		return beroType;
	}
	public void setBeroType(String beroType) {
		this.beroType = beroType;
	}
	public String getBeroColour() {
		return beroColour;
	}
	public void setBeroColour(String beroColour) {
		this.beroColour = beroColour;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	public abstract void calculatePrice();

}
