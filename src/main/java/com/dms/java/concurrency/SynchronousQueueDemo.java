package com.dms.java.concurrency;

import java.util.concurrent.SynchronousQueue;

/**
 *  SynchronousQueue 使用示例
 * @author Dong
 *
 */
public class SynchronousQueueDemo {
	public static void main(String[] args) {
		SynchronousQueue<Integer> synchronousQueue = new SynchronousQueue<>();
		
		new Thread(()->{
			try {
				synchronousQueue.put(1);
				Thread.sleep(3000);
				synchronousQueue.put(2);
				Thread.sleep(3000);
				synchronousQueue.put(3);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}).start(); 
		
		new Thread(()->{
			try {
				Integer val = synchronousQueue.take();
				System.out.println(val);
				
				Integer val2 = synchronousQueue.take();
				System.out.println(val2);
				
				Integer val3 = synchronousQueue.take();
				System.out.println(val3);
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}).start(); 
	}
}
