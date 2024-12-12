package com.shreetech.java8;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SortMapTest {
    public static void main(String[] args) {

        Stream.of(4,6,4,8,4,8,9).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .forEach((k, v)->System.out.println(k+":"+v));

        Stream.of(4,6,4,7,3,8,3,8).map(Function.identity()).forEach(System.out::println);

    }
}
