package com.dms.java.java8.parametercode;

import java.util.List;

/**
 * @author dongms
 * @version V1.0
 * @Package com.dms.java.java8.parametercode
 * @description 说明：利用匿名内部类
 * @date 2020/6/7 23:08
 */
public class AppleTestVersion3 {

    public static void main(String[] args) {

        List<Apple> appleList = AppleList.AppleList();
        AppleTestVersion2.filterApples(appleList, new ApplePredicate() {
            @Override
            public boolean test(Apple apple) {
                return "red".equals(apple.getColor());
            }
        });
    }


}
