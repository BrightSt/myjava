package com.dms.java.design.interfacetest;

/**
 * @author dongms
 * @version V1.0
 * @Package com.dms.java.design.interfacetest
 * @description 说明：接口中是可以有默认实现方法的，关键字：default
 * @date 2020/6/16 18:51
 */
public interface SayHelloInterface {
    /**
     * 接口的default方法,实现类不实现该方法
     */
    default void sayHello(){
        System.out.println("hello");
    }

    /**
     * 接口的default方法,实现类实现该方法
     */
    default void sayHi(){
        System.out.println("HI");
    }
}
