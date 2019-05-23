package com.dms.java.concurrency;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author Dong
 * volatile/CAS/atomicInteger/BlockQueue/线程交互/原子引用
 * 比使用lock+condition的好处是：不需要程序员再去控制await signalAll了
 */
public class ProdConsumer_BlockQueueDemo {
	
	public static void main(String[] args) throws Exception {
		MyResource myResource = new MyResource(new ArrayBlockingQueue<>(10));
		
		new Thread(()->{
			System.out.println(Thread.currentThread().getName() + "\t 生产线程1启动");
			try {
				Thread.sleep(3000);
				myResource.myProd();
			} catch (Exception e) {
				e.printStackTrace();
			}
		},"prod1").start(); 
		Thread.sleep(1000);
		new Thread(()->{
			System.out.println(Thread.currentThread().getName() + "\t 生产线程2启动");
			try {
				Thread.sleep(3000);
				myResource.myProd();
			} catch (Exception e) {
				e.printStackTrace();
			}
		},"prod2").start(); 
		Thread.sleep(1000);
		new Thread(()->{
			System.out.println(Thread.currentThread().getName() + "\t 消费线程启动");
			System.out.println();
			System.out.println();
			System.out.println();
			try {
				myResource.myConsumer();
			} catch (Exception e) {
				e.printStackTrace();
			}
		},"Consumer").start(); 
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("5秒钟时间到，main线程叫停！活动结束");
		myResource.stop();
	}
}

class MyResource{
	private volatile boolean FLAG = true; // 默认开启 生产者+消费者
	private AtomicInteger atomicInteger = new AtomicInteger();
	
	// 面向接口编程
	BlockingQueue<String> blockingQueue = null;

	// 参数传接口
	public MyResource(BlockingQueue<String> blockingQueue) { 
		this.blockingQueue = blockingQueue;
		System.out.println(blockingQueue.getClass().getName());
	}
	
	public void myProd() throws Exception{
		String data = null;
		boolean retValue;
		while(FLAG) {
			data = atomicInteger.incrementAndGet()+"";
			retValue = blockingQueue.offer(data,2L,TimeUnit.SECONDS);
			if(retValue) {
				System.out.println(Thread.currentThread().getName() + "\t 插入队列"+data +"成功");
			}else {
				System.out.println(Thread.currentThread().getName() + "\t 插入队列"+data +"失败");
			}
			TimeUnit.SECONDS.sleep(1);
		}
		System.out.println(Thread.currentThread().getName() +"\t 大老板叫停了，表示FLAG=false,生产动作结束");
	}
	
	public void myConsumer() throws Exception{
		String result = null;
		while(true) {
			result = blockingQueue.poll(2L,TimeUnit.SECONDS);
			if(null == result || result.equalsIgnoreCase("")) {
				FLAG = false;
				System.out.println(Thread.currentThread().getName() + "\t 超过2秒钟没有取到蛋糕，消费退出");
				System.out.println();
				System.out.println();
				return;
			}
			System.out.println(Thread.currentThread().getName() + "\t 消费队列"+ result +"成功");
			TimeUnit.SECONDS.sleep(2);
		}
	}
	
	public void stop() {
		this.FLAG = false;
	}
	
	
}
