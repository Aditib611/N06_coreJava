// Abstract class representing a Current Account
package org.tnsif.BankMM;

public abstract class CurrentAcc extends BankAcc{
	
	private final float creditLimit;
	private static final float MINBAL = 0.0f;
	
	CurrentAcc(int accNo, String accNm, float accBal, float creditLimit) {
		super(accNo, accNm, accBal);
		this.creditLimit = creditLimit;
	}
	
	public float getCreditLimit() {
        return creditLimit;
    }
	public abstract void withdraw(float amount);
	//public abstract void deposit(float amount);
		
	@Override
    public abstract String toString();
}
