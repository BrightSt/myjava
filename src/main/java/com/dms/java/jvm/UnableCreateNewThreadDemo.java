package com.dms.java.jvm;

/**
 * unable create new thread 报错演示
 * @author Dong
 *
 */
public class UnableCreateNewThreadDemo {
	
	public static void main(String[] args) {
		for(int i=0; ;i++) {
			System.out.println("********i:"+i);
			
			new Thread(()->{
					try {
						Thread.sleep(Integer.MAX_VALUE); // 线程长期存活
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				},""+i).start();
		}
	}

}
