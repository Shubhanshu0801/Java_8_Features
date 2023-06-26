package com.newfeatures;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class IntegerStreams {
    public static void main(String[] args) {
        ArrayList<Integer> marks = new ArrayList<>();
        marks.add(70);
        marks.add(45);
        marks.add(10);
        marks.add(65);
        marks.add(20);
        marks.add(87);
        System.out.println(marks);
        List sortedList = marks.stream().sorted((i1,i2)-> (i1<i2)?1: (i1>i2)?-1:0).collect(Collectors.toList());
        System.out.println(sortedList);
    }
}
