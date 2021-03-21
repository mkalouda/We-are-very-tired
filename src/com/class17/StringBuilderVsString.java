package com.class17;

public class StringBuilderVsString {

	public static void main(String[] args) {
		
		// new object is always created
		//it is faster but could be waste of money if storing same value
		
		/*
		 * if we use the StringBuilder class no objects for the duplicate value will be scanned from the memory and always a new object will be 
		 * created inside the memory
		 * 
		 * When should we use string and stringbuilder
		 * - if we know that most of our variables will contain same values and memory utilization is important then we should use string
		 *   since it saves a lot of memory, but can be slow cuz every time
		 *   
		 *   use stringbuilder if speed is important and memory is not and string objects they contain
		 */
		
		StringBuilder sb1 = new StringBuilder("Mariam");
		StringBuilder sb2 = new StringBuilder("Mariam");
		StringBuilder sb3 = new StringBuilder("luda");
		
		System.out.println(sb1.reverse()); //this changes the value of
		System.out.println(sb1);
		
		
	
		
		

	}

}
