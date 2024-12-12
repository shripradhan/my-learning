package com.shreetech.java8;

import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FindDuplicateTest {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(7);

        //Find distinct
        List<Integer> collect = list.stream().distinct().collect(Collectors.toList());
        System.out.println(collect);

        //Find Duplicate using set
        Set<Integer> set = new HashSet<>();
        List<Integer> collect1 = list.stream().filter(num -> !set.add(num)).collect(Collectors.toList());
        System.out.println(collect1);

        Set<Integer> set2 = new HashSet<>();
        Map<Integer, List<Integer>> collect2 = list.stream().collect(Collectors.groupingBy(Integer::valueOf));
        for(Map.Entry<Integer, List<Integer>> entry : collect2.entrySet()) {
            if (entry.getValue().size() > 1) {
                set2.add(entry.getKey());
            }
        }
        System.out.println(set2);

        List<Integer> collect3 = list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream().filter(entry -> entry.getValue() > 1).map(Map.Entry::getKey).collect(Collectors.toList());
        System.out.println(collect3);

    }
}
