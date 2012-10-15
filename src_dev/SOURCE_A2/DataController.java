package com.github.C204_242_DJSMT.Assignment_2;

/**
 *  
 */
public class DataController {
	//
	EnrolmentManager enrolmentManager;
	//
	TeachingManager teachingManager;
	//
	ClassManager classManager;
	//
	UserManager userManager;
	//
	static private DataController singleton = null;
	//
	private static boolean running = false;

	/**
	 * Returns the singleton instance of the DataController class.
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
		// Constructor should never be called twice.
		assert (singleton == null);
		
		this.enrolmentManager = EnrolmentManager.getInstance();
		this.teachingManager = TeachingManager.getInstance();
		this.classManager = ClassManager.getInstance();
		this.userManager UserManager.getInstance();
	}

	/**
	 *
	 */
	// public void run() {
	// 	if (running)
	// 		return;
	// 	running = true;
	// 	while(true) {
	// 		synchronized(this.enrolmentManager) {
	// 			this.enrolmentManager.deleteOld()
	// 		}
	// 		synchronized(this.teachingManager) {
	// 			this.teachingManager.deleteOld();
	// 		}
	// 		try {
	// 			sleep(1000 * 60 * 60);
	// 		} catch (InterruptedException x);
	// 	}
	// }
}