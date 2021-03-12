package com.class07;

public class IncrementAndDecrement {
	public static void main(String[] args) {

		int z = 10;

		z = z + 1;
		z+=1;
		System.out.println(z);
		
		z++;//adds 1 to the variable
		System.out.println(z);
		
		
		int x=20;
		x-=1;
		x--;//decrement operator--> subtract 1 from the variable
		System.out.println(x);
		
		
		//100++; will get compiler error
		
		//increment and decrement operator can be used only with variables
	}

}
