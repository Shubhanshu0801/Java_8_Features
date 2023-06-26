package com.newfeatures;

import java.util.ArrayList;

public class MinimumAndMaximumValue {
    public static void main(String[] args) {
        ArrayList<Integer> l = new ArrayList<>();
        l.add(30);
        l.add(45);
        l.add(29);
        l.add(54);
        l.add(53);
        System.out.println(l);
        Integer minValue = l.stream().min((i1,i2)-> i1.compareTo(i2)).get();
        System.out.println(minValue);
        Integer maxValue = l.stream().max((i1, i2)-> i1.compareTo(i2)).get();
        System.out.println(maxValue);
    }
}
