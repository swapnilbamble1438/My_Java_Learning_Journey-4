package com.A5iii_using_annotations;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Example {

	private String subject;

	public Example() {
		
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		System.out.println("Setting Subject");
		
		this.subject = subject;
	}

	@Override
	public String toString() {
		return "Example [subject=" + subject + "]";
	}
	
	@PostConstruct
	public void start()
	{
		System.out.println("starting method using @PostConstruct");
	}
	
	@PreDestroy
	public void end()
	{
		System.out.println("ending method method using @PreDestroy");
	}
	
	
}
