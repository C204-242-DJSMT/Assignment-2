package com.github.C204_242_DJSMT.Assignment_2.tests;

import junit.framework.Assert;

import org.junit.Test;

public class UserManagerTest {
	@Test public void singletonTest() {
		Assert.assertTrue(UserManager.getInstance() == UserManager.getInstance());
	}
}
