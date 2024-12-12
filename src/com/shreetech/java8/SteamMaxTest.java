package com.shreetech.java8;

import java.util.*;

public class SteamMaxTest {

    public static void main(String[] args) {
        List<Student> students = DataProvider.getStudents();

        Optional<Student> max = students.stream().max(Comparator.comparing(Student::getScore));
        max.ifPresent(System.out::println);

        //students.stream().mapToInt(Student::getScore).max();

        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);

        myList.stream().max(Integer::compareTo).ifPresent(System.out::println);
    }

}
