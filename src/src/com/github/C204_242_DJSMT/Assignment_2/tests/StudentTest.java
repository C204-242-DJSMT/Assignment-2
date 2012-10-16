package com.github.C204_242_DJSMT.Assignment_2.tests;

import junit.framework.Assert;

import org.junit.Test;

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
}
