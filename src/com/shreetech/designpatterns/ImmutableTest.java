package com.shreetech.designpatterns;

import java.util.*;

class ImmutableSubject {

    private final String name;

    private final Integer age;

    private final List<String> hobbies;

    private final Map<String, String> mobileNos;

    public ImmutableSubject(String name, Integer age, List<String> hobbies, Map<String, String> mobileNos) {
        this.name = name;
        this.age = age;
        //this.hobbies = hobbies;
        //this.mobileNos = mobileNos;
        //this.hobbies = Collections.unmodifiableList(List.copyOf(hobbies));
        //this.mobileNos = Collections.unmodifiableMap(Map.copyOf(mobileNos)) ;
        //this.hobbies = List.copyOf(hobbies);
        //this.mobileNos = Map.copyOf(mobileNos);
        this.hobbies = Collections.unmodifiableList(hobbies);
        this.mobileNos = Collections.unmodifiableMap(mobileNos) ;
    }


    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public List<String> getHobbies() {
        return hobbies;
    }

    public Map<String, String> getMobileNos() {
        return mobileNos;
    }

    @Override
    public String toString() {
        return "ImmutableSubject{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", hobbies=" + hobbies +
                ", mobileNos=" + mobileNos +
                '}';
    }
}

final class ImmutableObject {
    private final String immutableString;
    private final Integer immutableInteger;
    private final List<String> immutableList;
    private final Map<String, String> immutableMap;

    // Constructor
    public ImmutableObject(String immutableString, Integer immutableInteger,
                           List<String> list, Map<String, String> map) {
        // Direct assignment for String and Integer (immutable types)
        this.immutableString = immutableString;
        this.immutableInteger = immutableInteger;

        // Defensive copy for collections
        this.immutableList = Collections.unmodifiableList(List.copyOf(list));
        this.immutableMap = Collections.unmodifiableMap(Map.copyOf(map));
    }

    // Getters
    public String getImmutableString() {
        return immutableString;
    }

    public Integer getImmutableInteger() {
        return immutableInteger;
    }

    public List<String> getImmutableList() {
        return immutableList;
    }

    public Map<String, String> getImmutableMap() {
        return immutableMap;
    }

    @Override
    public String toString() {
        return "ImmutableObject{" +
                "immutableString='" + immutableString + '\'' +
                ", immutableInteger=" + immutableInteger +
                ", immutableList=" + immutableList +
                ", immutableMap=" + immutableMap +
                '}';
    }
}


public class ImmutableTest{

    public static void main(String[] args) {

        List<String> hobbies = new ArrayList<>();
        hobbies.add("Playing Cricket");
        hobbies.add("Watching latest Movies");
        hobbies.add("Tracking");

        Map<String, String> mobileNos = new HashMap<>();
        mobileNos.put("Self Mobile", "546456456");
        mobileNos.put("Home Mobile", "534535435");

        ImmutableSubject immutableSubject = new ImmutableSubject("Shrikant", 30, hobbies, mobileNos);
        System.out.println(immutableSubject);

        hobbies.add("Horse Riding");
        hobbies.add("Walking");

        System.out.println(immutableSubject);

        mobileNos.put("Fathers Mobile", "9053485l");

        System.out.println(immutableSubject);

        immutableSubject.getHobbies().add("Studying");

        //--------------------------------------------------------------------------------//
//        ImmutableObject immutableObject = new ImmutableObject("Shrikant", 30, hobbies, mobileNos);
//        System.out.println(immutableObject);
//
//        immutableObject.getImmutableList().add("Horse Riding");
//        System.out.println(immutableObject);

    }
}
