package com.class06;

import java.util.Scanner;

public class LogicalRecap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* we need to get a time
		 * based on the time we need to identify the time of the day
		 * if time is b.w 1 to 11--> morning
		 * if time is b.w 12 to 13--> noon
		 * if time is b.w 14 to 17--> afternoon
		 * if time is b.w 18 to 21---evening
		 * if time is b.w 22 to 24-->night
		 */
		
		Scanner scan;
		int time;
		String timeOfTheDay;
		
		scan=new Scanner(System.in);
		System.out.println("Please enter time in 24 hour format");
		time=scan.nextInt();
		
		if (time>=1 && time<=11) {
			timeOfTheDay="morning";
		}else if (time>=12 && time<=13) {
			timeOfTheDay="noon";
		}else if (time>=14 && time<=17) {
			timeOfTheDay="afternoon";
		}else if (time>=18 && time<=21) {
			timeOfTheDay="evening";
		}else if (time>=22 && time<=24) {
			timeOfTheDay="night";
		}else {
			timeOfTheDay="Invalid";
		}
		
		System.out.println("Based on the entered time, the time of the day is "+timeOfTheDay);
		
		/* compiler can initialize variables to their default value
		 * default value of int--> 0
		 * dafault value of double--> 0.0
		 * default value of boolean-->false
		 * default value of String and all non primitive-->null
		 */
		
		double d=10;
		System.out.println(d); //10.0

	}

}
