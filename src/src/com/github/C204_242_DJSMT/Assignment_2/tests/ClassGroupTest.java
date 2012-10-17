package com.github.C204_242_DJSMT.Assignment_2.tests;

import junit.framework.Assert;

import org.junit.Test;

import com.github.C204_242_DJSMT.Assignment_2.ClassGroup;

public class ClassGroupTest {
		
	@Test
	public void creationTest1() {
		new ClassGroup("Name");
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void creationTest2() {
		new ClassGroup("");
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void creationTest3() {
		new ClassGroup(null);
	}

	@Test public void equalityTest1() {
		Assert.assertTrue(new ClassGroup("Name").equals(new ClassGroup("Name")));
	}

	@Test public void equalityTest2() {
		Assert.assertFalse(new ClassGroup("Name").equals(new ClassGroup("Different Name")));
	}
}
