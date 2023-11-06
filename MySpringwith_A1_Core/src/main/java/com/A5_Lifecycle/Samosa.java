package com.A5_Lifecycle;

public class Samosa {
	
	private double price;

	
	public Samosa() {
		
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		System.out.println("Setting price");
		this.price = price;
	}

	@Override
	public String toString() {
		return "Samosa [price=" + price + "]";
	}
	
	
	public void Hii()
	{
		System.out.println("init-method: Inside Hii method");
	}
	
	public void Bye()
	{
		System.out.println("destroy-method: Inside Bye method");
	}
	

}
