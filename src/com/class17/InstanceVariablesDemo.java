package com.class17;

public class InstanceVariablesDemo {
	
	int number =10;
	
	void printNumber() {
		System.out.println(number);
		String name = "Munz";
	}
	
	void printNumber2() {
		System.out.println(number);
		//System.out.println(name); 
		
	}

	public static void main(String[] args) {
		
		InstanceVariablesDemo obj = new InstanceVariablesDemo();
		System.out.println(obj.number);
		

	}

}
