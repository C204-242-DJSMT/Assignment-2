package com.github.C204_242_DJSMT.Assignment_2.tests;

import junit.framework.Assert;

import org.junit.Test;

public class ClassManagerTest {
	// Check that only one instance of a singleton class is created.
		@Test public void singletonTest() {
			Assert.assertTrue(ClassManager.getInstance() == ClassManager.getInstance());
		}
		
		@Test public void addtest1() {
			String name = "Class Name",desc= "Class Description";
			ClassManager.getInstance().addClass(name, desc);
			Assert.assertTrue(ClassManager.getInstance.contains(new ClassGroup(name, dec)));
		}
		
		@Test (expected=IllegalArgumentException.class)
		public void addtest2() {
			ClassManager.getInstance().addClass(null, "");
		}
}
