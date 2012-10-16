package com.github.C204_242_DJSMT.Assignment_2;

import java.util.LinkedList;

/**
 * Manager for all Class objects.
 */
public class ClassManager {
	//
	static private ClassManager singleton = null;
	//
	private LinkedList<ClassGroup> classList = null;
	
	/**
	 *
	 */
	private ClassManager() {
		// Constructor should never be called twice.
		assert (singleton == null);
		
		this.classList = new LinkedList<ClassGroup>();
	}

	/**
	 * Returns the singleton instance ClassManager.
	 */
	static public ClassManager getInstance() {
		if (singleton == null)
			singleton = new ClassManager();
		return singleton;
	}

	/**
	 *
	 */
	public boolean addClass(String name, String description) {
		ClassGroup newClass = new ClassGroup(name, description);
		if (!this.classList.contains(newClass)) {
			this.classList.add(newClass);
			return true;
		}
		return false;
	}
}