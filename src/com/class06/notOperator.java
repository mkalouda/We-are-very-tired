package com.class06;

public class notOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean rain=true;
		
		if(!rain) {
			System.out.println("I will go to the park ");
		}
		
		boolean boo=!true;
		
		System.out.println(boo); //false
		
		boolean boo1=!false;
		System.out.println(boo1); //true
		
		boolean traffic=false;
		
		if(!traffic) {
			System.out.println("I will come on time");
		}
		
		String day="monday";
		
		if(!day.equals("Friday")){
			System.out.println("Today is not friday");
		}

	}

}
