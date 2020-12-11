package com.dms.java.design.interfacetest;

/**
 * @author dongms
 * @version V1.0
 * @Package com.dms.java.design.interfacetest
 * @description 说明：
 * @date 2020/6/16 18:52
 */
public class SayHelloClass implements SayHelloInterface{

    @Override
    public void sayHi () {
        System.out.println("HI  HI ");
    }
}
