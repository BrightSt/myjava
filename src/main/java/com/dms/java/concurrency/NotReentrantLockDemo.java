package com.dms.java.concurrency;

/**
 * 不可重入锁
 * @author Dong
 *
 */
public class NotReentrantLockDemo {

	private boolean isLocked = false;
	
	public synchronized void lock() throws InterruptedException {
		while(isLocked) {
			wait();
		}
		isLocked = true;
	}
	
	public synchronized void unlock() {
		isLocked = false;
		notify();
	}
}
