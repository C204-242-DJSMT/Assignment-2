package com.github.C204_242_DJSMT.Assignment_2;

import java.util.LinkedList;

/**
 * Manager class for User objects.
 */
public class UserManager {
	//
	static private UserManager singleton = null;
	//
	private LinkedList<User> userList = null;
	
	/**
	 *
	 */
	private UserManager() {
		// Constructor should never be called twice.
		assert (singleton == null);
		
		this.userList = new LinkedList<User>();
	}
	
	public boolean addTeacher(String name) {
		return userList.add(new Teacher(name));
	}
	
	public boolean addStudent(String name) {
		return userList.add(new Student(name));
	}

	/**
	 * Returns the singleton instance UserManager.
	 */
	public static UserManager getInstance() {
		if (singleton == null)
			singleton = new UserManager();
		return singleton;
	}
}