package com.dms.java.datastructuresandalgorithms;

/**
 * 双向链表测试类
 * @author Dong
 *
 */
public class DoubleLinkTest {
	
	public static void main(String[] args) {
		int_test();
		string_test();
		obj_test();
	}
	
	private static void int_test() {
		int[] iarr = {10,20,30,40};
		System.out.println("\n------int_test------");
		DoubleLink<Integer> dlink = new DoubleLink<>();
		dlink.insert(0, 20);
		dlink.appendLast(10);
		dlink.insertFirst(30);
		
		System.out.printf("isEmpty()=%b\n",dlink.isEmpty());
		System.out.printf("size=%d\n",dlink.size());
		
		for(int i=0;i<dlink.size();i++) {
			System.out.println("dlink("+i+")"+dlink.get(i));
		}
	}
	
	private static void string_test() {
		String[] sarr = {"ten","twenty","thirty","forty"};
		System.out.println("\n------string_test------");
		
		DoubleLink<String> dlink = new DoubleLink<String>();
		dlink.insert(0, sarr[1]);
		dlink.appendLast(sarr[0]);
		dlink.insertFirst(sarr[2]);
		
		System.out.printf("isEmpty()=%b\n",dlink.isEmpty());
		System.out.printf("size=%d\n",dlink.size());
		
		for(int i=0;i<dlink.size();i++) {
			System.out.println("dlink("+i+")"+dlink.get(i));
		}
	}
	
	private static class Student{
		private int id;
		private String name;
		
		public Student(int id, String name) {
			super();
			this.id = id;
			this.name = name;
		}
		
		@Override
		public String toString() {
			return "Student [id=" + id + ", name=" + name + "]";
		}

		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
	}
	
	private static Student[] students = new Student[] {
			new Student(10, "10"),
			new Student(20, "20"),
			new Student(30, "30"),
			new Student(40, "40"),
	};
	
	
	private static void obj_test() {
		System.out.println("\n------obj_test------");
		
		DoubleLink<Student> dlink = new DoubleLink<Student>();
		dlink.insert(0, students[1]);
		dlink.appendLast(students[0]);
		dlink.insertFirst(students[2]);
		
		System.out.printf("isEmpty()=%b\n",dlink.isEmpty());
		System.out.printf("size=%d\n",dlink.size());
		
		for(int i=0;i<dlink.size();i++) {
			System.out.println("dlink("+i+")"+dlink.get(i));
		}
	}

}
