package com.shreetech.java8;

import java.util.List;

public class DataProvider {

    public static List<Student> getStudents(){
        return List.of(new Student(1, "Shrikant", "A", 98),
                new Student(2, "Amol", "A", 89),
                new Student(4, "Akshay", "c", 45),
                new Student(3, "Vivan", "B", 60),
                new Student(5, "Ramesh", "A", 95),
                new Student(6, "Rohit", "A", 100),
                new Student(7, "Tushar", "D", 36));

    }
}
