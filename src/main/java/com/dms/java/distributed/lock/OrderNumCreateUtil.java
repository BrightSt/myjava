package com.dms.java.distributed.lock;

/**
 * 生成订单号
 */
public class OrderNumCreateUtil {

    private static int number = 0;

    public String getOrdNumber(){
        return "\t 生成订单号："+(++number);
    }
}
