package com.newfeatures;

import java.util.function.*;

public class ConsumerChaining {
    public static void main(String[] args) {
        Consumer<Movie> consumer1 = m-> System.out.println(m.name + " is ready to release");
        Consumer<Movie> consumer2 = m-> System.out.println(m.name + " is released");
        Consumer<Movie> consumer3 = m-> System.out.println(m.name + " is going to release next year");
        Movie m = new Movie("Fauda");
        consumer1.andThen(consumer2).andThen(consumer3).accept(m);
    }
}
class Movie {
    String name;
    Movie(String name) {
        this.name = name;
    }
}
