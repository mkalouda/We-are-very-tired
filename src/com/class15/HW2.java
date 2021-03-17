package com.class15;

public class HW2 {

	public static void main(String[] args) {
		
		
		String task ="whateve";
		
		if (task.isEmpty()) {
			
			System.out.println("Its empty");
		
		}else {
			
			if(task.length()%2!=0 && task.length()>3) {
				
				System.out.println(task.substring(2, 5));
			}else {
				System.out.println("doesnt meet requirement to print portion");
			}
		}

	}

}
