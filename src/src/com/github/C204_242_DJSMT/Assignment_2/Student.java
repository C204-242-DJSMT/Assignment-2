package com.github.C204_242_DJSMT.Assignment_2;

/**
 * Represents an individual student.
 */
public class Student extends User {
	/**
	 *
	 */
	public Student(String name) {
		super(name);
	}

	/**
	 *
	 */
	public String toString() {
		return "Student: " + super.toString();
	}	
}