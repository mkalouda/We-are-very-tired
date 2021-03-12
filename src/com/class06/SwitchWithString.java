package com.class06;

import java.util.Scanner;

public class SwitchWithString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* we need to identify favorite food
		 * 
		 * we need to capture country from user
		 * based on the country identify fav food
		 * 
		 */
		
		Scanner input;
		String country, food;
		
		input=new Scanner(System.in);
		
		System.out.println("Please enter your country");
		country=input.nextLine();
		
		switch(country.toLowerCase()) {
		
		case "usa":
			food="burger";
			break;
		case "afghanistan":
			food="kabob";
			break;
		case "vietnam":
			food="Pho";
			break;
		case "poland":
			food="Pierogi";
			break;
		case "kazakstan":
			food="Horse";
			break;
		case "belarus":
			food="Draniki";
			break;
		case "el salvador":
			food="Papusas";
			break;
		default:
			food="Unknown";
		
		}
		
		System.out.println("Your favorite food is "+food);

	}

}
