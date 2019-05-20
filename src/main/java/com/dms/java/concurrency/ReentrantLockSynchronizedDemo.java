package com.dms.java.concurrency;

/**
 * synchronized 是可重入锁 示例
 * @author Dong
 *
 */
public class ReentrantLockSynchronizedDemo {

	private synchronized void print() {
		doAdd();
	}

	private synchronized void doAdd() {
		System.out.println("doAdd....");
	}
	
	public static void main(String[] args) {
		ReentrantLockSynchronizedDemo demo = new ReentrantLockSynchronizedDemo();
		demo.print();  //打印出：doAdd....
	}
}
