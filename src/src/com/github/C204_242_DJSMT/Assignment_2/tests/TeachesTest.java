package com.github.C204_242_DJSMT.Assignment_2.tests;

import junit.framework.Assert;

import org.junit.Test;

import com.github.C204_242_DJSMT.Assignment_2.Teacher;
import com.github.C204_242_DJSMT.Assignment_2.ClassGroup;
import com.github.C204_242_DJSMT.Assignment_2.Teaches;

public class TeachesTest {
	Teacher testTeacher = new Teacher("name");
	ClassGroup testClass = new ClassGroup("name", "description");
	
	@Test public void creationTest1() {
		new Teaches(testClass, testTeacher);
	}
	
	@Test (expected=IllegalArgumentException.class)
	public void creationTest2() {
		new Teaches(null, testTeacher);
	}
	
	@Test (expected=IllegalArgumentException.class)
	public void creationTest3() {
		new Teaches(testClass, null);
	}
}
