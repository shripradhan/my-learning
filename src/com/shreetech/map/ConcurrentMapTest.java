package com.shreetech.map;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentMapTest {

    public static void main(String[] args) {
        ConcurrentHashMap<String, String> concurrentHashMap = new ConcurrentHashMap<>();


        concurrentHashMap.put("code1", "Shrikant");
        concurrentHashMap.put("code2", "Rajesh");
        concurrentHashMap.putIfAbsent("code1", "Amol");

        System.out.println(concurrentHashMap);

    }
}
