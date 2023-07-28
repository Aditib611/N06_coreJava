package org.tnsif.encapsulation;

public class EncapsulationExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HDFC h = new HDFC();
		
		//setting a value to private data members
		h.setAccType("Saving Account");
		h.setAccountNo(785498624785L);
		h.setAtmCardNo(45896785478L);
		h.setPinNo(9082);
		
		//System.out.println("Account No. is: " + h.getAccountNo());
		//below line will call to toString() method
		System.out.println(h);
		

	}

}
