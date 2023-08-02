package org.ynsif.statickeyword;



public class StaticBlockExecutor {
	
	static int rollno;
	static String name;
	
   /*static block is used to initialize static variable and we cannot initialize any non static variable
    *  inside the static block*/
	static {
		
		name = "Aaradhya";
		//rollno = 101;
	System.out.println(name);
	}
	

	public static void main(String[] args) {
		//print();
		/*main function is static and hence it calls static block, method and variable by default*/

	}

}
