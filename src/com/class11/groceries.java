package com.class11;

public class groceries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[][] groceries= {
				{"Broccoli", "Cucumber", "Pepper", "Asparagus"},
				{"Mango", "Pineapple", "Apple", "Orange"},
				{"Milk", "Yogurt", "Creamer", "Eggs"},
				{"Chocolate", "Ice Cream", "Snickers", "Brownie"},
				
		};
		
		for (int i=0;i<groceries.length;i++) {
			for (int j=0; j<groceries[i].length; j++) {
				System.out.print(groceries[i][j]+" ");
			} 
			System.out.println();
		}
		
		System.out.println("----------------another way-----------------");
		
		for (String[] grocery:groceries) {
			for(String food:grocery) {
				System.out.print(food+" ");
			}
			System.out.println();
		}

	}

}
