// Abstract class representing an Online Shopping account
package org.tnsif.ShoppingApp;

public abstract class ShopAcc {
	private int accNo;
	private String accNm;
	private float charges;
	
	 public ShopAcc(int accNo, String accNm, float charges) {
	        this.accNo = accNo;
	        this.accNm = accNm;
	        this.charges = charges;
	    }
	 
	 public int getAccNo() {
	        return accNo;
	    }

	    public String getAccNm() {
	        return accNm;
	    }

	    public float getCharges() {
	        return charges;
	    }

	    public abstract void bookProduct(float amount);

	    @Override
	    public String toString() {
	        return "Account No: " + accNo + ", Account Name: " + accNm + ", Charges: " + charges;
	    }

}
