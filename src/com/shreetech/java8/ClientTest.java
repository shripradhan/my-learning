package com.shreetech.java8;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ClientTest {

    public static void main(String[] args) {

        int[] intArr = {1,2,3,4,5,6,7,8};
        IntStream intStream = Arrays.stream(intArr);
        intStream.forEach(System.out::println);

    }
}
