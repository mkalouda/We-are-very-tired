package com.class11;

public class AllValuesFrom2DArray {

	public static void main(String[] args) {
		
		String[][] usa= {
				{"Alexandria", "Oakton", "Arlington", "Virginia Beach", "Fairfax"},
				{"Philadelphia", "Pitt", "Strassburg"},
				{"Boston", "Quincy", "Springfield", "Burlington"},
				{"Los Angeles", "Long Beach", "San Francisco", "San Diego", "Sacramento"},
				{"Miami", "Orlando", "Tampa", "Tallahasee"},
		};
		
		System.out.println(usa.length); //5 rows or total single arrays
		System.out.println(usa[1].length); //3 elements in 2nd array 
		
		for (int i=0;i<usa.length; i++) {
			for (int j=0; j<usa[i].length; j++) {
				System.out.print(usa[i][j]+",  ");
			}
			System.out.println();
		}
		
		System.out.println("------using nested loop----------------");
		
		for (String[] state:usa) {
			
			for(String cities:state) {
				
				System.out.print(cities+", ");
			}
			System.out.println();
		}

	}

}
