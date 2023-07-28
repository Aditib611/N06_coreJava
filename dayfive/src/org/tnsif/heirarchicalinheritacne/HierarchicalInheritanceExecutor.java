//program to demonstrate on hierarchical inheritance
package org.tnsif.heirarchicalinheritacne;
//driver class
public class HierarchicalInheritanceExecutor{

	public static void main(String[] args) {
		Tiramisu t = new Tiramisu("Realme", "Double Slot", 13 );
		//Tiramisu t = new Tiramisu(t.next(), t.next(), t.nextInt());
		SnowCone s = new SnowCone("Samsung", "Double Slot", 12 );
		System.out.println(t);
		System.out.println(s);


	}

}
