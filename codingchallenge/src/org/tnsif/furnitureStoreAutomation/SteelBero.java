package org.tnsif.furnitureStoreAutomation;

public class SteelBero extends Bero{
	private int beroHeight;
	
    //parameterized constructor
	public SteelBero(String beroType, String beroColour, int beroHeight) {
		super(beroType, beroColour);
		this.beroHeight = beroHeight;
	}


	public int getBeroHeight() {
		return beroHeight;
	}


	public void setBeroHeight(int beroHeight) {
		this.beroHeight = beroHeight;
	}


	@Override
	public void calculatePrice() {
		// TODO Auto-generated method stub
		if(beroHeight == 3) {
			price = 5000;
		}
		else if(beroHeight == 5) {
			price = 8000;
		}
		else if(beroHeight == 7) {
			price = 10000;
		}
		else{
			System.out.println("Invalid height");
		}
	}

}
