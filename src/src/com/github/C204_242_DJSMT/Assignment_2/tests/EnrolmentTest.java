package com.github.C204_242_DJSMT.Assignment_2.tests;

import junit.framework.Assert;
import org.junit.Test;
import com.github.C204_242_DJSMT.Assignment_2.Student;
import com.github.C204_242_DJSMT.Assignment_2.ClassGroup;
import com.github.C204_242_DJSMT.Assignment_2.Enrolment;

public class EnrolmentTest {
	Student testStudent = new Student("name");
	ClassGroup testClass = new ClassGroup("name", "description");
	
	@Test public void creationTest1() {
		new Enrolment(testStudent, testClass);
	}
	
	@Test (expected=IllegalArgumentException.class)
	public void creationTest2() {
		new Enrolment(null, testClass);
	}
	
	@Test (expected=IllegalArgumentException.class)
	public void creationTest3() {
		new Enrolment(testStudent, null);
	}
}
