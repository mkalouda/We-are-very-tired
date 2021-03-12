package com.class03;

public class Casting {
	
	public static void main (String[] args) { 
		
		//int i=10.99; type mismatch
		
		double d=10; 
		System.out.println(d);
		
		/*CASTING IN JAVA
		 * converting a data type to another
		 * 
		 * 2 types: widening and narrowing
		 * 
		 * widening/implicit (automatically)
		 *    byte->short->int->long->float->double
		 * 
		 *   Narrowing/explicit (Manually)
		 *    double->float->long->int->short->byte 
		 */
		
		int i=(int)12.99; //potential loss of information, 
		System.out.println(i);
		
		byte b=(byte)130;  //number to big for byte
		System.out.println(b);
		
        System.out.println("------------------------------------");
		
        int cakePiece=11;
		cakePiece/=4;
		System.out.println(cakePiece);
		
		int number=12;
		double result=number/5;
		
		System.out.println(result);  //2.0
		
		double newNum=10;
		newNum/=3;
		System.out.println(newNum);  //3.3333
		
		
		
	}

}
