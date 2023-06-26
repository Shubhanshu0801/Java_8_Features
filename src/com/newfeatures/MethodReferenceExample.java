package com.newfeatures;
@FunctionalInterface
interface Addition {
    public void add(int a, int b);
}
public class MethodReferenceExample {
    public static void sum(int x, int y) {
        System.out.println("the sum is: " + (x+y));
    }
    public static void main(String[] args) {
        Addition addition = (a, b)->System.out.println(a+b);
        addition.add(10, 20);

        //functional interface add method is referring to class sum method.
        Addition  addition1 = MethodReferenceExample::sum;
        addition1.add(100, 200);
    }
}
