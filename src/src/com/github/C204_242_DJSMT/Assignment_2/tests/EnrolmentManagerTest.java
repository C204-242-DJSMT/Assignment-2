package com.github.C204_242_DJSMT.Assignment_2.tests;

import junit.framework.Assert;
import org.junit.Test;
import com.github.C204_242_DJSMT.Assignment_2.EnrolmentManager;
import com.github.C204_242_DJSMT.Assignment_2.Enrolment;
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
		Enrolment enrol = EnrolmentManager.getInstance().addEnrolment(s, cls);
		Assert.assertTrue(EnrolmentManager.getInstance().contains(enrol));
		Assert.assertTrue(EnrolmentManager.getInstance().delete(enrol));
		Assert.assertFalse(EnrolmentManager.getInstance().contains(enrol));
	}
}
