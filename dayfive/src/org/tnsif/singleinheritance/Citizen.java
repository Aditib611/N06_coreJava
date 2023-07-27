package org.tnsif.singleinheritance;
//base class
public class Citizen {
	
	//private data members
	private int pincode;
	private String city;
	private String area;
	private long adharNo;
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public long getAdharNo() {
		return adharNo;
	}
	public void setAdharNo(long adharNo) {
		this.adharNo = adharNo;
	}
	@Override
	public String toString() {
		return "Citizen [pincode=" + pincode + ", city=" + city + ", area=" + area + ", adharNo=" + adharNo + "]";
	}
	
	//default constructor
	public Citizen() {
	System.out.println("Citizen-Parent Class");
	}
	
	//parameterized constructor
	public Citizen(int pincode, String city, String area, long adharNo) {
		super();
		this.pincode = pincode;
		this.city = city;
		this.area = area;
		this.adharNo = adharNo;
	}
	
	
	

}
