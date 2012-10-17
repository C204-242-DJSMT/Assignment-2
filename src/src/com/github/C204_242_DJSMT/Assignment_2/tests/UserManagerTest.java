package com.github.C204_242_DJSMT.Assignment_2.tests;

import junit.framework.Assert;
import org.junit.*;
import com.github.C204_242_DJSMT.Assignment_2.UserManager;
import com.github.C204_242_DJSMT.Assignment_2.Teacher;
import com.github.C204_242_DJSMT.Assignment_2.Student;

public class UserManagerTest {
	// Check that only one instance of a singleton class is created.
	@Test public void singletonTest() {
		Assert.assertTrue(UserManager.getInstance() == UserManager.getInstance());
	}
	
	@Test public void addTeacherTest1() {
		UserManager.getInstance().addTeacher("NAME1");
		Assert.assertTrue(UserManager.getInstance().contains(new Teacher("NAME1")));
	}
	
	@Test  
	public void addTeacherTest2() {
		Assert.assertFalse(UserManager.getInstance().addTeacher("NAME1"));
	}
	
	@Test public void addStudentTest1() {
		UserManager.getInstance().addStudent("NAME1");
		Assert.assertTrue(UserManager.getInstance().contains(new Student("NAME1")));
	}
	
	@Test
	public void addStudentTest2() {
		Assert.assertFalse(UserManager.getInstance().addStudent("NAME1"));
	}

}
