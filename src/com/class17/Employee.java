package com.class17;

public class Employee {

	String empID;
	double salary;
	static String CEO = "Sumair";

	public static void main(String[] args) {

		Employee Employee = new Employee();

		Employee.empID = "123";
		Employee.salary = 200000;
		System.out.println(Employee.empID + " salary " + Employee.salary + " CEO " + Employee.CEO);

		Employee Employee2 = new Employee();

		Employee2.empID = "123A";
		Employee2.salary = 150000;
		System.out.println(Employee2.empID + " salary " + Employee2.salary + " CEO " + Employee2.CEO);
	}

}
