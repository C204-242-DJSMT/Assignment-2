package com.github.C204_242_DJSMT.Assignment_2.tests;

import junit.framework.Assert;
import org.junit.Test;
import com.github.C204_242_DJSMT.Assignment_2.EnrolmentManager;
import com.github.C204_242_DJSMT.Assignment_2.Student;
import com.github.C204_242_DJSMT.Assignment_2.ClassGroup;

public class EnrolmentManagerTest {
	// Check that only one instance of a singleton class is created.
	@Test public void singletonTest() {
		Assert.assertTrue(EnrolmentManager.getInstance() == EnrolmentManager.getInstance());
	}
	
	@Test public void createDeleteTest() {
		Student s = new Student("Name");
		ClassGroup cls = new ClassGroup("name", "description");
		Teaches te = TeachingManager.getInstance().add(t, cg);
		Assert.assertTrue(TeachingManager.getInstance().contains(te));
		Assert.assertTrue(TeachingManager.getInstance().delete(te));
		Assert.assertFalse(TeachingManager.getInstance().contains(te));
	}
}
