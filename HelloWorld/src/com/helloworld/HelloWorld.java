package com.helloworld;

import java.util.List;

public class HelloWorld implements Greeter {
	
	String name;
	
	public void setNames(String name) {
		this.name=name;	
	}

	public String getGreeting() {
		return "Hello world from " + name;
	}
	
}
