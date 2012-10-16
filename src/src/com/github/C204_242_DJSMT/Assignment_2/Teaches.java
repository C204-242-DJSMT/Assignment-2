package com.github.C204_242_DJSMT.Assignment_2;

/**
 * Association class for a teacher and a class they teach.
 */
public class Teaches implements Deleteable {
	// Reference to the Teacher.
	public final Teacher teacher;
	// Reference to a class taught by the teacher.
	public final ClassGroup classTaught;
	// Length of time to store a deleted Teaches object before permanent deletion (1 Day).
	private static int deleteTimeout = 60 * 60 * 1000;

	/**
	 * Instantiates a new Teaches object. Neither parameter may be null.
	 */
	public Teaches(ClassGroup c, Teacher t) {
		if (c == null || t == null) 
			throw new IllegalArgumentException();
		this.teacher = t;
		this.classTaught = c;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Teaches) {
			Teaches t = (Teaches)obj;
			return t.teacher == this.teacher && t.classTaught == this.classTaught;
		}
		return false;
	}
	
	@Override
	public String toString() {
		return this.teacher.toString() + " teaches " + this.classTaught.toString();
	}
	
	@Override
	public int getTimeOut() {
		return deleteTimeout;
	}
}
