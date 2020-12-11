package com.dms.java.java8.parametercode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author dongms
 * @version V1.0
 * @Package com.dms.java.java8.parametercode
 * @description 说明：将list类型抽象化
 * @date 2020/6/13 0:08
 */
public class AppleTestVersion5 {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("1","2","4");
        filter(list,(String str) -> str.equals("2"));
    }

    public static <T> List<T> filter(List<T> list,Predicate<T> p){
        List<T> result = new ArrayList<>();
        for (T e : list){
            if (p.test(e)){
                result.add(e);
            }
        }
        System.out.println(result);
        return result;
    }
}
