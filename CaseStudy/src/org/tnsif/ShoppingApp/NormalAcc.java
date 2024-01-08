// Abstract class representing a Normal Account
package org.tnsif.ShoppingApp;

public class NormalAcc extends ShopAcc{
	 private static final float deliveryCharges = 5;
	   private float creditLimit;
	   
	 public NormalAcc(int accNo, String accNm, float charges, float deliveryCharges) {
	        super(accNo, accNm, charges);
	        // Lazy initialization for creditLimit
	        this.creditLimit = calculateCreditLimit();
	    }

	    private float calculateCreditLimit() {
	        // Some complex logic for credit limit calculation
	        return getCharges() * 0.2f;
	    }
	    public float getDeliveryCharges() {
	        return deliveryCharges;
	    }

	    @Override
	    public void bookProduct(float amount) {
	        // Implementation with extra delivery charges for Normal Account
	        System.out.println("Product booked for Normal Account. Total charges: " + (getCharges() + amount + deliveryCharges));
	    }

	    @Override
	    public String toString() {
	        return super.toString() + ", Credit Limit: " + creditLimit;
	    }
	}

