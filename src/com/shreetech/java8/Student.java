package com.shreetech.java8;

public class Student {


    private int id;
    private String name;
    private String grade;
    private int score;

    public Student(Integer id, String name, String grade, Integer score) {
        this.id = id;
        this.name = name;
        this.grade = grade;
        this.score = score;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", grade='" + grade + '\'' +
                ", score=" + score +
                '}';
    }
}
