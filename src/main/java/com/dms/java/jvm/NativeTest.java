package com.dms.java.jvm;

public class NativeTest {
    public static void main(String[] args) {
        Thread t1 = new Thread();
        t1.start();
        t1.start();
    }
}
