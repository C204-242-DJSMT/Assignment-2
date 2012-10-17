package com.github.C204_242_DJSMT.Assignment_2.tests;

import junit.framework.Assert;
import org.junit.Test;
import com.github.C204_242_DJSMT.Assignment_2.Student;

public class StudentTest {
	
	@Test
	public void creationTest1() {
		new Student("Name");
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void creationTest2() {
		new Student("");
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void creationTest3() {
		new Student(null);
	}

	@Test public void equalityTest1() {
		Assert.assertTrue(new Student("Name").equals(new Student("Name")));
	}

	@Test public void equalityTest2() {
		Assert.assertFalse(new Student("Name").equals(new Student("Different Name")));
	}
}
