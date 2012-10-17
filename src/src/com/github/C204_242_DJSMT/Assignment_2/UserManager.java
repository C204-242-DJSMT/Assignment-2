package com.github.C204_242_DJSMT.Assignment_2;

import java.util.LinkedList;

/**
 * Manager class for User objects.
 */
public class UserManager {
	// The single instance of the class.
	static private UserManager singleton = null;
	// List of all user objects.
	private LinkedList<User> userList = null;
	
	/**
	 * Instantiates the UserManager Object. 
	 * As UserManager is a singleton, this should not be used if an instance exists.
	 */
	private UserManager() {
		// Constructor should never be called twice.
		assert (singleton == null);
		
		this.userList = new LinkedList<User>();
	}
	
	/**
	 * Creates a new Teacher user and adds them to the list of users.
	 */
	public boolean addTeacher(String name) {
		Teacher tch = new Teacher(name);
		if (userList.contains(tch))
			return false;
		return userList.add(tch);
	}
	
	/**
	 * Creates a new Student user and adds them to the list of users.
	 */
	public boolean addStudent(String name) {
		Student sdnt = new Student(name);
		if (userList.contains(sdnt))
			return false;
		return userList.add(sdnt);
	}

	/**
	 * Returns the singleton instance UserManager.
	 */
	public static UserManager getInstance() {
		if (singleton == null)
			singleton = new UserManager();
		return singleton;
	}
	
	/**
	 * Returns true if a given object is in the list of users.
	 */
	public boolean contains(User item) {
		return this.userList.contains(item);
	}
}