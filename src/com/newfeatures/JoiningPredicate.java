package com.newfeatures;

import java.util.function.Predicate;

public class JoiningPredicate {
    public static void main(String[] args) {
        int[] x = {5, 10, 15, 20 , 25, 30};
        Predicate<Integer> predicate1 = i-> i%2==0;
        Predicate<Integer> predicate2 = i-> i>10;
        //and(), or(), negate()
        System.out.println("The numbers which are even and greater than 10 are:");
        for(int x1: x) {
            if(predicate1.and(predicate2).test(x1)) {
                System.out.println(x1);
            }
        }
        System.out.println("The numbers which are even or greater than 10 are:");
        for(int x1: x) {
            if(predicate1.or(predicate2).test(x1)) {
                System.out.println(x1);
            }
        }
        System.out.println("The numbers which are not even are:");
        for(int x1: x) {
            if(predicate1.negate().test(x1)) {
                System.out.println(x1);
            }
        }
    }
}
