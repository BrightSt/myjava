package com.dms.java.common;

import java.sql.SQLOutput;
import org.apache.commons.collections4.ListUtils;
import org.apache.commons.lang3.StringUtils;

/**
 * @author dongms
 * @version V1.0
 * @Package com.dms.java.common
 * @description 说明：
 * @date 2020/6/17 13:53
 */
public class StringTest {

    public static void main (String[] args) {
//        toStringTest();
//        stringToArray();
//        testEmpty();
        StringValue();
    }

    public static void toStringTest(){
        Object a = null;

        System.out.println(String.valueOf(a));


    }

    public static void stringToArray(){
        String text = "";
//        String[] strings = StringUtils.split(text,",");

        String[] strings = org.apache.commons.lang3.StringUtils.split(text,",");

//        String[] strings = text.split(text);
        System.out.println(strings.length);
    }

    public static void testEmpty(){
        String str = null;
        String str1 = " ";
        String str2 = " 3";
        System.out.println(StringUtils.isEmpty(str));
        System.out.println(StringUtils.isBlank(str));

        System.out.println(StringUtils.isEmpty(str1));
        System.out.println(StringUtils.isBlank(str1));

        System.out.println(StringUtils.isEmpty(str2));
        System.out.println(StringUtils.isBlank(str2));
    }

    public static void StringValue(){
        System.out.println(StringUtils.valueOf(null));
    }
}
