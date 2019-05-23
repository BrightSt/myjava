package com.dms.java.concurrency;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 
 * @author Dong
 * 要求：一个初始值为零的变量，两个线程对其交替操作，一个加1一个减1，来5轮
 * 线程     操作		资源类
 * 判断	干活		通知
 * 防止虚假唤醒机制 多线程下的判断用while:原因：
 * 如果使用if，满足条件了会在if里面就阻塞，如果被其他线程唤醒了不会再次判断，直接往下面执行了，在多线程下就有可能
 *出问题(number加到2)；如果使用while在被唤醒后，还会再次进入while的判断，保证准确性。
 * 
 */
public class ProdConsumer_TraditionDemo {
	
	public static void main(String[] args) {
		ShareData shareData = new ShareData();
		
		new Thread(()->{
			for(int i=0;i<5;i++) {
				try {
					shareData.increment();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		},"AA").start(); 
		
		new Thread(()->{
			for(int i=0;i<5;i++) {
				try {
					shareData.decrement();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		},"BB").start(); 
		
		new Thread(()->{
			for(int i=0;i<5;i++) {
				try {
					shareData.increment();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		},"CC").start(); 
		
		new Thread(()->{
			for(int i=0;i<5;i++) {
				try {
					shareData.decrement();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		},"DD").start(); 
		
	}
	
}

class ShareData{
	private int number = 0; // 多线程下为什么没有加volatile？原因是使用了lock
	private Lock lock = new ReentrantLock();
	private Condition condition = lock.newCondition();
	
	/**
	 * 增加操作
	 * @throws Exception
	 */
	public void increment() throws Exception{
		try {
			lock.lock();
			// 1.判断
			while(number != 0) {
				// 等待
				condition.await(); // 阻塞，并且释放资源
			}
			number++;
			System.out.println(Thread.currentThread().getName() + "\t" +number);
			// 3.通知唤醒
			condition.signalAll();
		} finally {
			lock.unlock();
		}
		
	}
	
	/**
	 * 减操作
	 * @throws Exception
	 */
	public void decrement() throws Exception{
		try {
			lock.lock();
			// 1.判断
			while(number == 0) {
				// 等待
				condition.await();
			}
			number--;
			System.out.println(Thread.currentThread().getName() + "\t" +number);
			// 3.通知唤醒
			condition.signalAll();
		} finally {
			lock.unlock();
		}
		
	}
}
