package org.tnsif.ShoppingApp;

public class GoShoppingApp {
	public static void main(String[] args) {
        // a. Assign instance of GSShopFactory to ShopFactory reference.
        ShopFactory shopFactory = new GSShopFactory();

        // b. Instantiate GSPrimeAcc and refer it through reference PrimeAcc.
        PrimeAcc primeAcc = shopFactory.getNewPrimeAcc(1, "PrimeUser", 20, true);

        // c. Instantiate GSNormalAcc and refer it through reference NormalAcc.
        NormalAcc normalAcc = shopFactory.getNewNormalAcc(2, "NormalUser", 15, 3);

        // d. Invoke bookProduct() method.
        primeAcc.bookProduct(5);
        normalAcc.bookProduct(10);

        // e. Invoke toString() method.
        System.out.println("Prime Account Details: " + primeAcc.toString());
        System.out.println("Normal Account Details: " + normalAcc.toString());
    }
}
