package com.github.C204_242_DJSM.Assignment_2;

public class Teaches implements deleteable {
	private static int deleteTimeout = 1;

	public int getTimeOut() {
		return deleteTimeout * 60 * 60 * 1000;
	}
}
