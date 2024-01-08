// Concrete class representing a Shop Factory for GoShopping App
package org.tnsif.ShoppingApp;

public class GSShopFactory extends ShopFactory{
	 @Override
	    public GSPrimeAcc getNewPrimeAcc(int accNo, String accNm, float charges, boolean isPrime) {
	        return new GSPrimeAcc(accNo, accNm, charges, isPrime);
	    }

	    @Override
	    public GSNormalAcc getNewNormalAcc(int accNo, String accNm, float charges, float deliveryCharges) {
	        return new GSNormalAcc(accNo, accNm, charges, deliveryCharges);
	    }
}
