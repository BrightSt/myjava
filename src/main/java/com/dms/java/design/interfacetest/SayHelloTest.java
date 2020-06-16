package com.dms.java.design.interfacetest;

/**
 * @author dongms
 * @version V1.0
 * @Package com.dms.java.design.interfacetest
 * @description 说明：
 * @date 2020/6/16 18:53
 */
public class SayHelloTest {

    public static void main (String[] args) {
        SayHelloClass sayHelloClass = new SayHelloClass();

        sayHelloClass.sayHello();

        sayHelloClass.sayHi();
    }
}
