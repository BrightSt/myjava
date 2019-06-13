package com.dms.java.jvm;

/**
 * JVM 参数使用举例
 * 启动后：
 * jps -l 查看进程
 * jinfo -flag 参数 进程号  查看参数值
 * @author Dong
 *
 */
public class HelloGC {
	
	public static void main(String[] args) {
		 System.out.println("=============hello gc=======");
		 //byte[] byteArray = new byte[50*1024*1024];
		 System.out.println(512*8);
	}

}
