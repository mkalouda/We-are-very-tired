package com.class11;

public class Prac {

	public static void main(String[] args) {
		
		int [][] grades= {
				{1, 5, 3, 9},
				{8, 4, 7, 8},
				{2, 6, 0, 1}
	};
		
		//System.out.println(grades.length);
		//System.out.println(grades[0].length);
		
		for (int i=0; i<grades.length; i++) {
			for (int j=0; j<grades[i].length; j++) {
				System.out.print(grades[i][j]+" ");
			}
			System.out.println();
		}
		
		
	}
}
