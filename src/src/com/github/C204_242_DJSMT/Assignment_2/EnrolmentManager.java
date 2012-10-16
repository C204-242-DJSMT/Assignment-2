package com.github.C204_242_DJSMT.Assignment_2;

import java.util.LinkedList;

/**
 * Manager class for all student-class enrollment association objects.
 */
public class EnrolmentManager {
	// The single instance of the class.
	static private EnrolmentManager singleton = null;
	// List of all current enrolment objects.
	private LinkedList<Enrolment> enrolments = null;
	// List of deleted enrolment objects stored temporaily before permanant deletion.
	private TimeOutList<Enrolment> deletedEnrolments = null;

	/**
	 * Returns the singleton instance EnrolmentManager.
	 */
	public static EnrolmentManager getInstance() {
		if (singleton == null)
			singleton = new EnrolmentManager();
		return singleton;
	}

	/**
	 * Instantiates the EnrolmentManager.
	 */
	private EnrolmentManager() {
		// Constructor should never be called twice. 
		assert (singleton == null);

		this.enrolments = new LinkedList<Enrolment>();
		this.deletedEnrolments = new TimeOutList<Enrolment>();
	}

	/**
	 * Creates an new enrolment object, adding it to the list provided such an enrollment does not already exist.
	 */
	public boolean addEnrolment(Student s, ClassGroup c) {
		Enrolment enrol = new Enrolment(s, c);
		if (!this.enrolments.contains(enrol)) {
			this.enrolments.add(enrol);
			// If a matching enrolment has recently been deleted, remove that record of the object.
			if (this.deletedEnrolments.contains(enrol))
				this.deletedEnrolments.remove(enrol);
			return true;
		}
		return false;
	}

	/**
	 * Adds an enrollment object to the temporary storage list.
	 * This process will cause it to be removed from the general storage list.
	 */
	public boolean delete(Enrolment enrol) {
		// Enrolment instance being deleted must be in the general list in the first place.
		if (!this.enrolment.contains(enrol))
			throw new IllegalArgumentException();
		return this.deletedEnrolments.add(enrol, this.enrolments);
	}
}