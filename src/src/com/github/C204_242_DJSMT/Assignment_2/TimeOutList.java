package com.github.C204_242_DJSMT.Assignment_2;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.sql.Timestamp;

/**
 * Extension of the java.util.LinkedList class uintended to store objects and an associated timestamp at 
 * which the object should be deleted. Objects stored in such a structure must implement the deleteable interface.
 */
public class TimeOutList<T extends Deleteable> {
	// The underlying LinkedList object for storing objects and related data.
	LinkedList<TimeOutListItem<T>> list;

	/**
	 * Instantiates a new, empty TimeOutList.
	 */
	public TimeOutList() {
		this.list = new LinkedList<TimeOutListItem<T>>();
	}

	/**
	* Adds an item to the list along with a reference to its previous location to allow for easy restoration of items.
	 */
	public boolean add(T item, List<T> old) {
		// Parameters may not be null and the list object provided must initially contain the item
		// being added to the TimeOutList.
		if (item == null || old == null || !old.contains(item))
			throw new IllegalArgumentException();
		// Remove the item from its previous location.
		old.remove(item);
		this.list.add(new TimeOutListItem<T>(item, old));
		return true;
	}

	/**
	 * Restores an item to the list object it was previously stored in, removing it from the TimeOutList in the process.
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
