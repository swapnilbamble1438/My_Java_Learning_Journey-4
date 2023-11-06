package com.A1_Springcore;
public class Friend {

	private int Mobileno;
	private String Name;
	private String Address;
	
	public Friend() {
		
	}

	public Friend(int mobileno, String name, String address) {
		super();
		Mobileno = mobileno;
		Name = name;
		Address = address;
	}

	public int getMobileno() {
		return Mobileno;
	}

	public void setMobileno(int mobileno) {
		Mobileno = mobileno;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	@Override
	public String toString() {
		return "Friend [Mobileno=" + Mobileno + ", Name=" + Name + ", Address=" + Address + "]";
	}
	
	
	
	
}
