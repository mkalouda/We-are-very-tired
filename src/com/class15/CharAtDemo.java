package com.class15;

public class CharAtDemo {

	public static void main(String[] args) {
		
		String name = "Rafeeq";
		System.out.println(name.charAt(0));
		
		int sum=0;
		
		for (int i=0; i<name.length(); i++) {
			
			if (name.charAt(i)=='e') {
				System.out.println("e is found");
				
				sum++;
			}
		}
		System.out.println(sum+ " e's is found");

	}

}
