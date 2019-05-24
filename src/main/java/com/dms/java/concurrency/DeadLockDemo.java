package com.dms.java.concurrency;

/**
 * 死锁是指两个或两个以上的进程在执行过程中，
 * 因争夺资源而造成的一种相互等待的现象，
 * 若无外力干涉，它们都将无法推进下去
 * 
 * 定位分析：
 * jps: ps -ef | grep XXXX
 * @author Dong
 * 
 *
 */
public class DeadLockDemo {

	public static void main(String[] args) {
		
		String lockA = "lockA";
		String lockB = "lockB";
		
		new Thread(new HoldLockThread(lockA, lockB),"lockAAA").start();
		new Thread(new HoldLockThread(lockB, lockA),"lockBBB").start();
	}
}

class HoldLockThread implements Runnable{

	private String lockA;
	private String lockB;
	
	
	public HoldLockThread(String lockA, String lockB) {
		this.lockA = lockA;
		this.lockB = lockB;
	}


	@Override
	public void run() {
		synchronized (lockA) {
			System.out.println(Thread.currentThread().getName() + "\t 自己持有:" + lockA +"\t 尝试获取："+lockB);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			synchronized (lockB) {
				System.out.println(Thread.currentThread().getName() + "获取到两把锁");
			}
		}
		
	}
	
}
