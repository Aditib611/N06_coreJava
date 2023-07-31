package org.tnsif.thiskeyworddemo;

class Bank{
	long accountNo;
	
	Bank(long accountNo){
		this.accountNo  = accountNo;
	
	}
	void display() {
		System.out.println(accountNo);
	}
	
}

public class ThisKeywordDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank b = new Bank(785498631452L);
		b.display();
	}

}
