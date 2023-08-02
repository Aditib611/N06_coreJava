package org.tnsif.superkeyword;

class MET{
	
	String ownerName="Chagan Bhubal";
	int floors = 20;
	void displayName()
	{
		System.out.println("Owner is:" + ownerName);
	}
}
class BKC extends MET{
	String ownerName="Shefali Bhujbal";
	void displayName()
	{
		/*if parent class and child class method names are same, and if you want to access that method inside 
	child class, then use super.MethodName().*/
		super.displayName();
		System.out.println("Owner is: "+ ownerName);
	}
}
public class SuperKeywordWithMethod {

	public static void main(String[] args) {
		BKC b = new BKC();
		b.displayName();
		
		

	}

}
