package com.github.C204_242_DJSMT.Assignment_2;

import java.util.LinkedList;

/**
 * Manager class for all student-class enrollment association objects.
 */
public class EnrolmentManager {
	//
	static private EnrolmentManager singleton = null;
	//
	private LinkedList<Enrolment> enrolments = null;
	//
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
	 *
	 */
	private EnrolmentManager() {
		// 
		assert (singleton == null);

		this.enrolments = new LinkedList<Enrolment>();
		this.deletedEnrolments = new TimeOutList<Enrolment>();
	}

	/**
	 *
	 */
	public boolean addEnrolment(Student s, ClassGroup c) {
		Enrolment enrol = new Enrolment(s, c);
		if (!this.enrolments.contains(enrol)) {
			this.enrolments.add(enrol);
			if (this.deletedEnrolments.contains(enrol))
				this.deletedEnrolments.remove(enrol);
			return true;
		}
		return false;
	}

	/**
	 *
	 */
	public boolean delete(Enrolment enrol) {
		return this.deletedEnrolments.add(enrol, this.enrolments);
	}
}