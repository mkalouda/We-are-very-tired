package com.class17;

public class InstanceVarDemo {
	
	String name;
	int age;
	void printInfo() {
		//if i am inside the same class and my method is not static 
		// i can use my instance variables directly 
		double salary= 120000;
		System.out.println(name + " " + age);
	}

}
