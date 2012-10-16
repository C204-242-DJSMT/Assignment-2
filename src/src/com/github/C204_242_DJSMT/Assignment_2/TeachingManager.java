package com.github.C204_242_DJSMT.Assignment_2;

import java.util.LinkedList;

/**
 * Manager class for all teacher-class association objects.
 */
public class TeachingManager {
	//
	static private TeachingManager singleton = null;
	//
	private LinkedList<Teaches> teachingList = null;
	//
	private TimeOutList<Teaches> deletedTeaching = null;
	
	/**
	 *
	 */
	private TeachingManager() {
		// Constructor should never be called twice.
		assert (singleton == null);

		this.teachingList = new LinkedList<Teaches>();
	}

	/**
	 * Returns the singleton instance TeachingManager.
	 */
	public static TeachingManager getInstance() {
		if (singleton == null)
			singleton = new TeachingManager();
		return singleton;
	}

	/**
	 *
	 */
	public void deleteOld() {
		this.deletedTeaching.deleteOld();
	}

	/**
	 *
	 */
	public boolean add(Teacher t, Class c) {
		Teaches newTeach = new Teaches(c, t);
		if (!this.teachingList.contains(newTeach)) {
			this.teachingList.add(newTeach);
			if (this.deletedTeaching.contains(newTeach))
				this.deletedTeaching.remove(newTeach);
			return true;
		}
		return false;
	}
}