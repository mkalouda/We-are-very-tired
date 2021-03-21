package com.class17;

public class ConvertingBetweenSBAndString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String var1 = "Moe";
		StringBuilder sb1 = new StringBuilder(var1);
		sb1.reverse();
		var1=sb1.toString();
		System.out.println(var1);
		

	}

}
