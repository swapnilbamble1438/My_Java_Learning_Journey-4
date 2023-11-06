package com.test;

public class Tuition {
	
	private String Name;
	private int Standard;
	private String Division;
	
	public Tuition() {}
	

	public Tuition(String name, int standard, String division) {
		super();
		Name = name;
		Standard = standard;
		Division = division;
	}





	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getStandard() {
		return Standard;
	}

	public void setStandard(int standard) {
		Standard = standard;
	}

	public String getDivision() {
		return Division;
	}

	public void setDivision(String division) {
		Division = division;
	}


	@Override
	public String toString() {
		return "Tuition [Name=" + Name + ", Standard=" + Standard + ", Division=" + Division + "]";
	}

	
	
	
	

	
}
