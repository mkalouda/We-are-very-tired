package com.class16;

public class Task1 {

	public static void main(String[] args) {
		
		String var1 = "This is syntax";
		var1= var1.replace(" ", "");
		System.out.println(var1);
		
		System.out.println("-------------------------------------");
		
		String var2 = "fferwfwre23423423*(^*^&*%";
		var2= var2.replaceAll("[^a-z]", "");
		System.out.println(var2.length());
		
		System.out.println("-------------------------------------");
		
		String a = "Is it saturday? Is it raining? Do we have a Java Class today?";
		System.out.println(a.split("[?]").length);
	
	}

}
