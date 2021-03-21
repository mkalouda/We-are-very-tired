package com.class17;

public class Students {

	String studentName;
	String studentID;
	static int numberOfStudents;

	public static void main(String[] args) {

		Students Students = new Students();

		Students.studentName = "Munz";
		Students.studentID = "123";
		Students.numberOfStudents++;
		System.out.println(Students.studentID + " name " + Students.studentName + " number of students "
				+ Students.numberOfStudents);

		Students Students2 = new Students();

		Students2.studentName = "Luda";
		Students2.studentID = "1234";
		Students2.numberOfStudents++;
		System.out.println(Students2.studentID + " name " + Students2.studentName + " number of students "
				+ Students2.numberOfStudents);
		
		System.out.println(Students.numberOfStudents);
	}

}
