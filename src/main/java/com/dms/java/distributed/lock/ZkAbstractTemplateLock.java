package com.dms.java.distributed.lock;

import org.I0Itec.zkclient.ZkClient;

import java.util.concurrent.CountDownLatch;

public abstract class ZkAbstractTemplateLock implements ZkLock {

    public static final String ZKSERVER = "192.168.25.135:2181";
    public static final int ITME_OUT = 45 * 1000;

    protected String path = "/zklock0401";
    protected CountDownLatch countDownLatch = null;

    ZkClient zkClient = new ZkClient(ZKSERVER,ITME_OUT);

    @Override
    public void zKlock() {
        if (tryZklock()){
            System.out.println(Thread.currentThread().getName()+"\t 占用锁成功");
        }else{
            waitZkLock();
            zKlock();
        }
    }

    public abstract void waitZkLock();

    public abstract boolean tryZklock();
    /**
     * 解锁
     */
    @Override
    public void zKUnlock() {
        if (zkClient != null){
            zkClient.close();
        }
        System.out.println(Thread.currentThread().getName() + "\t 释放锁成功");
        System.out.println();
        System.out.println();
    }
}
