
/*Q2) Vivek Furniture Store is one of the most famous furniture stores in the city. They want to automate their customer details and the total price. As an initiative, they want the system to store the customer details and help them generate the total price.
You, being their software consultant, have been approached to develop software to implement the functionality of generating the total price based on the bero type.
*/package org.tnsif.furnitureStoreAutomation;

public class WoodenBero extends Bero {
	private String woodType;
	

	public String getWoodType() {
		return woodType;
	}


	public void setWoodType(String woodType) {
		this.woodType = woodType;
	}


	public WoodenBero(String beroType, String beroColour, String woodType) {
		super(beroType, beroColour);
		this.woodType = woodType;
	}


	@Override
	public void calculatePrice() {
		// TODO Auto-generated method stub
		if(woodType.equals("Ply Wood")) {
			this.price = 15000;
		}
		else if(woodType.equals("Teak Wood")) {
			this.price = 12000;
		}
		else if(woodType.equals("Engineered Wood")) {
			this.price = 10000;
		}
		else{
			System.out.println("Invalid Type");
		}
	
		
	}
}
