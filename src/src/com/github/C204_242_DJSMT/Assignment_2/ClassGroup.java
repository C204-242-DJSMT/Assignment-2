package com.github.C204_242_DJSMT.Assignment_2;

/**
 * Represents a class of students or similar teaching group.
 */
public class ClassGroup {
	//
	String name;
	//
	String description;

	/**
	 * Instantiates a new Class object. 
	 */
	public ClassGroup(String name, String description) {
		if (name == null || name == "" || description == null || description == "")
			throw new IllegalArgumentException();
		this.name = name;
		this.description = description;
	}

	/**
	 *
	 */
	public String toString() {
		return this.name;
	}

	/**
	 * 
	 */
	public boolean equals(Object obj) {
		if (obj instanceof ClassGroup)
			return ((ClassGroup)obj).name == this.name;
		return false;
	}
}
