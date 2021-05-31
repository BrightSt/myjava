package com.dms.java.common;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class StaticTest {

    private static final Map<String,Object> map = new HashMap<>();

    static {
        map.put("1",1);
        System.out.println("static");
    }

    @Test
    public void test1(){
        System.out.println(map);
        System.out.println("test1");
    }
}
