package com.Aa10ii_invoke_static_method_n_variables_n_creating_object;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Demo {
	
	@Value("#{22 + 11}")
	private int x;
	
	@Value("#{2+5+56+34}")
	private int y;
	// calling static method
	@Value("#{T(java.lang.Math).sqrt(25)}")
	private double z;
	// calling static variable
	@Value("#{T(java.lang.Math).PI}")
	private double e;
	// create static object
	@Value("#{new java.lang.String('Swapnil Bamble')}")
	private String name;
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public double getZ() {
		return z;
	}
	public void setZ(double z) {
		this.z = z;
	}
	public double getE() {
		return e;
	}
	public void setE(double e) {
		this.e = e;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Demo [x=" + x + ", y=" + y + ", z=" + z + ", e=" + e + ", name=" + name + "]";
	}
	
	
	
	
	
	
	

	
}
