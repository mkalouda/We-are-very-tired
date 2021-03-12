package com.class04;

public class NestedIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*NESTED IF
		 * if (true) {
		 *    if (true) {
		 *    }
		 * ---if condition in another if
		 * }else {
		 * }
		 */
		
		boolean morning=true;
		
		boolean classToday=true;
		
		//checking is it morning?--> say good morning
		      // is there is class: yes -->hello classmates
		      // other wise --> will say hello my family 
		
		if(morning) {
			System.out.println("Let me check if I have class today");
			
			if(classToday) {
				System.out.println("Good morning my classmates");
				
			}else { 
				System.out.println("Good morning my family");
			}
		}
		
		System.out.println("-------------------------------------------------");
		
		
		boolean anyAllergy=true;
		boolean pollenAllergy=false;
		
		if (anyAllergy) {
			System.out.println("Lets check which allergies you have");
			
			if (pollenAllergy) {
				System.out.println("Do not get close to trees");
			}else {
				System.out.println("Ok you dont have pollen allergy");
			}
		
		}else {
			System.out.println("You are lucky not having any allergies");
		}

		System.out.println("-------------------------------------------------");

		//if it is Friday --> go to the movies, otherwise staty at home and study 
		      // if it is friday then i will check if day is 13--> if yes --> watch scary movie 
		      // if no --> watch any movie you like
		
		boolean isFriday= true;
		int day= 13;
		
		if (isFriday) {
			System.out.println("It is my movie day");
			
			if(day==13) {
				System.out.println("I will watch a scary movie");
			}else {
				System.out.println("I will watch any other movie");
			}
			
			
		}else {
			System.out.println("I will stay at home and study");
		}
		
		System.out.println("-------------------------------------------------");

		/* check assignment and based on score we display a message
		 * 
		 */
		
		boolean completed=true;
		int score=71;
		
		if (completed) {
			
			if (score>90) {
			System.out.println("Great job");
			}else if (score>80) {
				System.out.println("Good job");
			}else if (score>70) {
				System.out.println("Good, but lets try to do better");
			}else {
				System.out.println("Good for trying, but study more!!!");
			}
			
		}else {
			System.out.println("Please make sure to complete assignmnets on time");
		}
	}

}
