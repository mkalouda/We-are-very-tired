package com.class17;

public class LocalVarsUse {
	
	double salary = 120000;
	void PrintInfo() {
		String name= "Munz";
		System.out.println(name+ " " + salary);
	}
	
	void printSalaryPlusBonus() {
		double bonus= 5000;
		System.out.println(salary + bonus);
	}

	public static void main(String[] args) {
		
		LocalVarsUse obj = new LocalVarsUse();
		
		obj.PrintInfo();
		obj.printSalaryPlusBonus();

	}

}
