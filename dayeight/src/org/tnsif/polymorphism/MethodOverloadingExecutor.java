package org.tnsif.polymorphism;

class Bollywood{
	static String showCouple(String str1, String str2) {
		return str1 + " loves " + str2 ;
	}
	
	static String showCouple(String str1, String str2, String str3) {
		return str1 + " loves " + str2 +" as well as "+str3;
	}
}
public class MethodOverloadingExecutor {

	public static void main(String[] args) {
		System.out.println(Bollywood.showCouple("Salman", "Aishwarya"));
		System.out.println(Bollywood.showCouple("Salman", "Aishwarya", "Katrina"));

	}

}
