package com.class11;

public class Task1 {

	public static void main(String[] args) {
		
		String[][] names = {
				{"Mr", "Mrs", "Ms", "Miss"},
				{"Smith", "Jordan", "Jackson", "Obama"},	
		};
		
		System.out.println(names[0][1]+" "+ names[1][0]);
		System.out.println(names[0][0]+" "+ names[1][3]);
		System.out.println(names[0][2]+" "+ names[1][2]);
		System.out.println(names[0][3]+" "+ names[1][1]);
		
		String[][] grades = {
				{"Ali", "Jackson", "Robert", "Smith"},
				{"A", "B", "C", "D", "F"},
		};
		
		System.out.println(grades[0][0]+ " has a "+ grades[1][2]);

	}

}
