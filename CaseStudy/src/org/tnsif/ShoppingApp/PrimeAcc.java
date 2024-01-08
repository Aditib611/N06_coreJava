// Abstract class representing a Prime Account
package org.tnsif.ShoppingApp;

public abstract class PrimeAcc extends ShopAcc {
	private static final float deliveryCharges = 0;
    private boolean isPrime;
    
    public PrimeAcc(int accNo, String accNm, float charges, boolean isPrime) {
        super(accNo, accNm, charges);
        this.isPrime = isPrime;
    }

    @Override
    public void bookProduct(float amount) {
        // Implementation without extra delivery charges for Prime Account
        System.out.println("Product booked for Prime Account. Total charges: " + (getCharges() + amount));
    }

    @Override
    public String toString() {
        return super.toString() + ", Prime: " + isPrime;
    }

}
