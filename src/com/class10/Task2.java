package com.class10;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] names;
		names = new String[4];

		names[0] = "David";
		names[1] = "Mike";
		names[2] = "Ali";
		names[3] = "Tyson";

		System.out.println(names[0]);

		System.out.println("-------------------------------------");

		
		
		String[] name = { "David", "Mike", "Ali", "Tyson" };

		System.out.println(name[0]);

		System.out.println("The amount of names are " + name.length);
		
		
		System.out.println("-------------------------------------");
		
		
		for (int i=0; i<name.length; i++) {
			System.out.println(name[i]);
		}

		
		System.out.println("---------------------------------------");

		
				
		
		String[] words = { "Java", "Saturday", "day", "coding", "is" };

		System.out.println(words[1] + " " + words[4] + " " + words[0] + " " + words[3] + " " + words[2]);

	}

}
