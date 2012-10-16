package com.github.C204_242_DJSM.Assignment_2;

/**
 *
 */
public class Enrolment implements deleteable {
	public final Student enrolledStudent;
	public final Class enrolledClass;
	private static int deleteTimeout = 1;

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
		return deleteTimeout * 60 * 60 * 1000;
	}
}
