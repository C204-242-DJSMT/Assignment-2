package com.github.C204_242_DJSMT.Assignment_2;

/**
 * Abstract base class for all types of user.
 */
public abstract class User {
	//
	String name;

	/**
	 * Instatiates a User with a given name. Name may not be empty or null.
	 */
	public User(String name) {
		if (name == null || name == "")
			throw new IllegalArgumentException();
		this.name = name;
	}

	@Override
	public String toString() {
		return this.name;
	}
}