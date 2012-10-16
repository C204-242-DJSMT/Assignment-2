package com.github.C204_242_DJSMT.Assignment_2.tests;

import junit.framework.Assert;

import org.junit.Test;

public class TeachingManagerTest {
	// Check that only one instance of a singleton class is created.
		@Test public void singletonTest() {
			Assert.assertTrue(TeachingManager.getInstance() == TeachingManager.getInstance());
		}
}
