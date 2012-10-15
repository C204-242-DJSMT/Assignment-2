package com.github.C204_242_DJSMT.Assignment_2;

/**
 * Association class for teachers and the classes they teach.
 */
public class Teaches implements Deleteable {
	//
	public final Teacher teacher;
	//
	public final Class classTaught;
	//
	private static int deleteTimeout = 60 * 60 * 1000;

	/**
	 *
	 */
	public int getTimeOut() {
		return deleteTimeout;
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

	/**
	 *
	 */
	public boolean equals(Object obj) {
		if (obj instanceof Teaches) }{
			Teaches t = (Teaches)obj;
			return t.teacher == this.teacher && t.classTaught == this.classTaught
		}
		return false;
	}

	/**
	 *
	 */
	public String toString() {
		return this.teacher.toString() + " teaches " + this.classTaught.toString();
	}
}
