package com.shreetech.java8;

import java.util.HashMap;
import java.util.Map;

public class MapTest {

    public static void main(String[] args) {
        Map<String, Long> map = new HashMap<>();
        map.put("Shrikant", 343423445443l);
        map.put("Akshay", 4534534543534l);
        map.put("Shubham", 453453453455l);
        map.put("Sagar", 3543534534534l);
        map.put("Vishal", 4543534534534l);
        map.put("Kotesh", 453434234253l);
        map.put("Tushar", 3423434324234l);


       for(Map.Entry<String, Long> mobileNo : map.entrySet()){
           System.out.println(mobileNo.getKey());
           System.out.println(mobileNo.getValue());
           System.out.println("===================");
       }

    }

}
