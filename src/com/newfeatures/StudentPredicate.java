package com.newfeatures;

import java.util.ArrayList;
import java.util.function.Predicate;

public class StudentPredicate {
    public static void main(String[] args) {
        ArrayList<Student> l = new ArrayList<>();
        l.add(new Student("Durga", 101));
        l.add(new Student("Ravi", 102));
        l.add(new Student("Shiva", 103));
        l.add(new Student("Adarsh", 104));
        l.add(new Student("Sagar", 105));
        Predicate<Student> predicate = s-> s.rollNumber>103;
        for (Student s1: l) {
            if(predicate.test(s1)) {
                System.out.println(s1.name + ":" + s1.rollNumber);
            }
        }
    }
}
class Student {
    String name;
    int rollNumber;
    Student(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }
}
