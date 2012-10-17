package com.github.C204_242_DJSMT.Assignment_2.tests;

import junit.framework.Assert;
import org.junit.Test;
import com.github.C204_242_DJSMT.Assignment_2.UserManager;
import com.github.C204_242_DJSMT.Assignment_2.Teacher;
import com.github.C204_242_DJSMT.Assignment_2.Student;

public class UserManagerTest {
	// Check that only one instance of a singleton class is created.
	@Test public void singletonTest() {
		Assert.assertTrue(UserManager.getInstance() == UserManager.getInstance());
	}
	
	@Test public void addTeacherTest1() {
		UserManager.getInstance().addTeacher("NAME");
		Assert.assertTrue(UserManager.getInstance().contains(new Teacher("NAME")));
	}
	
	@Test(expected=IllegalArgumentException.class)  
	public void addTeacherTest2() {
		UserManager.getInstance().addTeacher("NAME");
	}
	
	@Test public void addStudentTest1() {
		UserManager.getInstance().addStudent("NAME");
		Assert.assertTrue(UserManager.getInstance().contains(new Student("NAME")));
	}
	
	@Test(expected=IllegalArgumentException.class)  
	public void addStudentTest2() {
		UserManager.getInstance().addStudent("NAME");
	}

}
