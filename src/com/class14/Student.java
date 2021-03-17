package com.class14;

public class Student {
	
	char getGrade( int num) {
		
		if (num>90) {
			return 'A';
		} else if (num>80) {
			return 'B';
		}else if (num>70) {
			return 'C';
		}else if (num>50) {
			return 'D';
		}else {
			return 'F';
		}
	}

}
