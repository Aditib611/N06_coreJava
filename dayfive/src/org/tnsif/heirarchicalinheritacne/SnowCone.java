package org.tnsif.heirarchicalinheritacne;
//child class 2
public class SnowCone extends Android{
    private int version;
	
    
	public int getVersion() {
		return version;
	}


	public void setVersion(int version) {
		this.version = version;
	}


	//parameterized constructor
	public SnowCone(String brand, String slotType, int version) {
		super(brand, slotType);
		this.version = version;
		
	}
	

}
