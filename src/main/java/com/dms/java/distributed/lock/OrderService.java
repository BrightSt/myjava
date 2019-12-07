package com.dms.java.distributed.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class OrderService {

    private OrderNumCreateUtil orderNumCreateUtil = new OrderNumCreateUtil();

    private ZkLock zkLock = new ZkDistributedLock();

    public void getOrdNumber(){
        try{
            zkLock.zKlock();
            System.out.println("获得编号--------->:"+orderNumCreateUtil.getOrdNumber());
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            zkLock.zKUnlock();
        }
    }

    // 单机版
//   private Lock lock = new ReentrantLock();
//    public String getOrdNumber(){
//        try {
//            lock.lock();
//            return orderNumCreateUtil.getOrdNumber();
//        }catch (Exception e){
//            e.printStackTrace();
//        }finally {
//            lock.unlock();
//        }
//        return "0";
//    }
}
