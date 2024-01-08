package org.tnsif.BankMM;

public abstract class SavingAcc extends BankAcc {
	
	private boolean isSalaried;
	private static final float MINBAL = 1000.0f;
	public SavingAcc(int accNo, String accNm, float accBal, boolean isSalaried) {
		super(accNo, accNm, accBal);
		this.isSalaried = isSalaried;
	}
	
	public boolean isSalaried() {
	        return isSalaried;
	}
	 
	@Override
	public abstract  void withdraw(float amount);
	//public abstract  void deposit(float amount);
	public abstract String toString();
	
}
