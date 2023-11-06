package com.A6_Autowiring_using_xml;

public class Emp {

	private Address address;

	public Emp() {
		
	}

	public Emp(Address address) {
		System.out.println("setting address through constructor from Emp");
		
		this.address = address;
	}


	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		System.out.println("setting address through setter method from Emp");
		this.address = address;
	}

	@Override
	public String toString() {
		return "Emp [address=" + address + "]";
	}
	 
	
	
	
	
}
