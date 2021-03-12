package com.class03;

public class RelationalOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* relational operator 
		 * >,>=,<,<=,==,!=
		 */
		
		int a=10;
		int b=7;
		
		System.out.println(a>b);
		System.out.println(a<b);
		System.out.println(a==b);
		System.out.println(a!=b);  //!=is not equal
		
		System.out.println("---------------------------------");
		
		boolean result=a>=b;
		boolean result1=a<=b;
		System.out.println(result);
		System.out.println(result1);
		
		System.out.println("-----------------------------------");
		
		int c=20;
		int d=29;
		System.out.println(c==d);  //Checking equality 
		System.out.println(c=d);  // assigning the value of c to d
		System.out.println(c);
		

	}

}
