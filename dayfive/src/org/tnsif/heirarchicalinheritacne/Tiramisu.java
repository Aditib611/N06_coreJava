package org.tnsif.heirarchicalinheritacne;

//child class 1
public class Tiramisu extends Android {

	//private data member
	private int version;
	
	//parameterized constructor
	public Tiramisu(String brand, String slotType, int version) {
		super(brand, slotType);
		this.version =version;
		
	}
	public int getVersion() {
		return version;
	}
	public void setVersion(int version) {
		this.version = version;
	}
	@Override
	
	public String toString() {
		return "Tiramisu [version=" + version + ", toString()=" + super.toString() + "]";
	}
	
	

}
