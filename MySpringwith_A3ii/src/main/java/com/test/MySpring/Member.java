package com.test.MySpring;

public class Member {
	private int mid;
	private String mname;
	private int msalary;
	
	public Member() {}

	@Override
	public String toString() {
		return "Member [mid=" + mid + ", mname=" + mname + ", msalary=" + msalary + "]";
	}
	
	public Member(int mid, String mname, int msalary) {
		super();
		this.mid = mid;
		this.mname = mname;
		this.msalary = msalary;
	}



	public int getMid() {
		return mid;
	}


	public void setMid(int mid) {
		this.mid = mid;
	}


	public String getMname() {
		return mname;
	}


	public void setMname(String mname) {
		this.mname = mname;
	}


	public int getMsalary() {
		return msalary;
	}


	public void setMsalary(int msalary) {
		this.msalary = msalary;
	}
	
	
	
	
}
