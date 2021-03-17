package com.class15;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String userName = "";
		String password = "";
		String confirmedPassword="";
		
		System.out.println("Please enter your username and passwod");
		userName = scan.next();
		password = scan.next();
		confirmedPassword = scan.next();
		
		if(userName.isEmpty() || password.isEmpty()) {
			
			System.out.println("Username and Password cannot be empty");
		
		}else if( password.length()<8) {
			
			System.out.println("Password is too short");
		
		}else if (password.equals(userName)) {
			
			System.out.println("Password cannot contain username");
		
		}else if (!password.equals(confirmedPassword)) {
			
			System.out.println("Passwords do not match");
		
		}else {
			
			System.out.println("Your username and password has been created");
		}

	}

}
