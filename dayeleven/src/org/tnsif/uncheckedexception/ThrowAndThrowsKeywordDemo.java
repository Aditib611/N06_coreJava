package org.tnsif.uncheckedexception;

public class ThrowAndThrowsKeywordDemo {

	static void isEligible(int age, int weight) 
	{
		if(age>18 && weight>50) {
			System.out.println("Person is Eligible");
			
		}else
			//throw keyword is used to throw the exception explicitly
			throw new ArithmeticException("Criteria is not satisfied");
		
	}
	public static void main(String[] args) {
		//isEligible(5,14);
		
		
		try {
			isEligible(5,14);
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
/*try catch will print exception in black color whereas throws will print in red color*/