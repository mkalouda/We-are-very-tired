package com.class05;

public class logicalOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* when i have to test 2 or more conditions we use Logical Operators
		 * 
		 * AND(&&)
		 * true &&true----> TRUE
		 * true && false-----> FALSE
		 * false && true---> FALSE
		 * false && false---> FALSE
		 * 
		 * OR(||)
		 * 
		 * true || true---> TRUE
		 * true || false--> TRUE
		 * false || true--> TRUE
		 * false || false-->FALSE
		 */
		
		/* we have to identify if number is small, medium, large, xlarge
		 * if number b/w 1 and 10 =small
		 * if number b.w 11 and 100= medium
		 * if number b.w 101 and 1000=large
		 * if number b.w 1001 and 100000=xlarge
		 */
		
		int num=10;
		
		if (num<1) {
			System.out.println("number is 0 or negative");
			
		}else if (num>=1 && num<=10) {
			System.out.println(num+" is a small number");
		
		}else if (num>=11 && num<=100) {
			System.out.println(num+" is a medium number");
		
		}else if (num>=101 && num<=1000) {
			System.out.println(num+" is a large number");
		
		}else if (num>=1001 && num<=10000) {
			System.out.println(num+" is a xlarge number");
		}
		

	}

}
