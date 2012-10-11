//package com.github.C204_242_DJSM.Assignment_2;

/**
 *
 */
public class Teacher {
	String name;

	/**
	 *
	 */
	public Teacher(String name) {
		if (name == null || name == "")
			throw new IllegalArgumentException();
	}
}
