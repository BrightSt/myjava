package com.dms.java.java8.parametercode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author dongms
 * @version V1.0
 * @Package com.dms.java.java8.parametercode
 * @description 说明：
 * @date 2020/6/7 22:10
 */
public class AppleTestVersion2 {

    public static void main(String[] args) {

        List<Apple> appleList =  AppleList.AppleList();

        System.out.println(appleList);
        List<Apple> result = filterApples(appleList,new AppleGreenColorPredicate());

    }

    public static List<Apple> filterApples(List<Apple> inventory,ApplePredicate p) {
        List<Apple> result = new ArrayList<>();
        for (Apple apple : inventory){
            if (p.test(apple)){
                result.add(apple);
            }
        }
        System.out.println(result);
        return result;
    }
}
