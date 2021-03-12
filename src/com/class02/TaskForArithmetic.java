package com.class02;

public class TaskForArithmetic {

	public static void main(String[] args) {
		
	float n1=9.5f;
	float n2=6.6f;
	
	float sum=n1+n2;
	float sub=n1-n2;
	float div=n1/n2;
	float mult=n1*n2;
	
	System.out.println("The sum of "+ n1+ " and "+n2+" is equal to "+sum);
	System.out.println("The subtraction of "+ n1+ " and "+n2+" is equal to "+sub);
	System.out.println("The division of "+ n1+ " and "+n2+" is equal to "+div);
	System.out.println("The multiplication of "+ n1+ " and "+n2+" is equal to "+mult);
	
	float s1=3.9f;
	
	float sq=s1*s1;
	
	System.out.println("The square of "+s1+ " is "+ sq);
	
	float w1=5f;
	float h1=8f;
	
	float per=2*(w1+h1);
	float area=w1*h1;
	
	System.out.println("The perimeter of a rectangle with width "+w1+" and height "+h1+" is equal to "+per+" and the area is "+ area);
	
	//precendence ()--> * & / ---> + & -
	int result=(10+2)*5;
	System.out.println(result);
	
	//modulus operator ---> shows remainder of the division
	int mod=10%3;
	System.out.println("Remainder is = "+mod);
	
	int mod1=10%2;
	System.out.println("Remainder is = "+ mod1);
	
	int mod2=15%4;
	System.out.println("Remainder is = "+mod2);
	
	int r=(20%7)*3;
	System.out.println(r);

	}

}
