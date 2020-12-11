package com.dms.java.exam;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

/**
 * @author dongms
 * @version V1.0
 * @Package com.dms.java.exam
 * @description 说明：
 * @date 2020/11/9 14:02
 */
public class Test {

    public static void main(String[] args) {
        Date date = new Date(System.currentTimeMillis());
        System.out.println(date);
    }

    public static void test1(){
        List myList = new ArrayList();
    }

    public static void test2(){
        int i = 0xFFFFFFF1;
        System.out.println(i);
        int j = ~i;
        System.out.println(j);
    }

//    public static void test5(){
//        long 1 = 499;
//        int i = 4L;
//        float f = 1.1;
//        double d = 34.4;
//    }

    public static void test6(){
        String s = new String("hello");
        String t = new String("hello");
        char c[] = {'h','e','l','l','o'};

        System.out.println(s.equals(t));
        System.out.println(t.equals(c));
    }

}
