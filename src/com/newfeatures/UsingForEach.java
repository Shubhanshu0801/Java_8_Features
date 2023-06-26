package com.newfeatures;

import java.util.ArrayList;
import java.util.function.Consumer;

public class UsingForEach {
    public static void main(String[] args) {
        ArrayList<Integer> l = new ArrayList<>();
        l.add(30);
        l.add(45);
        l.add(29);
        l.add(54);
        l.add(53);
        Consumer<Integer> c = i-> System.out.println("The square of each element: " + i*i);
        l.stream().forEach(c);
    }
}
