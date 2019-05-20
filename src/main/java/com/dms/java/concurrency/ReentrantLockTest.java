package com.dms.java.concurrency;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * ReentrantLock 是可重入锁(从名字上也能看出来)
 * @author Dong
 *
 */
public class ReentrantLockTest {

	public static void main(String[] args) {
		ReentrantLockTest test = new ReentrantLockTest();
		test.print();

	}
	
	private Lock lock = new ReentrantLock();
	
	private void print() {
		lock.lock();
		doAdd();
		lock.unlock();
	}

	private void doAdd() {
		lock.lock();
		lock.lock();
		System.out.println("doAdd....");
		lock.unlock();
		lock.unlock();
		
	}

}
