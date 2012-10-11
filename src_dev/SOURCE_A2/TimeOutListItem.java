//package com.github.C204_242_DJSM.Assignment_2;

import java.util.*;
import java.sql.Timestamp;

/**
 *
 */
class TimeOutListItem<T extends Deleteable> {
	public final T item;
	public final Timestamp timeOut;
	public final List oldLocation;

	/**
	 *
	 */
	public TimeOutListItem(T item, List old) {
		if (item == null || old == null || old.contains(item))
			throw new IllegalArgumentException();
		this.timeOut = new Timestamp(new Date().getTime() + item.getTimeOut());
		this.item = item;
		this.oldLocation = old;
	}

	/**
	 *
	 */
	public void restore() {
		this.oldLocation.add(item);
	}

	/**
	 *
	 */
	public boolean equals(Object obj) {
		if (obj.getClass() == this.item.getClass())
			return this.item == (T)obj;
		if (obj.getClass() == this.getClass())
			return this == (TimeOutListItem<T>)obj;
		return false;
	}
}