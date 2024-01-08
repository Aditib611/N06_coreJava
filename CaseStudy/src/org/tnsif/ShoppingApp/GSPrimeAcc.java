// Concrete class representing online shopping specific Prime Account
package org.tnsif.ShoppingApp;

public class GSPrimeAcc extends PrimeAcc{
	private static final float charges = 10;
	
	 public GSPrimeAcc(int accNo, String accNm, float charges, boolean isPrime) {
	        super(accNo, accNm, GSPrimeAcc.charges, isPrime);
	    }

	    @Override
	    public void bookProduct(float amount) {
	        // Overridden method without extra delivery charges for Prime Account
	        System.out.println("Product booked for Prime Account. Total charges: " + (getCharges() + amount));
	    }

	    @Override
	    public String toString() {
	        return super.toString();
	    }

}
