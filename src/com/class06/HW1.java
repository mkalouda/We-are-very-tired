package com.class06;

import java.util.Scanner;

public class HW1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input;
		String country;
		String language;
		
		input=new Scanner (System.in);
		
		System.out.println("Please enter your country");
		country=input.nextLine();
		
		switch (country.toLowerCase()) {
		
		case "united states":
			language="English";
			break;
		case "mexico":
			language="Spanish";
			break;
		case "russia":
			language="Russian";
			break;
		case "brazil":
			language="Portuguese";
			break;
		case "japan":
			language="Japanese";
			break;
		case "egypt":
			language="Arabic";
			break;
		default:
			language="Unknown";
			break;
		}
		
		System.out.println("You native language is "+ language);

	}

}
