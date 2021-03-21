package com.class16;

public class ReplaceAllDemo {

	public static void main(String[] args) {
		
		String var1 = "Syntax is best34343. Batch nine is great";
		System.out.println(var1.replace("34343", ""));
		System.out.println(var1.replaceAll("[0-9]", ""));
		
		String var2 = "9748327374werewrewrew";
		System.out.println(var2.replaceAll("[a-z]", ""));
		
		String var3 = "9748327374werewrewASArew";
		System.out.println(var3.replaceAll("[a-zA-Z]", ""));
		
		String var4 = "9748327374werewrewASASFrew*(&(*##$";
		System.out.println(var4.replaceAll("[^a-z]", ""));
		
		String var5 = "9748327374werewrewASASFrew*(&(*##$";
		System.out.println(var5.replaceAll("[a-zA-Z0-9]", ""));
		
		

	}

}
