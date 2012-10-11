//package com.github.C204_242_DJSM.Assignment_2;

/**
 *
 */
public class DataController {
	EnrolmentManager enrolmentManager;
	static private DataController singleton = null;

	/**
	 *
	 */
	static public DataController getInstance() {
		if (singleton == null)
			singleton  new DataController();
		return singleton;
	}

	/**
	 *
	 */
	private DataController() {
		enrolmentManager = EnrolmentManager.getInstance();
	}
}