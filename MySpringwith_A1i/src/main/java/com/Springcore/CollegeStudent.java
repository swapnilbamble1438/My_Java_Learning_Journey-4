package com.Springcore;

public class CollegeStudent {
	
	private int studentId;
	private String studentName;
	private String studentAddress;
	
	
	public CollegeStudent() {
		super();
		
	}
	public CollegeStudent(int studentId, String studentName, String studentAddress) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentAddress = studentAddress;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		System.out.println("Setting studentId");
		this.studentId = studentId;
	}
	public String getStudentName() {
		
		return studentName;
	}
	public void setStudentName(String studentName) {
		System.out.println("Setting studentname");
		this.studentName = studentName;
	}
	public String getStudentAddress() {
		
		return studentAddress;
	}
	public void setStudentAddress(String studentAddress) {
		System.out.println("Setting studentAddress");
		this.studentAddress = studentAddress;
	}
	
	
	@Override
	public String toString() {
		return "CollegeStudent [studentId=" + studentId + ", studentName=" + studentName + ", studentAddress="
				+ studentAddress + "]";
	}
	
	
	
	
}
