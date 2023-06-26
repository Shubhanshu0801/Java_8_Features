package com.newfeatures;

import java.util.ArrayList;
import java.util.function.BiConsumer;

public class BiConsumerExample {
    public static void main(String[] args) {
        ArrayList<Teachers> l = new ArrayList<>();
        populate(l);
        BiConsumer<Teachers, Double> biConsumer = (t, d)-> t.salary = t.salary + d;
        for(Teachers t: l) {
            biConsumer.accept(t, 500.0);
        }
        for(Teachers t: l) {
            System.out.println("Teacher name: " + t.name);
            System.out.println("Teacher's Salary: " + t.salary);
            System.out.println();
        }
    }
    public static void populate(ArrayList<Teachers> l) {
        l.add(new Teachers("Anshu", 25000));
        l.add(new Teachers("Ishani", 24000));
    }
}
class Teachers {
    String name;
    double salary;
    Teachers(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
}
