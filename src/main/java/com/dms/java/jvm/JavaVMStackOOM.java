package com.dms.java.jvm;

/**
 * 创建线程导致内存溢出异常
 * VM Args:-Xss2m
 * @author Dong
 *
 */
public class JavaVMStackOOM {
	
	private void dontStop() {
		while(true) {
			
		}
	}
	
	public void stackLeakByThread() {
		while(true) {
			Thread thread = new Thread(new Runnable() {
				
				@Override
				public void run() {
					dontStop();
					
				}
			});
			thread.start();
		}
	}

	public static void main(String[] args) {
		JavaVMStackOOM oom = new JavaVMStackOOM();
		oom.stackLeakByThread();
	}

}
