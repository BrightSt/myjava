package com.dms.java.Collection;

import java.util.HashSet;

public class SetTest {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("w");
        System.out.println(hashSet.add("A"));
    }
}
