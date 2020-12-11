package com.dms.java.java8.lambda;

/**
 * @author dongms
 * @version V1.0
 * @Package com.dms.java.java8.lambda
 * @description 说明：
 * @date 2020/6/14 20:43
 */
public class Test {
    public static void main(String[] args) {
        Runnable r1 = () -> System.out.println("111");

        Thread t1 = new Thread(r1);
        t1.start();
    }
}
