package com.dms.java.concurrency;

import java.util.concurrent.atomic.AtomicReference;

/**
 * 原子引用使用示例
 * @author Dong
 *
 */
public class AtomicReferenceDemo {
	
	public static void main(String[] args) {
		User zs = new User("zs", 18);
		User ls = new User("ls", 22);
		
		AtomicReference<User> atomicReference = new AtomicReference<>();
		atomicReference.set(zs);
		System.out.println(atomicReference.compareAndSet(zs, ls));
		System.out.println(atomicReference.get());
		
	}
}

class User {
	private String name;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public User(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + "]";
	}
	
	
}
