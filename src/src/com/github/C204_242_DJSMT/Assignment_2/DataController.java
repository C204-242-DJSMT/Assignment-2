package com.github.C204_242_DJSMT.Assignment_2;

/**
 * Single facade class facilitating a single access point to core system objects. Also acts as a mediator between the various manager classes.
 */
public class DataController {
	// References to singleton instances of manager classes.
	EnrolmentManager enrolmentManager;
	TeachingManager teachingManager;
	ClassManager classManager;
	UserManager userManager;
	// The singleton instance of DataController
	static private DataController singleton = null;

	/**
	 * Returns the singleton instance of the DataController class.
	 */
	static public DataController getInstance() {
		if (singleton == null)
			singleton = new DataController();
		return singleton;
	}

	/**
	 * Instantiates the DataController.
	 */
	private DataController() {
		// Constructor should never be called twice.
		assert (singleton == null);
		
		this.enrolmentManager = EnrolmentManager.getInstance();
		this.teachingManager = TeachingManager.getInstance();
		this.classManager = ClassManager.getInstance();
		this.userManager = UserManager.getInstance();
	}
}