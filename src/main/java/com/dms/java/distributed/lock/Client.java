package com.dms.java.distributed.lock;

/**
 * 分布式锁实现
 */
public class Client {

    public static void main(String[] args) {
        for (int i=1;i<=200;i++){
            new Thread(()->{
                new OrderService().getOrdNumber();
            },String.valueOf(i)).start();
        }
    }
}
