package com.github.C204_242_DJSM.Assignment_2;

import java.util.LinkedList;
import java.util.Date;
import java.sql.Timestamp;

public class TimeOutList<T extends deleteable> {
	LinkedList<TimeOutListItem<T>> list;

	public TimeOutList() {
		this.list = new LinkedList<TimeOutListItem<T>>();
		new TimeOutListHandler<T>(this).start();
	}

	public void add(T item) {
		if (item == null)
			throw new IllegalArgumentException();
		this.list.addLast(new TimeOutListItem<T>(item));
	}

	public void remove(TimeOutListItem<T> item) {
		if (item == null)
			throw new IllegalArgumentException();
		this.list.remove(item);
	}
}

class TimeOutListItem<T extends deleteable> {
	public final T item;
	public final Timestamp timeOut;

	public TimeOutListItem(T item) {
		if (item == null)
			throw new IllegalArgumentException();
		this.timeOut = new Timestamp(new Date().getTime() + item.getTimeOut());
		this.item = item;
	}
}

class TimeOutListHandler<T extends deleteable> extends Thread {
	TimeOutList<T> list;

	public TimeOutListHandler (TimeOutList<T> list) {
		if (list == null)
			throw new IllegalArgumentException();
		this.list = list;
	}
	public void run() {
		while(true) {
			Timestamp now = new Timestamp(new Date().getTime());
			synchronized(list) {
				for (TimeOutListItem<T> item : list.list) {
					if (item.timeOut.before(now))
						list.remove(item);
				}
			}
			try {
				sleep(1000 * 60 * 60);
			} catch (InterruptedException x) {

			}
		}
	}
}

interface deleteable {
	public int getTimeOut();
}