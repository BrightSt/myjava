package com.dms.java.java8.parametercode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author dongms
 * @version V1.0
 * @Package com.dms.java.java8.parametercode
 * @description 说明：苹果仓库测试类
 * @date 2020/6/7 20:29
 */
public class AppleTestVersion1 {
    public static void main(String[] args) {
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

        System.out.println(appleList);

        //List<Apple> result1 = filterGreenApples(appleList);
        //List<Apple> result2 = filterAppleByColor(appleList,"blue");
        List<Apple> result3 = filterApplesByWeight(appleList,4);
    }

    /**
     * 需求1：筛选出绿色的苹果
     * @param inventory
     * @return
     */
    public static List<Apple> filterGreenApples(List<Apple> inventory){
        List<Apple> result = new ArrayList<>();
        for (Apple apple : inventory){
            if ("green".equals(apple.getColor())){
                result.add(apple);
            }
        }
        System.out.println(result);
        return result;
    }

    /**
     * 需求2 把颜色设置为参数，可以获取任意颜色的苹果
     * @param inventory
     * @param color
     * @return
     */
    public static List<Apple> filterAppleByColor(List<Apple> inventory,String color){
        List<Apple> result = new ArrayList<>();
        for (Apple apple : inventory){
            if (apple.getColor().equals(color)){
                result.add(apple);
            }
        }
        System.out.println(result);
        return result;
    }

    /**
     * 需求3： 按照苹果的重量进行筛选数据
     * @param inventory
     * @param weight
     * @return
     */
    public static List<Apple> filterApplesByWeight(List<Apple> inventory,int weight){
        List<Apple> result = new ArrayList<>();
        for (Apple apple : inventory){
            if (apple.getWeight() > weight){
                result.add(apple);
            }
        }
        System.out.println(result);
        return result;
    }


}
