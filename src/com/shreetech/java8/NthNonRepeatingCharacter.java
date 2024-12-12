package com.shreetech.java8;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NthNonRepeatingCharacter {

    public static void main(String[] args) {
        String str = "aabvbbt";

        char[] chars = str.toCharArray();

        Map<Character, Integer> map = new LinkedHashMap<>();

        for(Character chr : chars){
            map.put(chr, map.containsKey(chr) ? map.get(chr) + 1 : 1);
        }

        Character key = map.entrySet().stream().filter(entry -> entry.getValue() == 1).skip(1).findFirst().get().getKey();
        System.out.println(key);

        String input = "Java articles are Awesome";
        input.chars().mapToObj(chr -> (char)chr).
                collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting())).
        entrySet().stream().filter(entry -> entry.getValue() == 1).map(Map.Entry::getKey).findFirst().ifPresent(System.out::println);

    }
}


