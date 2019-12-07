package com.dms.java.common;

/**
 * String 理解
 * @author Dong
 *
 */
public class StringDemo {

	public static void main(String[] args) {
		StringDeeper();
		
		String a = "1565167";
		System.out.println(   a = a.substring(0,3)+"****"+a.substring(7));
	}
	
	/**
	 * 对于String的intern()方法的深入理解
	 * intern方法介绍：intern()方法的作用是：返回常量池中的某字符串，如果常量池中已经存在该字符串，则直接返回常量池中该对象的引用。
	 * 				     否则，在常量池中加入该对象，然后 返回引用
	 */
	public static void StringDeeper() {
		
		System.out.println("======================1");
		String s1 = new String("aaa");
		String s2 = "aaa";
		System.out.println(s1 == s2); // false 
									  //原因是：String s1 = new String("aaa");创建出来的对象存放在堆里，String s2 = "aaa"创建出来的字符串存放在常量池里。
		
		
		System.out.println("======================2");
		s1 = new String("bbb").intern();
		s2 = "bbb";
		System.out.println(s1 == s2); // true 参见intern方法介绍
		
		System.out.println("======================3");
		s1 = "ccc";
		s2 = "ccc";
		System.out.println(s1 == s2); // true 原因是：都存放在常量池中，已经有的字符串不会再创建，而是指向已有的。
		
		System.out.println("======================4");
		s1 = new String("dddd").intern();
		s2 = new String("dddd").intern();
		System.out.println(s1 == s2 ); // true 参见：intern方法介绍
		
		System.out.println("======================5");
		s1 = "ab"+"cd";
		s2 = "abcd";
		System.out.println(s1 == s2);// true
		
		System.out.println("======================6*");
		String temp = "hh";
		s1 = "a" + temp;
		// 如果调用s1.intern() 则最终返回true
		s2 = "ahh";
		System.out.println(s1 == s2); // false
		
		System.out.println("======================7");
		temp = "hh".intern();
		s1 = "a"+temp;
		s2 = "ahh";
		System.out.println(s1 == s2);// false
		
		System.out.println("======================8");
		temp = "hh".intern();
		s1 = ("a" + temp).intern();
		s2 = "ahh";
		System.out.println(s1 == s2 ); // true
		
		System.out.println("======================9");
		s1 = new String("1"); // 同时生成堆中的对象，以及常量池中1的对象，但是此时s1是指向堆中的对象的
		s1.intern(); // 常量池中的已经存在
		s2 = "1";
		System.out.println(s1 == s2); // false
		
		System.out.println("======================10");
		String s3 = new String("1") + new String("1"); // 此时生成了四个对象，常量池中“1”+2个堆中的“1”+s3指向的堆中的对象
		s3.intern(); 
		String s4 = "11";
		System.out.println(s3 == s4 ); // true 
		
		System.out.println("======================11");
		s3 = new String("2") + new String("2");
		s4 = "22";
		s3.intern();
		System.out.println(s3 == s4 ); // false
		
		
	}
	
	public static void replaceDemo() {
		String name = "江苏百盛信息科技有限公司";
		String name2 = name.substring(4).replaceAll(".", "*");
		String name3 = name.substring(0,4)+name2;
		System.out.println(name3);
	}
	
	

}
