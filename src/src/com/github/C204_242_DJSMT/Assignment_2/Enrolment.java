package com.github.C204_242_DJSMT.Assignment_2;

/**
 * Association class for a student/class enrollment.
 */
public class Enrolment implements Deleteable {
	// Reference to the Student enrolled.
	public final Student enrolledStudent;
	// Reference to the class the Student is enrolled in.
	public final ClassGroup enrolledClass;
	// Length of time to store a deleted enrolment object before permanent deletion (1 Day).
	private static int deleteTimeout = 60 * 60 * 1000;

	/**
	 * Instantiates a new enrolment. Neither parameter may be null.
	 */
	public Enrolment(Student s, ClassGroup c) {
		if (s == null || c == null)
			throw new IllegalArgumentException();
		this.enrolledStudent = s;
		this.enrolledClass = c;
	}

	public boolean equals(Object obj) {
		if (obj instanceof Enrolment) {
			Enrolment enrol = (Enrolment)obj;
			return enrol.enrolledClass == this.enrolledClass && enrol.enrolledStudent == this.enrolledStudent;
		}
		return false;
	}

	public String toString() {
		return this.enrolledStudent.toString() + " enrolled in " + this.enrolledClass.toString();
	}

	public int getTimeOut() {
		return deleteTimeout;
	}
}
