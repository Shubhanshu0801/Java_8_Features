package com.newfeatures;

import java.util.ArrayList;
import java.util.function.BiFunction;

public class BiFunctionExample {
    public static void main(String[] args) {
        ArrayList<Teacher> l = new ArrayList<>();
        BiFunction<String, String, Teacher> biFunction = (name, subject)-> new Teacher(name, subject);
        l.add(biFunction.apply("Anshu", "General Studies"));
        l.add(biFunction.apply("Ishani", "English"));
        for(Teacher t: l) {
            System.out.println("Teacher name: " + t.name);
            System.out.println("Teacher's subject : " + t.subject);
            System.out.println();
        }
    }
}
class Teacher {
    String name;
    String subject;
    Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }
}
