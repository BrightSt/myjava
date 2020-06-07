package com.dms.java.java8.parametercode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author dongms
 * @version V1.0
 * @Package com.dms.java.java8.parametercode
 * @description 说明：
 * @date 2020/6/7 22:23
 */
public class AppleList {

    public static List<Apple> AppleList(){
        List<Apple> appleList = new ArrayList<>();
        Apple apple1 = new Apple();
        apple1.setColor("red");
        apple1.setWeight(5);
        appleList.add(apple1);
        Apple apple2 = new Apple();
        apple2.setColor("blue");
        apple2.setWeight(4);
        appleList.add(apple2);
        Apple apple3 = new Apple();
        apple3.setColor("green");
        apple3.setWeight(1);
        appleList.add(apple3);

        return appleList;
    }
}
