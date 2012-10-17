package com.github.C204_242_DJSMT.Assignment_2;

/**
 * Represents an individual teacher user.
 */
public class Teacher extends User {

	/**
	 *
	 */
	public Teacher(String name) {
		super(name);
	}
	
	@Override
	public String toString() {
		return "Teacher: " + super.toString();
	}

	@Override
	public boolean equals(Object obj) {
		return (this.name == ((User)obj).name);
	}
}
