package com.dms.java.jvm.classloader;

public class ClassLoaderTest {
    public static void main(String[] args) {
        String o = new String();
        System.out.println(o.getClass().getClassLoader());
        //System.out.println(o.getClass().getClassLoader().getParent()); NullPointerException

        Car car = new Car();
        System.out.println(car.getClass().getClassLoader());
        System.out.println(car.getClass().getClassLoader().getParent());
        System.out.println(car.getClass().getClassLoader().getParent().getParent());

    }
}
