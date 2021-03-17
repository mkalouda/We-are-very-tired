package com.class15;

public class StringDemo1 {

	public static void main(String[] args) {
		
		String name= "Munz";  //mostly used since shorter
		String name1= new String("Munz");
		
		System.out.println(name);
		
		//Length-> number of characters in a string object
		System.out.println(name.length());
		
		name="    Munzz";
		int len=name.length();
		System.out.println(len);

	}

}
