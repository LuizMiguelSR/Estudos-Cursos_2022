package application; // Packpage declaration

import java.util.Scanner;

public class Student {
	private int studentId; // An import Statement for other packpages
	private String name; // Variable declarations for this class
	private String ssn;
	private double gpa;
	public final int SCHCODE = 34958; // A constant declaration

	public Student() {		
	} // fim constructor

	public Student(int i, String string, String string2, double d) {
	} // fim constructor

	public int getStudentId() { // An acessor method
		return studentId;
	} // fim do method studentId

	public void setStudentId(int x) { // A mutator method
		studentId = x;
	} // fim do method setStudentId

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	public String toString() {
		String s1 = "";
		s1 = "Student Id: " + getStudentId() + "Student Name: " + getName() + "Student SSN: " + getSsn()
				+ "Student GPA: " + getGpa();
		return s1;
	}
} // fim da classe Student
