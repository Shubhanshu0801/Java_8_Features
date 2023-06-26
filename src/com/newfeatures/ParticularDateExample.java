package com.newfeatures;

import java.time.*;

public class ParticularDateExample {
    public static void main(String[] args) {
        LocalDateTime dateTime = LocalDateTime.of(1995, Month.MAY, 12, 12,45);
        System.out.println(dateTime);
        System.out.println("After six months: " + dateTime.plusMonths(6));
        System.out.println("Before six months: " + dateTime.minusMonths(6));
    }
}
