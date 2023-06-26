package com.newfeatures;

import java.util.function.Predicate;

public class StringPredicate {
    public static void main(String[] args) {
        String[] s = {"Shubhanshu", "Ishani", "Himanshu", "Pawan"};
        Predicate<String> predicate = s1-> s1.length()%2==0;
        for (String s1: s) {
            if (predicate.test(s1)) {
                System.out.println(s1);
            }
        }
    }
}

