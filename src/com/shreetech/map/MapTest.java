package com.shreetech.map;

import java.util.HashMap;
import java.util.Map;

public class MapTest {

    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();
        map.put("a", "b");
        map.put("c", "d");

        System.out.println("After updating map ");
        map.put("c", "Shrikant");

        map.entrySet().forEach(System.out::println);


    }
}
