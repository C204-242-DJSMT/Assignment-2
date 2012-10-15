package com.github.C204_242_DJSMT.Assignment_2;

/**
 * Association class for a student/class enrollment.
 */
public class Enrolment implements Deleteable {
	//
	public final Student enrolledStudent;
	//
	public final Class enrolledClass;
	//
	private static int deleteTimeout = 60 * 60 * 1000;

	/**
	 *
	 */
	public Enrolment(Student s, Class c)  {
		if (s == null || c == null)
			throw new IllegalArgumentException();
		this.enrolledStudent = s;
		this.enrolledClass = c;
	}

	/**
	 * 
	 */
	public int getTimeOut() {
		return deleteTimeout;
	}

	/**
	 *
	 */
	public boolean equals(Object obj) {
		if (obj instanceof Enrolment) {
			Enrolment enrol = (Enrolment)obj;
			return enrol.enrolledClass == this.enrolledClass && enrol.enrolledStudent == this.enrolledStudent;
		}
		return false;
	}

	/**
	 *
	 */
	public String toString() {
		return this.enrolledStudent.toString() + " enrolled in " + this.enrolledClass.toString();
	}
}
