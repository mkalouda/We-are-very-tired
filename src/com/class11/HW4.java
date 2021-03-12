package com.class11;

public class HW4 {

	public static void main(String[] args) {
		/*Create 2D array of countries: north america countries, south america countries, europe countries, asian countries, african countries. 
		 * Then print all values from that array using 2 different loops and calculate how many total countries have been stored.
		 */
		
		int sum=0;
		String[][] countries= {
				
				{"Canada", "USA", "Mexico"},
				{"Brazil", "Argentina", "Peru", "Guatamala", "Bolivia"},
				{"Spain", "UK", "Italy","Netherlands", "France"},
				{"China", "Japan", "Thailand", "India"},
				{"Egypt", "Sudan", "Ghana", "Ethiopia", "Morocco", "Jordan", "South Africa"},
		};
		
		for (int i=0; i<countries.length; i++) {
			for (int j=0; j<countries[i].length; j++) {
				System.out.print(countries[i][j]+"  ");
			}
			System.out.println();
		}
		
		
		System.out.println("-------------------------------------------------------------------------------");
		
		for(String[] country:countries) {
			for(String c:country) {
				System.out.print(c+"  ");
			}
			System.out.println();
		}
		
		System.out.println("-------------------------------------------------------------------------------");
		
		for(int i=0;i<countries.length; i++) {
			sum+=countries[i].length;
		}
		System.out.println("The sum of all the countries are "+sum);
		
	}

}
