package com.github.C204_242_DJSM.Assignment_2;

public class Enrolment {
	public final Student enrolledStudent;
	public final Class enrolledClass;

	public Enrolment(Student s, Class c)  {
		if (s == null || c == null)
			throw new IllegalArgumentException();

		this.enrolledStudent = s;
		this.enrolledClass = c;
	}
}
