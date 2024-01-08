// Concrete class representing online shopping specific Normal Account
package org.tnsif.ShoppingApp;

public class GSNormalAcc extends NormalAcc{
	private static final float charges = 8;
	   public GSNormalAcc(int accNo, String accNm, float charges, float deliveryCharges) {
	        super(accNo, accNm, GSNormalAcc.charges, deliveryCharges);
	    }

	    @Override
	    public void bookProduct(float amount) {
	        // Overridden method with extra delivery charges for Normal Account
	        System.out.println("Product booked for Normal Account. Total charges: " + (getCharges() + amount + getDeliveryCharges()));
	    }

	    @Override
	    public String toString() {
	        return super.toString();
	    }
	}

