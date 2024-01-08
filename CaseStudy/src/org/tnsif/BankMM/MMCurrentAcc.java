package org.tnsif.BankMM;

public class MMCurrentAcc extends CurrentAcc {
	 private float creditLimit;

	MMCurrentAcc(int accNo, String accNm, float accBal, float creditLimit) {
		super(accNo, accNm, accBal, creditLimit);
		this.creditLimit = creditLimit;
	}
		@Override
	    public void withdraw(float amount) {
	        if (getAccBal() + creditLimit >= amount) {
	            setAccBal(getAccBal() - amount);
	            System.out.println("Withdrawal successful");
	        } else {
	            System.out.println("Insufficient funds");
	        }
	}
		@Override
	    public String toString() {
	        return "Account No: " + getAccNo() + ", Name: " + getAccNm() + ", Balance: " + getAccBal();
	    }
		
		/* @Override
		    public void deposit(float amount) {
		        setAccBal(getAccBal() + amount);
		        System.out.println("Deposit successful");
		    }*/
}

	 


