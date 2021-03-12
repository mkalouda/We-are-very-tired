package com.class06;

public class SwitchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int day = 4;
		String weekDay;

		if (day == 1) {
			weekDay= "Monday";
		} else if (day == 2) {
			weekDay= "Tuesday";
		} else if (day == 3) {
			weekDay= "Wednesday";
		} else if (day == 4) {
			weekDay= "Thursday";
		} else if (day == 5) {
			weekDay= "Friday";
		} else if (day == 6) {
			weekDay= "Saturday";
		} else if (day == 7) {
			weekDay= "Sunday";
		} else {
			weekDay= "Invalid";
		}
		
		if (!weekDay.equals("Invalid")) {
			
			System.out.println("Today is "+ weekDay);
			
		}
		
		System.out.println("-----------------using Switch------------------");
		
		/* Switch syntax
		 * switch (variable){
		 * 		case value:
		 * 			code....
		 * 			break;
		 * 		case value1
		 * 			code....
		 * 			break;       need to break to stop and get out of switch statement
		 * }
		 * 
		 * 
		 * WE CAN NOT HAVE DUPLICATE CASES
		 * VALUES MUST MATCH VARIABLE TYPE
		 * WE MUST HAVE BREAK IN EVERY CASE
		 */
		
		String weekDay1;
		
		switch(day) { //it is value based
		
		//jumps to matching case
		case 1:
			weekDay1 = "Monday";
			break;
		case 2:
			weekDay1= "Tuesday";
			break;
		case 3:
			weekDay1= "Wednesday";
			break;
		case 4:
			weekDay1= "Thursday";
			break;
		case 5:
			weekDay1= "Friday";
			break;
		case 6:
			weekDay1= "Saturday";
			break;
		case 7:
			weekDay1= "Sunday";
			break;
		default:
			weekDay1= "Invalid";
			break;  //wouldnt need it since the default is last, if its any other location will need break
		}	
			if (!weekDay1.equals("Invalid")) {
				
				System.out.println("Today is "+ weekDay1);
			}	
		
			
	}
				
}

