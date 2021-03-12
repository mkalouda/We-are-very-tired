package com.class07;

public class HW {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("-------------------------sum of odd numbers from 1 to 50---------------------------");
		
		int sum=0;
		
		for (int i=1; i<50; i+=2) {
			sum +=i;
		}
		System.out.println(sum);
		
		System.out.println("-------------------------sum of Even numbers from 1 to 50---------------------------");
		
		int result=0;
		
		for (int i=2; i<=50;i+=2) {
			result+=i;
		}
		System.out.println(result);
		
		System.out.println("----------Another Way--------------");
		
		int odd=0;
		int even=0;
		
		for (int i=1; i<=50; i++) {
			
			if(i%2==0) {
				even+=i;
			}else {
				odd+=i;
			}
		}
		
		System.out.println("sum of odd numnbers from 1 to 50 "+ odd );
		System.out.println("sum of even numnbers from 1 to 50 "+ even );
	}

}
