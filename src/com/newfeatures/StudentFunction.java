package com.newfeatures;

import java.util.function.Function;
import java.util.function.Predicate;

public class StudentFunction {
    public static void main(String[] args) {
        Function<Students, String> function = s-> {
            int marks = s.marks;
            String grade = "";
            if (marks>=80) {
                grade = "A(Distinction)";
            }
            else if (marks>=60) {
                grade = "B(First Class)";
            }
            else if(marks>=50) {
                grade = "C(Second Class)";
            }
            else if(marks>=35) {
                grade = "D(Third Class)";
            }
            else {
                grade = "E(Fail)";
            }
            return grade;
        };
        Predicate<Students> predicate = s-> s.marks>=60;
        Students[] s = {new Students("Durga", 100),
                        new Students("Ravi", 65),
                        new Students("Shiva", 55),
                        new Students("Adarsh", 45),
                        new Students("sagar", 25),
        };
        for(Students s1: s) {
            if (predicate.test(s1)) {
                System.out.println("Student name: " + s1.name);
                System.out.println("Student marks: " + s1.marks);
                System.out.println("Student grade: " + function.apply(s1));
            }
        }
    }
}
class Students {
    String name;
    int marks;
    Students(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
}
