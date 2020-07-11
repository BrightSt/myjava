package com.dms.java.common;

/**
 * @author dongms
 * @version V1.0
 * @Package com.dms.java.common
 * @description 说明：
 * @date 2020/7/6 17:50
 */
public class NullTest {

    public static void main (String[] args) {
        checkNull(null);
    }

    public static void checkNull(String s1){
        if (s1 == null){
            System.out.println("s1 is null");
        }
    }
}

