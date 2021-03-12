package com.class10;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char[] grades; 
		
		grades=new char[6];
		
		grades[0]='A';
		grades[1]='B';
		grades[2]='C';
		grades[3]='D';
		grades[4]='E';
		grades[5]='F';
		
		System.out.println(grades[1]);
		
		System.out.println("---------------Another way of creating an array---------------");
		
		char[] grade= {'A', 'B', 'C', 'D', 'E', 'F'};
		
		System.out.println(grade[5]);
		System.out.println("Number of elements in 2 array "+ grade.length);
		
		

	}

}
