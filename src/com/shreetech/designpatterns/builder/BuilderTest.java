package com.shreetech.designpatterns.builder;

public class BuilderTest {

    public static void main(String[] args) {


        MenuItem menuItem =  MenuItem.builder().menuType("abc").build();
        System.out.println(menuItem);
    }
}
