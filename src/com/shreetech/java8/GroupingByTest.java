package com.shreetech.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class GroupingByTest {

    public static void main(String[] args) {
        List<Card> cards = Arrays.asList(
                new Card(101L, 435345.67, "DEBIT", "Shrikant"),
                new Card(102L, 435345.56, "CREDIT", "Shubham"),
                new Card(103L, 45275.65, "DEBIT", "Akshay"),
                new Card(106L, 456268.86, "CREDIT", "Kotesh"),
                new Card(104L, 233568.65, "CREDIT", "Milind"),
                new Card(107L, 458335.68, "DEBIT", "Sagar"),
                new Card(105L, 234327.66, "DEBIT", "Kajal")
        );

        //Map<String, List<Card>> collect = cards.stream().collect(Collectors.groupingBy(Card::getCardType));
        //Map<String, List<Double>> collect = cards.stream().collect(Collectors.groupingBy(Card::getCardType, Collectors.mapping(Card::getCardLimit, Collectors.toList())));
        //Map<String, List<String>> collect = cards.stream().collect(Collectors.groupingBy(Card::getCardType, Collectors.mapping(Card::getCardHolder, Collectors.toList())));
        //Map<String, Long> collect = cards.stream().map(Card::getCardType).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        Map<String, Long> collect = cards.stream().collect(Collectors.groupingBy(Card::getCardType, Collectors.counting()));
        System.out.println(collect);

    }


}
