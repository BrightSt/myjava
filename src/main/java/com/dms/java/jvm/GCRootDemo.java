package com.dms.java.jvm;

/**
 * 在java中，可作为GC Roots的对象：
 * 
 * 1.虚拟机栈（栈帧中的本地变量表）中引用的对象
 * 2.方法区中的类静态属性引用的对象
 * 3.方法区中常量引用的对象
 * 4.本地方法栈中JNI中引用的对象
 * @author Dong
 *
 */
public class GCRootDemo {
	
	//private static GCRootDemo2 t2;// 2.方法区中的类静态属性引用的对象
	//private static GCRootDemo3 t3 = new GCRootDemo3();//3.方法区中常量引用的对象

	public static void main(String[] args) {
		m1();

	}
	
	/**
	 * 虚拟机栈（栈帧中的本地变量表）中引用的对象
	 */
	public static void m1() {
		GCRootDemo t1 = new GCRootDemo();// 可达
		System.gc();
		System.out.println("第一次GC完成");
		
	}

}
