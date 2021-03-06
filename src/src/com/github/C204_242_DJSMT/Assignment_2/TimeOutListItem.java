package com.github.C204_242_DJSMT.Assignment_2;

import java.util.List;
import java.util.Date;
import java.sql.Timestamp;

/**
 * Stores an object, its previous location and an expiry time for the TimeOutList structure.
 */
class TimeOutListItem<T extends Deleteable> {
	// The object being stored.
	public final T item;
	// Time when this record expires and should be deleted permanantly.
	public final Timestamp timeOut;
	// Collection where item was previously stored.
	public final List oldLocation;

	/**
	 * Instantiates the TimeOutListItem with an object, its previous location and Timestamp based
	 * on that objects defined time it should be temporaily stored before permanent deletion.
	 */
	public TimeOutListItem(T item, List<T> old) {
		if (item == null || old == null)
			throw new IllegalArgumentException();
		this.timeOut = new Timestamp(new Date().getTime() + item.getTimeOut());
		this.item = item;
		this.oldLocation = old;
	}

	/**
	 * Restores the item to the list object it was previously stored in.
	 */
	public void restore() {
		this.oldLocation.add(item);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj.getClass() == this.item.getClass())
			return this.item == (T)obj;
		if (obj.getClass() == this.getClass())
			return this == (TimeOutListItem<T>)obj;
		return false;
	}
}