package com.class06;

public class SwitchExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* store gender using M or F
		 * based on the gender we will specify 
		 * 	if M--> male
		 * 	if F--> female
		 * 	otherwise-->not sure
		 */
		
		char gender='P';
		String spec;
		
		switch (gender) {
		
		case 'M':
			spec= "Male";
			break;
		case 'F':
			spec= "Female";
			break;
		default:
			spec="Other";
		}
		
		System.out.println("You have chosen "+ spec);
		
		/* LIMITATION:
		 * switch cannot use relational or logical operators (it simply check value)
		 * switch cannot be used with boolean or double/float values or long
		 */
		
		boolean sunny=true;
		
		if (sunny) {
			System.out.println("I am happy");
		}
		
		//switch (sunny)  cant use cuz only 2 values 
	}

}
