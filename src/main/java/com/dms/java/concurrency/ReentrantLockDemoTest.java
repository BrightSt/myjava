package com.dms.java.concurrency;

/**
 * 可重入锁示例,测试类
 * @author Dong
 *
 */
public class ReentrantLockDemoTest {
	//NotReentrantLockDemo lock = new NotReentrantLockDemo(); // 不可重入锁
	ReentrantLockDemo lock = new ReentrantLockDemo(); // 可重入锁
	
	public void print() throws Exception {
		lock.lock();
		doAdd();
		lock.unlock();
	}
	
	public void doAdd() throws Exception {
		lock.lock();
		System.out.println("ReentrantLock");
		lock.unlock();
	}
	public static void main(String[] args) throws Exception {
		ReentrantLockDemoTest test = new ReentrantLockDemoTest();
		test.print();

	}

}
