package com.dms.java.distributed.lock;

import org.I0Itec.zkclient.ZkClient;

public class ZkClientTest {



    public static void main(String[] args) {
        ZkClient zkClient = new ZkClient("192.168.25.135",45*1000);
        zkClient.createEphemeral("/node333");

        boolean b = zkClient.exists("/node333");
        System.out.println(b);
    }
}
