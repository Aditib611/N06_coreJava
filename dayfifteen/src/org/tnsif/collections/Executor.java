/*program to demonstrate heterogeneous(different) lists*/
package org.tnsif.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class Executor {

	@SuppressWarnings({ "rawtypes", "unchecked" })//it provide information to compiler 
	public static void main(String[] args) {
		List listOne = new ArrayList();
		listOne.add(10);
		listOne.add("Hello");
		listOne.add(67.80f);
		listOne.add(false);
		listOne.add(new Date());
		System.out.println(listOne);
		Collections.sort(listOne);
		
	}

}
