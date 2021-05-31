package com.dms.java.java8;

import org.junit.Test;

import java.util.Arrays;

public class LambdaTest {

    @Test
    public void test1(){
        Arrays.asList("2","3","4").forEach((String e)-> {
            System.out.println(e);
            System.out.println("11");
        });
    }
}
