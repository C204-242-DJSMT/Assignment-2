package com.github.C204_242_DJSMT.Assignment_2;

/**
 * Represents a class of students or similar teaching group.
 */
public class ClassGroup {
	// The (unique) identifier for this ClassGroup.
	String name;
	// Arbitrary description of the class - a course description or similar.
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
	
	@Override
	public String toString() {
		return this.name;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof ClassGroup)
			return ((ClassGroup)obj).name == this.name;
		return false;
	}
}
