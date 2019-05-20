package com.dms.java.concurrency;

/**
 * 可重入锁示例
 * Reentrant [riːˈɛntrənt]的英文单词意思就是：可重入的
 * @author Dong
 *
 */
public class ReentrantLockDemo {
	
	boolean isLocked = false;
	Thread lockedBy = null;
	int lockedCount = 0;
	
	public synchronized void lock() throws Exception{
		Thread thread = Thread.currentThread();
		
		while(isLocked && lockedBy != thread) {
			wait();
		}
		
		isLocked = true;
		lockedCount++;
		lockedBy = thread;
	}
	
	public synchronized void unlock() {
		if(Thread.currentThread() == lockedBy) {
			lockedCount--;
			if(lockedCount == 0) {
				isLocked = false;
				notify();
			}
		}
	}
			
}
