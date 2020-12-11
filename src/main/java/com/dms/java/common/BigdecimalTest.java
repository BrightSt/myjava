package com.dms.java.common;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

/**
 * @author dongms
 * @version V1.0
 * @Package com.dms.java.common
 * @description 说明：Bigdecimal 相关测试
 * @date 2020/6/18 19:43
 */
public class BigdecimalTest {

    public static void main (String[] args) {

       // addTest();
//        divide();
        transfer(null);
    }

    public static void addTest(){
        BigDecimal b1 = new BigDecimal(4);
        BigDecimal b2 = new BigDecimal(10);

        System.out.println(b1.add(b2));
        System.out.println(b1);
    }

    /**
     * 精确计算除法结果，保留两位小数
     */
    public static void divide(){
        BigDecimal normalNumBigDecimal = new BigDecimal(0);
        BigDecimal totalNumBigDecimal = new BigDecimal(300);
        String score = normalNumBigDecimal.divide(totalNumBigDecimal, 4, BigDecimal.ROUND_DOWN)
                .multiply(new BigDecimal(100)).setScale(2, RoundingMode.DOWN).toString();
        System.out.println("score="+score);
    }


    public static void transfer(String str){
        new BigDecimal(str);
    }



}
