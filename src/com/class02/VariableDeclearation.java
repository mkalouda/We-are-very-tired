package com.class02;

public class VariableDeclearation {

	public static void main(String[] args) {
		
		//1 way to create a variable
		short b=200; //create a variable and assign value
		             //declare a variable and initialized 
		
		//2 way, we declared it before initializing the variable
		int sum; //decleration happens only once
		sum=20; //initialize variable 
		
		sum=30; //reassign the value 
		
		/*
		 * int x;
		 * int y;
		 * intz;
		 * 
		 */
		int x,y,z;
		
		x=10;
		y=20;
		//z=30.9; error: type mismatch, since variable can store only int type of values
		
		System.out.println(x);
		
		int num=33;
		//we are susing value of different variable to intiialze the 
		int num2=num; //33
		System.out.println(num2); 
			
		

	}

}
