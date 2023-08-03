package org.tnsif.polymorphism;


class CM{
	int corruption(int amount) {
		return amount;
	}
}
class MLA extends CM{
	int corruption(int amount) {
		return amount;
	}
	
}
public class MethodOverridingExecutor {

	public static void main(String[] args) {
		MLA m=new MLA();
		System.out.println(m.corruption(4500000));

	}

}
