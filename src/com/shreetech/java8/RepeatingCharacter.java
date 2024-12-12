package com.shreetech.java8;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class RepeatingCharacter {

    public static void main(String[] args) {
        String str = "aabvbbt";

        char[] chars = str.toCharArray();

        Map<Character, Integer> map = new LinkedHashMap<>();

        for(Character chr : chars){
            map.put(chr, map.containsKey(chr) ? map.get(chr) + 1 : 1);
        }

       Set<Character> charas = map.entrySet().stream().filter(entry -> entry.getValue() > 1).map(Map.Entry::getKey).collect(Collectors.toSet());
        System.out.println(charas);

    }
}
