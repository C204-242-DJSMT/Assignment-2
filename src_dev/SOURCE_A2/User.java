package com.github.C204_242_DJSMT.Assignment_2;

/**
 * Base class for all types of user.
 */
public abstract class User {
	//
	String name;

	/**
	 *
	 */
	public User(String name) {
		if (name == null || name == "")
			throw new IllegalArgumentException();
	}

	/**
	 *
	 */
	public String toString() {
		return this.name;
	}
}