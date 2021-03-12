package com.class10;

public class HW1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] cars;
		
		cars= new String[6];
		
		cars[0]="BMW";
		cars[1]="Toyota";
		cars[2]="Honda";
		cars[3]="Mercedes";
		cars[4]="Porsche";
		cars[5]="Audi";
		
		System.out.println(cars[0]+" "+cars[1]+" "+cars[2]+" "+cars[3]+" "+cars[4]+" "+cars[5]);
		
		for (int i=0; i<cars.length; i++) {
			System.out.print(cars[i]+" ");
		} System.out.println();
		
		System.out.println("------------------------------------------------------------------------------");
		
		String[] car= {"BMW", "Toyota", "Honda", "Mercedes","Porsche", "Audi"};
		
		for(String vehicle:car) {
			System.out.print(vehicle+" ");
		}
		System.out.println();
		

	}

}
