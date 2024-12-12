package com.shreetech.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DistinctTest {

    public static void main(String[] args) {
        List<Integer> al = Arrays.asList(1,3,2,4,3,1,2);
        al.stream().distinct().sorted(Collections.reverseOrder()).forEach(System.out::println);
    }
}
