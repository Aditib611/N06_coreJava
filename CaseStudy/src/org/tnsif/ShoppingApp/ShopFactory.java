// Abstract class representing a Shop Factory
package org.tnsif.ShoppingApp;

abstract class ShopFactory {
	public abstract PrimeAcc getNewPrimeAcc(int accNo, String accNm, float charges, boolean isPrime);

    public abstract NormalAcc getNewNormalAcc(int accNo, String accNm, float charges, float deliveryCharges);

}
