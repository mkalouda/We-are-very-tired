package com.class15;

public class StudentTester {

	public static void main(String[] args) {
		
		Student student = new Student();
		
		student.name = "Munz";
		student.age = 25;
		student.studentID = "BP123";
		student.schoolName = "Syntax";
		student.study();
		student.payTuition();
		
		Student student2 = new Student();
		student2.name = "Luda";
		student2.age = 20;
		student2.studentID = "BP124";
		student2.schoolName = "Syntax";
		student2.study();
		student2.payTuition();

	}

}
