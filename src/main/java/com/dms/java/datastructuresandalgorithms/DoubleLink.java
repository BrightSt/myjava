package com.dms.java.datastructuresandalgorithms;

/**
 * 线性表：分为数组 单向链表 双向链表
 * 其中最复杂的就是双向链表，这里以双向链表为例子，进行实现。
 * 
 * @author Dong
 *
 */
public class DoubleLink<T> {

	// 表头
	private DNode<T> mHead;
	
	// 节点个数
	private int mCount;
	
	// 双向链表“节点”对应的结构体
	private class DNode<T>{
		public DNode prev;
		public DNode next;
		public T value;
		
		public DNode(T value,DNode prev,DNode next) {
			this.value = value;
			this.prev = prev;
			this.next = next;
		}
	}
	
	/**
	 * 构造方法
	 */
	public DoubleLink() {
		mHead = new DNode<T>(null, null, null);
		mHead.prev = mHead.next = mHead;
		mCount = 0;
	}
	
	private DNode<T> getNode(int index){
		if(index<0 || index>=mCount) {
			throw new IndexOutOfBoundsException();
		}
		
		// 正向查找
		if(index <= mCount/2) {
			DNode<T> node = mHead.next;
			for (int i=0;i<index;i++) {
				node = node.next;
			}
			return node;
		}
		
		// 反向查找
		DNode<T> rnode = mHead.prev;
		int rindex = mCount-index-1;
		for(int j=0;j<rindex;j++) {
			rnode = rnode.prev;
		}
		return rnode;
	}
	// 讲节点插入到第index位置之前
	public void insert(int index,T t) {
		
		// 头元素不会变
		if(index == 0) {
			DNode<T> node = new DNode<T>(t,mHead,mHead.next);
			mHead.next.prev=node;
			mHead.next=node;
			mCount++;
			return;
		}
		
		DNode<T> inode = getNode(index);
		DNode tnode = new DNode<T>(t,inode.prev,inode);
		inode.prev.next=tnode;
		inode.prev = tnode;
		mCount++;
		return;
	}
	
	
	public int size() {
		return mCount;
	}
	
	public boolean isEmpty() {
		return mCount == 0;
	}
	
	public T get(int index) {
		return getNode(index).value;
	}
	
	public T getFirst() {
		return getNode(0).value;
	}
	
	public T getLast() {
		return getNode(mCount-1).value;
	}
	
	public void insertFirst(T t) {
		insert(0,t);
	}
	
	// 讲节点追加到链表的末尾
	public void appendLast(T t) {
		DNode<T> node = new DNode<T>(t, mHead.prev, mHead);
		mHead.prev.next = node;
		mHead.prev = node;
		mCount++;
	}
	
	// 删除index位置的节点
	public void del(int index) {
		DNode<T> node = getNode(index);
		node.prev.next = node.next;
		node.next.prev = node.prev;
		node = null;
		mCount--;
	}
	
	// 删除第一个节点
	public void deleteFirst() {
		del(0);
	}
	
	// 删除最后一个节点
	public void deleteLast() {
		del(mCount-1);
	}
}
