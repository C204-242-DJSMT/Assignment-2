package com.github.C204_242_DJSMT.Assignment_2;

/**
 * Interface inherited by objects that can be deleted from the system but stored temporarily in case of a restoration request.
 */
interface Deleteable {

	/**
	 * Returns the length of time (in hours) that instances of implemeeting class should be
	 * kept before deletion.
	 */
	public int getTimeOut();
}