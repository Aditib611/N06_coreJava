package org.tnsif.interfacekeyword;
//driver class
public class InterfaceExecutor {

	public static void main(String[] args) {
		//we can't instantiate an interface
		//Sony s = new Sony();
		SonySab s1 = new SonySab();
		s1.display();
		s1.show();  //default method
	    Sony.accept();   //interface.method_name for static method
	    
	    ISRO i = new ISRO();
	    i.status();
	    
	    Human h = new Human();
	    h.showDrink();
	}

}
