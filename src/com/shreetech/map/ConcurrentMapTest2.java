package com.shreetech.map;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentMapTest2  extends Thread{

    static Map<Integer, String> map = new ConcurrentHashMap<>();
    @Override
    public void run() {
        try{
            Thread.sleep(4000);
        }catch (InterruptedException ie){

        }
        System.out.println("Child thread updating map");
        map.put(103, "c");
    }

    public static void main(String[] args) throws InterruptedException {
        map.put(101, "A");
        map.put(102, "B");

        ConcurrentMapTest2 thread = new ConcurrentMapTest2();
        thread.start();

        Set<Integer> set = map.keySet();
        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()) {
            Integer next = iterator.next();
            System.out.println("Main thread iterating map and current entry is : " + next + ".. "+ map.get(next));
            Thread.sleep(6000);
        }

        System.out.println(map);


    }
}
