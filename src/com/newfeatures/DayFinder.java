package com.newfeatures;

import java.time.LocalDate;

public class DayFinder {
    public static void main(String[] args) {
        getDay(1995, 1, 8);
    }
    public static void getDay(int year,int month, int day) {
        LocalDate localDate = LocalDate.of(year, month, day);
        System.out.println(localDate.getDayOfWeek());
    }
}
