package com.dms.java.module.log;

import lombok.extern.slf4j.Slf4j;

/**
 * @author dongms
 * @version V1.0
 * @Package com.dms.java.module.log
 * @description 说明：
 * @date 2020/6/19 16:05
 */
@Slf4j
public class LogTest {

    public static void main (String[] args) {
        logTest();
    }

    public static void logTest(){
        log.error("my name is {} , my age is {}","dms","18");
    }

}
