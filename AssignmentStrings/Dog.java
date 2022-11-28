package com.yash.OnlineJavaTraining.AssignmentStrings;

public class Dog {

	// WAP to demonstrate how garbage collector work when any memory is not
	// referenced by string
	// object
	public String name;

	public Dog(String name) {

		this.name = name;
	}

	
	public String toString() {
		return name;
	}

}
