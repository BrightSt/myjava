package com.dms.java.concurrency;

/**
 * volatile 原子性测试示例
 * 不保证原子性
 * @author Dong
 *
 */
public class VolatileAtomDemo {
	
	public static void main(String[] args) {
		test();
	}
	
	private static void test() {
		Data data = new Data();
		
		for(int i=0;i<20;i++) {
			new Thread(()->{
				for(int j =0;j<1000;j++) {
					data.addOne();
				}
			}).start();  
		}
		
//		try {
//			Thread.sleep(5000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
		
		 // 默认有 main 线程和 gc 线程
        while (Thread.activeCount() > 2) {
            Thread.yield();
        }
		System.out.println(data.a);
	}
}

//class Data{
//	
//	volatile int a = 0;
//	
//	void addOne() {
//		this.a += 1;
//	}
//	
//}