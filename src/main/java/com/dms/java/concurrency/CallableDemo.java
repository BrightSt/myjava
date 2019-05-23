package com.dms.java.concurrency;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * 
 * @author Dong
 * Callable 使用示例
 * fork join 拆分->汇总
 *
 */
public class CallableDemo {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		FutureTask<Integer> futureTask = new FutureTask<>(new MyThread());
		
		new Thread(futureTask,"AA").start();
		new Thread(futureTask,"BB").start();// 不会进入同一个MyThread对象，会复用结果
		// int result02 = futureTask.get(); // 如果直接放在start后面，会阻塞main线程的执行，会等出来结果后往下执行。
		
		int result01 = 100;
		int result02 = futureTask.get();// 建议放在最后  原因是：这样就不会阻塞main线程的执行。  
		
		System.out.println("*****result:" + (result01+result02));
	}

}

class MyThread implements Callable<Integer>{

	@Override
	public Integer call() throws Exception {
		System.out.println("coming in callable...");
		return 1024;
	}
	
}