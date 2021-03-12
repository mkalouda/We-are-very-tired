package com.class10;

public class ArrayIntro {

	public static void main(String[] args) {
		
		int [] array = new int[5];
		
		array[0]=10;
		array[1]=12;
		array[2]=15;
		array[3]=9;
		array[4]=13;
		
		System.out.println(array[0]+array[4]);
		
		double[] numbers= new double[2];
		
		numbers[0]=10;
		numbers[1]=19.01;
		
		System.out.println(numbers[0]);
		
		//Arrays are fixed in size
		
		String[] names= new String[3];
		
		names[0]="Moe";
		names[1]="Luda";
		//names[2]="yooo";
		
		System.out.println(names[2]);
		
		boolean[] hey=new boolean[3];
		
		hey[0]=true;
		hey[1]=true;
		hey[2]=false;
		
		System.out.println(hey[2]);
		
		int size=hey.length;
		System.out.println("Size of an array is "+size);

	}

}
