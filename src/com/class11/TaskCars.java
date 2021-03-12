package com.class11;

public class TaskCars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[][] cars= {
				{"Tesla", "Jeep", "Corvette"},
				{"Volkswagon", "BMW", "Audi"},
				{"Kia", "Hyundai", "Toyota"},
				{"lambo", "Maserati", "Fiat"},
		};
		
		for (int i=0; i<cars.length; i++) {
			for(int j=0;j<cars[i].length; j++) {
				System.out.print(cars[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("----------------2nd way--------------------");
		
		for (String[] car:cars) {
			for (String fast:car) {
				System.out.print(fast+" ");
			}
			System.out.println();
		}

	}

}
