package com.shreetech.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentMapTest3 extends Thread{

    static Map<Integer, String> map = new HashMap<>();
    @Override
    public void run() {

        System.out.println("Child thread also iterating map");

        Set<Integer> set = map.keySet();
        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()) {
            Integer next = iterator.next();
            System.out.println("child thread iterating map and current entry is : " + next + ".. "+ map.get(next));

        }
    }

    public static void main(String[] args) throws InterruptedException {
        map.put(101, "A");
        map.put(102, "B");
        map.put(103, "C");

        var value = 9223372036854775807l;


        ConcurrentMapTest3 thread = new ConcurrentMapTest3();
        thread.start();

        Set<Integer> set = map.keySet();
        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()) {
            Integer next = iterator.next();
            System.out.println("Main thread iterating map and current entry is : " + next + ".. "+ map.get(next));

        }

        System.out.println(map);


    }
}
