package com.github.C204_242_DJSMT.Assignment_2;

import java.util.LinkedList;

/**
 * Manager for all Class objects.
 */
public class ClassManager {
	// The singleton instance of ClassManager
	static private ClassManager singleton = null;
	// List containing all ClassGroup objects.
	private LinkedList<ClassGroup> classList = null;
	
	/**
	 * Instantiates the ClassManager.
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
	 * Creates a new class, adding it to the list provided it is uniqely identified.
	 */
	public boolean addClass(String name, String description) {
		ClassGroup newClass = new ClassGroup(name, description);
		if (!this.classList.contains(newClass)) {
			this.classList.add(newClass);
			return true;
		}
		return false;
	}
	
	public boolean contains(ClassGroup group) {
		return this.classList.contains(group);
	}
}