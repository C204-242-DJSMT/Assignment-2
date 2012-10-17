package com.github.C204_242_DJSMT.Assignment_2.tests;

import junit.framework.Assert;

import org.junit.Test;

import com.github.C204_242_DJSMT.Assignment_2.TeachingManager;
import com.github.C204_242_DJSMT.Assignment_2.Teacher;
import com.github.C204_242_DJSMT.Assignment_2.ClassGroup;
import com.github.C204_242_DJSMT.Assignment_2.Teaches;

public class TeachingManagerTest {
	// Check that only one instance of a singleton class is created.
	@Test public void singletonTest() {
		Assert.assertTrue(TeachingManager.getInstance() == TeachingManager.getInstance());
	}
	
	@Test public void createDeleteTest() {
		Teacher t = new Teacher("Blah");
		ClassGroup cls = new ClassGroup("Blah", "blah2");
		Teaches te = TeachingManager.getInstance().add(t, cg);
		Assert.assertTrue(TeachingManager.getInstance().contains(te));
		Assert.assertTrue(TeachingManager.getInstance().delete(te));
		Assert.assertFalse(TeachingManager.getInstance().contains(te));
	}
}
