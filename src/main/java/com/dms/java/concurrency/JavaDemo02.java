package com.dms.java.concurrency;

/**
 * 问题排查测试类
 */
public class JavaDemo02 {
    public static void main(String[] args) {
        while (true){
            System.out.println(new java.util.Random().nextInt(77778888));
        }
    }
}
