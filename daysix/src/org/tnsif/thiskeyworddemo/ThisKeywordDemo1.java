//program to demonstrate on:
//this keyword is used to refer current instance of the class
package org.tnsif.thiskeyworddemo;

class Account{
	long accountNo;
	
	void setData(long accountNo) {
		this.accountNo = accountNo;
	}
	
	void display() {
		System.out.println("Account number is: " + accountNo);
	}
}
//driver class
public class ThisKeywordDemo1 {

	public static void main(String[] args) {
		Account a = new Account();
		//a.accountNo=45879632584L;
		a.setData(45879632584L);
		a.display();
		//display(45879632584L);

	}

}
