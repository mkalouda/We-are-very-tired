package com.class14;

public class HW2 {
	
	boolean isprime (int num) {
		
		if (num>1) {
			
			for (int i=2; i<num; i++) {
				if (num%i==0) {
					return false;
				}else {
					return true;
				}
			}
		
		}
		
		if (num==2) {
			return true;
		}else { 
			return false;
		}
		
	}

}
