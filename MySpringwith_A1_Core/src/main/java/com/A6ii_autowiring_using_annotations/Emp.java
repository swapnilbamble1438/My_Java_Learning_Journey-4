package com.A6ii_autowiring_using_annotations;

import org.springframework.beans.factory.annotation.Autowired;

public class Emp {
	@Autowired
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
