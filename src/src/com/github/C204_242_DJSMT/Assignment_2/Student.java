package com.github.C204_242_DJSMT.Assignment_2;

/**
 * Represents an individual student user.
 */
public class Student extends User {

	public Student(String name) {
		super(name);
	}
	
	@Override
	public String toString() {
		return "Student: " + super.toString();
	}	

	@Override
	public boolean equals(Object obj) {
		return (this.name == ((User)obj).name);
	}
}
