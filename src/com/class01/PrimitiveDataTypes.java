package com.class01;

public class PrimitiveDataTypes {

	public static void main(String[] args) {
		
		/*
		 * byte = data type -> what kind of values we are going to store
		 * box1 = name of the variable -> label of the box
		 * 10 = value we assigned to the variable -> values that we put inside the box 
		 */
		
		// we are storing whole numbers
		byte box1=10; //-128 till 127 
		
		short box2=100; //-32768 to 32767
		
		int box3=1000; //-2147483648 to 2147483647....most useful to whole numbers 
		
		long box4= 1000000; 
		
		//we are storing floating numbers 
		float f=12.99f; //5 to 6 decimal places 
		
		double d=12.95; // 14 to 15 places of accuracy 
		
		//we are storing single characters 
		char a='$'; 
		
		char b='A';
		
		char c='1'; 
		
		//to store boolean values
		boolean variable1=true; 
		
		boolean variable2= false; 
		
		System.out.println(d); //12.95
		System.out.println(a); //$
		
		
		System.out.println(variable1); // true 
		System.out.println("variable1"); // variable1... dictates the quoted 
	}

}
