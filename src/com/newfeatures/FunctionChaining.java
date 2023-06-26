package com.newfeatures;

import java.util.function.Function;

public class FunctionChaining {
    public static void main(String[] args) {
        Function<Integer, Integer> function1 = i-> 2*i;
        Function<Integer, Integer> function2 = i->i*i*i;
        System.out.println(function1.andThen(function2).apply(2));
        System.out.println(function1.compose(function2).apply(2));
    }
}
