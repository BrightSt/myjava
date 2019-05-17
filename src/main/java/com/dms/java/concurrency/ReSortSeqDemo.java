package com.dms.java.concurrency;

/**
 * 指令重排序的例子
 * 如果两个线程同时执行，method01 和 method02 如果线程 1 执行 method01 重排序了，
 * 然后切换的线程 2 执行 method02 就会出现不一样的结果。
 * @author Dong
 *
 */
public class ReSortSeqDemo {
	
	int a = 0;
	boolean flag = false;
	
	public void method1() {
		a=1;
		flag = true;
	}
	
	public void method2() {
		if(flag) {
			a = a+3;
			System.out.println("a= "+a);
		}
	}
	
	public static void main(String[] args) {
		ReSortSeqDemo demo = new ReSortSeqDemo();
		
		new Thread(()->{
			demo.method1();
		}).start();
		
		new Thread(()->{
			demo.method2();
		}).start();; 
	}

}
