package org.tnsif.furnitureStoreAutomation;

public class Discount {
	public double calculateDiscount(Bero bObj) {
		if(bObj instanceof SteelBero)
		{
			//return (bObj.getPrice() * 10) / 100;
			return bObj.getPrice() * 0.10; //10% disocunt
		}
		else if(bObj instanceof WoodenBero) {
			//return (bObj.getPrice() * 15) / 100;
			return bObj.getPrice() * 0.15;//15% disocunt
		}
	
		 return 0.0;
		
		
	}
}
