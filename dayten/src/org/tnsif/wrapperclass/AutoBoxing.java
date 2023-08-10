package org.tnsif.wrapperclass;
//program to demonstrate on Autoboxing
/*Conversion of Primitive data type to object type*/
public class AutoBoxing {

	public static void main(String[] args) {
		int num = 97;
		//converting a primitive type to object
		Integer value = num ;
		System.out.println(value);
		System.out.println(value.getClass().getName());

	}

}
