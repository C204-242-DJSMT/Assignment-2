package com.github.C204_242_DJSMT.Assignment_2.tests;

import junit.framework.Assert;

import org.junit.Test;

import com.github.C204_242_DJSMT.Assignment_2.*;

public class TeacherTest {
	
	@Test
	public void creationTest1() {
		new Teacher("Name");
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void creationTest2() {
		new Teacher("");
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void creationTest3() {
		new Teacher(null);
	}
}
