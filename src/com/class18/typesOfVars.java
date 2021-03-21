package com.class18;

public class typesOfVars {
	
	String name;
	static String companyName = "Syntax";
	
	void printInfo() {
		System.out.println(name + " company " + companyName);
	}
	
	static void printcompanyInfo() {
		//System.out.println(name); can not reach
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
