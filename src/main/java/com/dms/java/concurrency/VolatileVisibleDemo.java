package com.dms.java.concurrency;

/**
 * volatile 可见性代码示例:
 * 如果a不加volatile，线程之间是不可见的。
 * 步骤为：首先在主内存里创建了data变量，Thread-0拷贝一份到自己的工作内存里，
 * 修改了a的值，但是什么时候把数据刷回到主内存是不确定的，即使刷回到主内存在main线程也是不可见的，
 * 因为main线程与Thread-0线程一样会从主内存里拷贝一份至工作内存，所以无论Thread-0如何修改
 * main工作内存里的a始终是0，所以main线程会一致循环，不会走到 “job is done”
 * 
 * 如果加了valatile，表示不同线程间对a都是可见的，Thread-0修改了，
 * 在main线程也能同步看到，所以main线程读取的a为1了，所以可以走到“job is done”
 * @author Dong
 *
 */
public class VolatileVisibleDemo {
	
	public static void main(String[] args) {
		Data data = new Data();
		new Thread(()->{
			System.out.println(Thread.currentThread().getName() + " coming ...");
			try {
				Thread.sleep(3000);
			} catch (Exception e) {
				e.printStackTrace();
			}
			data.addOne();
			System.out.println(Thread.currentThread().getName()+" updated...");
		}).start(); 
		
		while(data.a == 0 ) {
			
		}
		System.out.println(Thread.currentThread().getName() + " job is done");
	}
}

class Data{
	//int a = 0;
	volatile int a = 0;
	void addOne() {
		this.a += 1;
	}
}
