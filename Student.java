package org.student;

import org.college.College;
import org.department.Department;

public class Student {

	public void studentName() {

		System.out.println("Student Name: Rajalakshmi Alagarsamy");
	}

	public void studentDept() {

		System.out.println("Student Department: Computer Science");
	}

	public void studentId() {

		System.out.println("Student ID: 3695");
	}

	public static void main(String[] args) {

		College cl = new College(); //mulilevel inheritance
		cl.collegeName(); 
		cl.collegeCode();
		cl.collegeRank();
		cl.deptName(); 
		cl.studentId(); 
		cl.studentName();
		cl.studentDept();

	}
}

