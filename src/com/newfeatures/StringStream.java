package com.newfeatures;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StringStream {
    public static void main(String[] args) {
        ArrayList<String> name = new ArrayList<>();
        name.add("Anshu");
        name.add("Ishani");
        name.add("Rohit");
        System.out.println(name);
        Comparator<String> c = (s1,s2)-> (s1.length()<s2.length())?-1:(s1.length()>s2.length())?1:0;
        List sortedList = name.stream().sorted(c).collect(Collectors.toList());
        System.out.println(sortedList);
    }
}
