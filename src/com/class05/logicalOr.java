package com.class05;

public class logicalOr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* variable day 
		 * 
		 * if day is tuesday or wednesday ---> manual class
		 * if day is Monday or Friday --> no class
		 * if day is saturday or sunday --> JAVA class
		 * if day is thursday --> review class
		 * 
		 */
		
		String day="sunday";
		
		if (day.equals("monday") || day.equals("friday")) {
			System.out.println("we have no class");
		
		}else if (day.equals("tuesday") || day.equals("wednesday")) {
			System.out.println("we have manual class");
		
		}else if (day.equals("thursday")) { 
			System.out.println("we have review class");
		
		}else if (day.equals("saturday") || day.equals("sunday")) {
			System.out.println("we have JAVA class");
		
		}else {
			System.out.println(day+" is invalid");
		}
		
	}

}
