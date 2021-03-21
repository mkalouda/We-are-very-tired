package com.class17;

public class LocalVariablesDemo {
	
	void printInfo(String name) {
		System.out.println(name);
		String phoneNumber ="234234";
	}
	
	void printInfoWithAddress(String name, String address) {
		System.out.println(name + address);
		//System.out.println(phoneNumber); CE not defined
	}

	public static void main(String[] args) {
		
		String name1 ="local";
		
		for (int i=0; i<5; i++) {
			System.out.println(i);
		}
		//System.out.println(i); CE not defined
		

	}

}
