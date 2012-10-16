package com.github.C204_242_DJSMT.Assignment_2;

import java.util.LinkedList;

/**
 * Manager class for all teacher-class association objects.
 */
public class TeachingManager {
	// Singleton instance of TeachingManager.
	static private TeachingManager singleton = null;
	// List of all current Teaches objects.
	private LinkedList<Teaches> teachingList = null;
	// List of all recently deleted Teaches objects being stored temporarily.
	private TimeOutList<Teaches> deletedTeaching = null;
	
	/**
	 * Instantiates TeachingManager.
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
	 * Creates a new Teacher-class link, adding it to the list provided it does not already exist within the list.
	 */
	public boolean add(Teacher t, ClassGroup c) {
		Teaches newTeach = new Teaches(c, t);
		if (!this.teachingList.contains(newTeach)) {
			this.teachingList.add(newTeach);
			// If a object matching the new instance has been recently deleeted, remove that record.
			if (this.deletedTeaching.contains(newTeach))
				this.deletedTeaching.remove(newTeach);
			return true;
		}
		return false;
	}
	
	/**
	 * Adds an Teaches object to the temporary storage list.
	 * This process will cause it to be removed from the general storage list.
	 */
	public boolean delete(Teaches t) {
		// Teaches instance being deleted must be in the general list in the first place.
		if (!this.teachingList.contains(t))
			throw new IllegalArgumentException();
		return this.deletedTeaching.add(t, this.teachingList);
	}
}