// package com.github.C204_242_DJSM.Assignment_2;

/**
 * Association class for teachers and the classes they teach.
 */
public class Teaches implements Deleteable {
	public final Teacher teacher;
	public final Class classTaught;
	private static int deleteTimeout = 1;

	/**
	 *
	 */
	public int getTimeOut() {
		return deleteTimeout * 60 * 60 * 1000;
	}

	/**
	 *
	 */
	public Teaches(Class c, Teacher t) {
		if (c == null || t == null) 
			throw new IllegalArgumentException();
		this.teacher = t;
		this.classTaught = c;
	}
}
