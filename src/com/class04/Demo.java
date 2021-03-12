package com.class04;

import java.util.Scanner;

//shortcut to import for mac:cmd+shift+o

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("PLease enter any text");
		
		                               //captures entire text with space
		String text=scan.nextLine();   //this line capture your input from console, once you enter text must hit ENTER
		System.out.println("Text that I entered is - "+text);
 
		System.out.println("Please enter your name");
		String name=scan.next();  //captures 1 word till space
		System.out.println("Nice to meet you "+ name);
		
		System.out.println("Please enter your age");
		int age=scan.nextInt();
		
		System.out.println("My name is "+name+ " and I am "+age+ " years old");
		
		
		
	}

}
