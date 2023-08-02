//program to demonstrate on super constructor
package org.tnsif.superkeyword;

class Google{
	String ceo;

	public Google(String ceo) {
		System.out.println(ceo);
		
	}
	
}

class Gmail extends Google{
	
	String userid;
	
	 public Gmail(String ceo, String userid){
		 //calling to parent class parameterized constructor
		 super(ceo);
		 this.userid = userid;
		 System.out.println(userid);
	}
	
	
}

public class SuperKeywordWithConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gmail g = new Gmail("Sundar Pichai", "abc@gmail.com");
		//g.Gmail();
	}

}
