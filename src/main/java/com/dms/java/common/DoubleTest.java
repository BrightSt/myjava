package com.dms.java.common;

/**
 * @author dongms
 * @version V1.0
 * @Package com.dms.java.common
 * @description 说明：
 * @date 2020/7/8 13:05
 */
public class DoubleTest {

    public static void main (String[] args) {
        doubleTest();
    }

    /**
     * 空字符串转double异常
     */
    public static void doubleTest(){
        String str = "";
        System.out.println(Double.valueOf(str));
    }

}
