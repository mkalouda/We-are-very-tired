package com.class10;

public class AllElementsUsingAdvancedForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//for each, enhanced for loop, advanced for loop USED ONLY WITH ARRAYS!! OR COLLECTIONS
		
		int[] numbers= {10, 14, 78, 5, 90, 76};
		
		for(int num:numbers) {
			
			if(num%2==0) {
				System.out.print(num+" ");
			}
			
		}
		System.out.println();
		
		System.out.println("------------------------------------------------------------------");
		
		String[] name = { "David", "Mike", "Ali", "Tyson" };
		
		for(int i=0; i<name.length; i++) {
			System.out.print(name[i]+" ");
		}
		System.out.println();
		
		System.out.println("------------------------------------------------------------------");
		
		for(String n:name) {
			System.out.print(n+" ");
		}
		System.out.println();
		
		System.out.println("------------------------------------------------------------------");
		
		char[] grade= {'A', 'B', 'C', 'D', 'E', 'F'};
		
		for(char school:grade) {
			System.out.print(school+" ");
		}
		System.out.println();
		
		System.out.println("------------------------------------------------------------------");
		
		boolean[] boo= {true, false, true, true, false, true};
		
		for(boolean b:boo) {
			System.out.print(b+" ");
		}

	}

}
