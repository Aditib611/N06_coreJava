package org.tnsif.Map;
/*sorted*/
import java.util.Hashtable;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<String, String> persons = new TreeMap<String, String>();	
	    persons.put("aditi@gmail.com", "Aditi");
	    persons.put("niti@gmail.com", "Niti");
	    persons.put("riya@gmail.com", "Riya");
	    persons.put("sanskruti@gmail.com", "Sanskruti ");
	    
	    System.out.println(persons);
	   // persons.put(null,  "abc");//we cannot insert null key but null value are allowed 
		  System.out.println(persons);
	}

}
