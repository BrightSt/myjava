package com.dms.java.jvm;

import java.util.ArrayList;
import java.util.List;

/**
 * gc overhead limit 异常演示
 * @author Dong
 *
 */
public class GCOverheadDemo {
	
	public static void main(String[] args) {
		int i = 0;
		List<Person> list = new ArrayList<Person>();
		
		try {
			while(true) {
				list.add(new Person());
				i++;
			}
		} catch (Throwable e) {
			System.out.println("*************i:"+i);
			e.printStackTrace();
			throw e;
		}
	}

}
	
class Person{
	int age ;
	String name ;
}