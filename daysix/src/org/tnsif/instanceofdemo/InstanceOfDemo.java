package org.tnsif.instanceofdemo;

class RBI{
	protected String ifscCode;
}

class SBI extends RBI{ 
	
	public SBI() {
	super.ifscCode="RATN0000069";
	String ifscCode="SBIN0002161";
	System.out.println(ifscCode);
	/* if parent class and child class variable name are same in such case use super.variable name to access that
	 *  variable of parent class*/
	System.out.println(super.ifscCode);
	}
	
}
//program to demonstrate on instanceof operator
public class InstanceOfDemo {

	public static void main(String[] args) {
		SBI s = new SBI();
		System.out.println(s instanceof SBI);
		System.out.println(s instanceof RBI);
		
		

	}

}
