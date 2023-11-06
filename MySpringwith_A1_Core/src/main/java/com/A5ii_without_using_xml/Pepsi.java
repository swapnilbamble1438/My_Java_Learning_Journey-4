package com.A5ii_without_using_xml;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

// using InitializingBean and DisposableBean
public class Pepsi implements InitializingBean,DisposableBean {

	private double price;
	
	public Pepsi() {
		
	}


	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		System.out.println("Setting Price");
		this.price = price;
	}


	@Override
	public String toString() {
		return "Pepsi [price=" + price + "]";
	}


	public void afterPropertiesSet() throws Exception {
		
		// we can write init method here
		
		System.out.println("taking pepsi: init-method");
		
	}


	public void destroy() throws Exception {
	
		// we can write destroy method here
		
		System.out.println("Going to put bottle back to shop : destroy-method");;
		
	}
	
	
}
