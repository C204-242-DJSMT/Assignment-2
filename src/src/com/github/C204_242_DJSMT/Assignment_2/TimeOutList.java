package com.github.C204_242_DJSMT.Assignment_2;

import java.util.Date;
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
	 * @return 
	 */
	public boolean add(T item, List<?> old) {
		if (item == null || old == null || !old.contains(item))
			throw new IllegalArgumentException();
		old.remove(item);
		this.list.add(new TimeOutListItem<T>(item, (List<T>) old));
		return true;
	}

	/**
	 * Restores an item to the list object it was previously stored in.
	 */
	public void restoreItem(T item) {
		for (TimeOutListItem<T> listItem : this.list) {
			if (listItem.equals(item)) {
				listItem.restore();
				this.list.remove(listItem);
				break;
			}
		}
	}

	public boolean contains(T enrol) {
		return this.list.contains(enrol);
	}
	
	public boolean remove(T enrol) {
		return this.list.remove(enrol);
	}
	
	
}
