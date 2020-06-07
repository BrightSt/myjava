package com.dms.java.java8.parametercode;

import javafx.application.Application;

import java.util.List;

/**
 * @author dongms
 * @version V1.0
 * @Package com.dms.java.java8.parametercode
 * @description 说明：利用lambda
 * @date 2020/6/7 23:18
 */
public class AppleTestVersion4 {

    public static void main(String[] args) {
        List<Apple> appleList = AppleList.AppleList();
        List<Apple> resultList =
                AppleTestVersion2.filterApples(appleList,(Apple apple) -> "red".equals(apple.getColor()));
    }

}
