package org.tnsif.ioc;

public class Address {
	private int addressId;
	private String city;
	private String state;
	
	public int getAddressId() {
		return addressId;
	}
	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	Address(int addressId, String city, String state) {
		super();
		this.addressId = addressId;
		this.city = city;
		this.state = state;
	}
	@Override
	public String toString() {
		return "Address [addressId=" + addressId + ", city=" + city + ", state=" + state + "]";
	}
	
}
