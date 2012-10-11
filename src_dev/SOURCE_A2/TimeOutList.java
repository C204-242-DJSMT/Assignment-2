//package com.github.C204_242_DJSM.Assignment_2;

import java.util.*;
import java.sql.Timestamp;

/**
 *
 */
public class TimeOutList<T extends Deleteable> extends Thread {
	LinkedList<TimeOutListItem<T>> list;

	/**
	 *
	 */
	public TimeOutList() {
		this.list = new LinkedList<TimeOutListItem<T>>();
	}

	/**
	 *
	 */
	public void add(T item, List old) {
		if (item == null || old == null)
			throw new IllegalArgumentException();
		this.list.addLast(new TimeOutListItem<T>(item, old));
	}

	/**
	 *
	 */
	public void remove(TimeOutListItem<T> item) {
		if (item == null)
			throw new IllegalArgumentException();
		this.list.remove(item);
	}

	/**
	 *
	 */
	public void run() {
		while(true) {
			Timestamp now = new Timestamp(new Date().getTime());
			synchronized(this.list) {
				for (TimeOutListItem<T> item : this.list) {
					if (item.timeOut.before(now))
						this.remove(item);
				}
			}
			try {
				sleep(1000 * 60 * 60);
			} catch (InterruptedException x) {

			}
		}
	}

	/**
	 *
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
}
