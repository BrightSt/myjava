package com.dms.java.java8.parametercode;

/**
 * @author dongms
 * @version V1.0
 * @Package com.dms.java.java8.parametercode
 * @description 说明：
 * @date 2020/6/7 20:27
 */
public class Apple {
    private String color;
    private int weight;

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "color='" + color + '\'' +
                ", weight=" + weight +
                '}';
    }
}
