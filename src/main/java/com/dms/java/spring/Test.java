package com.dms.java.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext annotationConfigApplicationContext
                = new AnnotationConfigApplicationContext(Appconfig.class);

        System.out.println(annotationConfigApplicationContext.getBean(BeanTest.class));
    }
}
