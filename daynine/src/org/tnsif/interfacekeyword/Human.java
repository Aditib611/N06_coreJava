package org.tnsif.interfacekeyword;
//implementable class or child class
public class Human implements ColdDrinks, AlcoholDrinks {

	@Override
	public void showDrink() {
		System.out.println(coldDrinkName+ " " + alcoholType + " " + brand);
	}

}
