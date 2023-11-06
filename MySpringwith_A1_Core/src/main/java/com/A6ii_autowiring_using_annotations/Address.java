package com.A6ii_autowiring_using_annotations;

public class Address {

	private String street;
	private String city;
	
	public Address() {
		
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		System.out.println("setting street through setter method from Address");
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		System.out.println("setting city through setter method from Address");
		this.city = city;
	}
	@Override
	public String toString() {
		return "Address [street=" + street + ", city=" + city + "]";
	}
	
	
	
	
}
