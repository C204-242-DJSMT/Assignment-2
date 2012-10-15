package com.github.C204_242_DJSMT.Assignment_2;

import java.util.LinkedList;
import java.util.List;
import java.sql.Timestamp;

/**
 *
 */
public class TimeOutList<T extends Deleteable> {
	// 
	LinkedList<TimeOutListItem<T>> list;

	/**
	 *
	 */
	public TimeOutList() {
		this.list = new LinkedList<TimeOutListItem<T>>();
	}

	/**
	 * Adds an item to the list.
	 */
	public void add(T item, List old) {
		if (item == null || old == null || !old.contains(item))
			throw new IllegalArgumentException();
		old.remove(item);
		this.list.addLast(new TimeOutListItem<T>(item, old));
	}

	/**
	 * Restores an item to the list object it was previously stored in.
	 */
	public void restoreItem(T item) {
		for (TimeOutListItem<T> listItem : this.list) {
			if (listItem.equals(item)) {
				listItem.restore();
				this.remove(listItem);
				break;
			}
		}
	}

	/**
	 * Permanantly deletes items from the list that have past their expiry time.
	 */
	void deleteOld() {
		Timestamp now = new Timestamp(new Date().getTime);
		for (TimeOutListItem listItem : this.list) {
			if (listItem.timeOut.before(now))
				this.list.remove(listItem);
		}
	}
}
